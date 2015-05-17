package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class King extends LinearPiece {

    public King(Square sq, Colors color, Chess chess){
        super(sq.clone(), color,chess);
    }

    public boolean canTravel(Square square) {
        return (square.isValid() &&
                !this.square.equals(square) &&
                this.square.getKingDistance(square) == 1 &&
                this.isFreeLane(square));
    }

}
