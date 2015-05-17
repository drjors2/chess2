package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class Rook extends LinearPiece {
    public Rook(Square sq, Colors color, Chess chess) {
        super(sq.clone(), color, chess);
    }

    public boolean canTravel(Square sq) {
        return (this.square.isValid() &&
                (((Math.abs(this.square.x - sq.x) > 0) && (this.square.y - sq.y == 0)) ||
                        ((this.square.x - sq.x == 0) && (Math.abs(this.square.y - sq.y) > 0))) &&
                (this.square.x != sq.x) &&
                this.isFreeLane(sq)
        );
    }
}
