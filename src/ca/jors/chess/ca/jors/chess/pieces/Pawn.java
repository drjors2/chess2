package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.NeedFreeLane;
import ca.jors.chess.objects.Piece;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public abstract class Pawn extends Piece implements NeedFreeLane {
    public Pawn(Square sq, Colors color, Chess chess) {
        super(sq.clone(), color, chess);
    }

    @Override
    // this works for bishop
    public boolean isFreeLane(Square other) {
        return square.isValid() &&
                !this.square.equals(other) &&
                ((Math.abs(this.square.x - other.x) == 1 &&
                        Math.abs(this.square.x - other.x) == 2) ||
                        (Math.abs(this.square.x - other.x) == 2 &&
                                Math.abs(this.square.x - other.x) == 1));

    }
}


// not touched yet.