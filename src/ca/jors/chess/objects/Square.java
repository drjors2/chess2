package ca.jors.chess.objects;

public class Square implements Cloneable{
	public int x;
	public int y;
	
	public Square(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Square(String pos){
		this.x = Constants.NOTATION_X.indexOf(pos.toCharArray()[0]);
		this.y = Constants.NOTATION_Y.indexOf(pos.toCharArray()[1]);
	}

	public String toString(){
		return Constants.NOTATION_X.substring(this.x,this.x+1) +
				Constants.NOTATION_Y.substring(this.y,this.y+1);
	}

	public boolean isValid(){
		return (this.x >= 0) &&
				(this.y >= 0) &&
				(this.x < Constants.BOARD_SIZE) &&
				(this.y < Constants.BOARD_SIZE);
	}

	public boolean equals(Square sq){
		return this.x == sq.x && this.y == sq.y;
	}

	public Square clone(){
		return new Square(this.x , this.y);
	}

	public Square add(Square sq){
		this.x += sq.x;
		this.y += sq.y;
		return this;
    }

    public Square neg() {
        this.x = -this.x;
		this.y = -this.y;
		return this;
	}

    public Square flip() {
        int t = this.x;
        this.x = this.y;
        this.y = t;
        return this;
    }

	public Square getDirection(Square other){
		return new Square(
				(int)(Math.signum(other.x - this.x)),
				(int)(Math.signum(other.y - this.y))
		);
	}

    public boolean isSameRow(Square other) {
        return (this.x == other.x);
    }

    public boolean isSameColumn(Square other) {
        return (this.y == other.y);
    }

    public boolean isSameDiagonal(Square other) {
        return (Math.abs(this.x - other.x) == Math.abs(this.y - other.y));
    }

    public int getKingDistance(Square other) {
        return Math.max(Math.abs(this.x - other.x), Math.abs(this.y - other.y));
    }
}
