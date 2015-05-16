package ca.jors.chess.objects;

import ca.jors.chess.enums.Colors;
import ca.jors.chess.enums.Pieces;

public interface Constants {

	String NOTATION_X = "abcdefgh";
	String NOTATION_Y = "12345678";

    //String[] DIRECTIONS_QUEEN = {"N","NE"};

    byte BOARD_SIZE = 8; // both x and y are the same

    Object[][] BOARDPIECES = {
            {Pieces.ROOK, Colors.WHITE,"a1"},
            {Pieces.KNIGHT, Colors.WHITE,"b1"},
            {Pieces.BISHOP, Colors.WHITE,"c1"},
            {Pieces.QUEEN, Colors.WHITE,"d1"},
            {Pieces.KING, Colors.WHITE,"e1"},
            {Pieces.BISHOP, Colors.WHITE,"f1"},
            {Pieces.KING, Colors.WHITE,"g1"},
            {Pieces.PAWN, Colors.WHITE,"a2"},
            {Pieces.PAWN, Colors.WHITE,"b2"},
            {Pieces.PAWN, Colors.WHITE,"c2"},
            {Pieces.PAWN, Colors.WHITE,"d2"},
            {Pieces.PAWN, Colors.WHITE,"e2"},
            {Pieces.PAWN, Colors.WHITE,"f2"},
            {Pieces.PAWN, Colors.WHITE,"g2"},
            {Pieces.PAWN, Colors.WHITE,"h2"},
    };
}
