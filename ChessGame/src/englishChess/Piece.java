package englishChess;

import java.util.List;

public abstract class Piece {
	protected int xPos, yPos;
	protected int pType;
	protected int pNumber;
	protected boolean isAlive;
	protected List<Moves> listOfMoves;
	
	public Piece(int x, int y, int type, int player) {
		int xPos = x;
		int yPos = y;
		int pType = type;
		int pNumber = player;
	}

	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getpType() {
		return pType;
	}

	public void setpType(int pType) {
		this.pType = pType;
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
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
}
