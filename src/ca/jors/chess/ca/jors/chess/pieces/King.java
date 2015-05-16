package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.Piece;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class King extends Piece{

    public King(Square sq, Colors color, Chess chess){
        super(sq.clone(), color,chess);
    }

    @Override
    public boolean canTravel(Square square) {
        return ( super.canTravel(square) &&
                Math.max(Math.abs(this.square.x - square.x ), Math.abs(this.square.y - square.y)) == 1);
    }

}
