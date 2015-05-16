package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.Piece;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class Queen extends Piece{
    public Queen(Square sq, Colors color, Chess chess){
        super(sq.clone(), color,chess);
    }

    @Override
    public boolean canTravel(Square sq) {
        return ( super.canTravel(sq)               );
    }

    public String getTravelDirection(Square sq){
        if (this.square.equals(sq)) return null; // no travel
        return null;
    }

}
