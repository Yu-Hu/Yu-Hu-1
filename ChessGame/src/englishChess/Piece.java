package englishChess;

import java.util.List;

public abstract class Piece {
	protected int x, y, type, player;
	protected boolean isAlive;
	protected List<Moves> listOfMoves;
	
	public Piece(int x, int y, int type, int player) {
		this.x = x;
		this.y = y;
		this.type = type;
		this.player = player;
	} 

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public List<Moves> getListOfMoves() {
		return listOfMoves;
	}

	public void setListOfMoves(List<Moves> listOfMoves) {
		this.listOfMoves = listOfMoves;
	}

	public void printListOfMoves() {
		System.out.print("Not yet implemented");
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
