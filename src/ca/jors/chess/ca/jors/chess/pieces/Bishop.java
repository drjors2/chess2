package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class Bishop extends LinearPiece {
    public Bishop(Square sq, Colors color, Chess chess){
        super(sq.clone(), color,chess);
    }

    public boolean canTravel(Square square) {
        return this.square.isValid() &&
                this.square.isSameDiagonal(square) &&
                this.square.x != square.x &&
                this.isFreeLane(square);
    }
}
