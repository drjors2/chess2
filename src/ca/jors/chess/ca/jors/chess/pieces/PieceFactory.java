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

    public PieceFactory(Chess ches){
        this.chess = chess;
    }


    public  Piece makePiece(String pos, Colors color, Pieces piece){
        return makePiece(new Square(pos), color, piece);
    }

    public Piece makePiece(Square sq, Colors color, Pieces piece){
        Piece p;
        switch(piece){
            case EMPTY:
                break;
            case KING:
                return new King(sq, color, chess);
            case QUEEN:
                return new Queen(sq, color, chess);

            case ROOK:
                break;
            case KNIGHT:
                break;
            case BISHOP:
                return new Bishop(sq, color, chess);
            case PAWN:
                break;
        }
        return new Bishop(sq,color,chess );//new Piece(piece,sq);
    }

}
