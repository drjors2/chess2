package ca.jors.chess.ca.jors.chess.pieces;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.enums.Pieces;
import ca.jors.chess.objects.Piece;
import ca.jors.chess.objects.Square;

/**
 * Created by djors on 16/05/15.
 */
public class PieceFactory {

    Chess chess ;

    public PieceFactory(Chess chess) {
        this.chess = chess;
    }


    public  Piece makePiece(String pos, Colors color, Pieces piece){
        return makePiece(new Square(pos), color, piece);
    }

    public Piece makePiece(Square sq, Colors color, Pieces piece){
        Piece p;
        switch(piece){
            case EMPTY:
                return null;
            case KING:
                return new King(sq, color, this.chess);
            case QUEEN:
                return new Queen(sq, color, this.chess);
            case ROOK:
                return new Rook(sq, color, this.chess);
            case KNIGHT:
                return new Knight(sq, color, this.chess);
            case BISHOP:
                return new Bishop(sq, color, this.chess);
            case PAWN:
                break;
        }
        return new Bishop(sq, color, this.chess);//new Piece(piece,sq);
    }

}
