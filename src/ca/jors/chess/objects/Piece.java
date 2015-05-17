package ca.jors.chess.objects;

import ca.jors.chess.Chess;
import ca.jors.chess.enums.Colors;
import ca.jors.chess.enums.Pieces;

public abstract class Piece {
    public Chess chess;

	public Square square;
	public Pieces piece ;
	public Colors color;

    public Piece(Square sq, Colors color,Chess chess){
        this.square = sq.clone();
        this.color = color;
        this.chess = chess;
    }

    public abstract boolean canTravel(Square square);

}
