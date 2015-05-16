package ca.jors.chess;

import ca.jors.chess.ca.jors.chess.pieces.PieceFactory;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.enums.Pieces;
import ca.jors.chess.objects.Board;
import ca.jors.chess.objects.Constants;
import ca.jors.chess.objects.Piece;
import ca.jors.chess.objects.Square;

import java.util.LinkedList;

public class Chess {
    public Colors currentPlayer = Colors.WHITE;
	public Board board = new Board(Constants.BOARD_SIZE);
    public PieceFactory pieceFactory;
    public LinkedList<Piece> pieces = new LinkedList<Piece>();

    public Chess() {
        this.pieceFactory = new PieceFactory(this);
        this.initPieces();
        this.placePieces();

    }

    public static void main(String[] args) {
        System.out.println("Happy World " + Pieces.KING);

        Chess chess = new Chess();

        System.out.println(chess.pieces.getFirst().canTravel(new Square(7, 7)));

        System.out.println(new Square(0, 0).toString());

        System.out.println(new Square("a1").toString());

    }

	public void initPieces(){
        int a =0;
        for ( Object[] o :  Constants.BOARDPIECES)
            pieces.add(pieceFactory.makePiece((String) o[2], (Colors) o[1], (Pieces) o[0]));
	}
	
    public void placePieces(){
        //cleanup first
        for (int x = 0; x < Constants.BOARD_SIZE; x++)
            for(int y = 0 ; y <Constants.BOARD_SIZE; y++)
                this.board.pieces[x][y]=null;
        //populate list
        for (Piece piece : pieces)
            this.board.pieces[piece.square.x][piece.square.y]=piece;
    }

    public Colors getOppositePlayer(){
        switch (this.currentPlayer){
            case WHITE:
                return Colors.BLACK;
            case BLACK:
                return Colors.WHITE;
        }
        return null;
    }
}
