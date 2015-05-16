package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.NeedFreeLane;
import ca.jors.chess.objects.Piece;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class Bishop extends Piece implements NeedFreeLane{
    public Bishop(Square sq, Colors color, Chess chess){
        super(sq.clone(), color,chess);
    }

    @Override
    public boolean canTravel(Square sq) {
        return (super.canTravel(sq) &&
                (Math.abs(this.square.x - sq.x) == Math.abs(this.square.y - sq.y) &&
                this.square.x != sq.x )
        );
    }


    @Override
    public boolean isFreeLane(Square other) {
        if (this.square.equals(other)) return true;
        Square direction = this.square.getDirection(other);
        return isFreeLane2(this.square.clone().add(direction),other,direction);

    }

    private boolean isFreeLane2(Square from,Square other, Square direction){
    }
}
