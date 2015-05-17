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
                ( // either bishop move
                        (Math.abs(this.square.x - this.square.x) == Math.abs(this.square.y - this.square.y) && // check 45 degree travel
                                this.square.x != this.square.x)
                                || // or rook move
                                ((Math.abs(this.square.x - square.x) > 0) && (this.square.y - square.y == 0)) ||
                                ((this.square.x - square.x == 0) && (Math.abs(this.square.y - square.y) > 0))) &&
                this.isFreeLane(this.square)
        );
    }


}
