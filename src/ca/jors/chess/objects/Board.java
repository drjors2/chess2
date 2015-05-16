package ca.jors.chess.objects;

/**
 * Created by djors on 16/05/15.
 */
public class Board{
    public Square[][] squares;
    public Piece[][] pieces;
    public Board(int dimensions){
                this.squares = new Square[dimensions][dimensions];
                this.pieces = new Piece[dimensions][dimensions];
            }
    public Piece getPiece(Square sq){
        return pieces[sq.x][sq.y];
    }


}
