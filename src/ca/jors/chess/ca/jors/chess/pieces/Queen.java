package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class Queen extends LinearPiece {
    public Queen(Square sq, Colors color, Chess chess) {
        super(sq.clone(), color, chess);
    }

    public boolean canTravel(Square square) {
        return (square.isValid() &&
                (!this.square.equals(square) &&
                        (this.square.isSameDiagonal(square) ||
                                this.square.isSameRow(square) ||
                                this.square.isSameColumn(square)) &&
                        this.isFreeLane(this.square))
        );
    }
}
