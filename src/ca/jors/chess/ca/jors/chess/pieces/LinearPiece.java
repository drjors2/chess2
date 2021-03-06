package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.NeedFreeLane;
import ca.jors.chess.objects.Piece;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public abstract class LinearPiece extends Piece implements NeedFreeLane {
    public LinearPiece(Square sq, Colors color, Chess chess) {
        super(sq.clone(), color, chess);
    }

    @Override
    // this works for bishop
    public boolean isFreeLane(Square other) {
        if (this.square.equals(other)) return true;
        Square direction = this.square.getDirection(other);
        return isFreeLane2(this.square.clone().add(direction), other, direction);
    }

    private boolean isFreeLane2(Square from, Square other, Square direction) {
        Piece piece = chess.board.getPiece(from);

        if (from.equals(other)) //at the end of the road
        {
            if (piece == null) return true; // empty position
            return piece.color != this.chess.currentPlayer;
        } else { //not at the end of the road
            if (piece != null) return false; // any piece invalidate moves;
            return isFreeLane2(from.clone().add(direction), other, direction); // recurse
        }

    }
}
