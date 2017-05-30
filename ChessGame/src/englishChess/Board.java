package englishChess;

import java.util.ArrayList;

// Creating English Chess Board 8 x 8
public class Board {
	// Creating a board made of piece
	private Piece[][] board;
	// Height(y) and width(x) of the board
	private int xSize = 8, ySize = 8;
	
	// 
	public Board (ArrayList<Piece> p1Pieces, ArrayList<Piece> p2Pieces){
		board = new Piece[xSize][ySize];
		for (Piece p : p1Pieces){ // Move all player1's pieces onto board
			board[p.getX()][p.getY()] = p;
		}
		for (Piece p : p2Pieces){ // Move all player2's pieces onto board
			board[p.getX()][p.getY()] = p;
		}
	}

	public int getWidth() {
		return ySize; 
	}
	
	public int getHeight() {
		return xSize; 
	}
	
	public void movePiece(int x1, int y1, int x2, int y2) {
		Piece p = board[x1][y1];
		board[x2][y2] = p;
		p.move(x2, y2);
		board[x1][y1] = null;
	}
	
	public void setPiece(int x, int y, Piece piece) {
		board[x][y] = piece;
	}
	
	public Piece getPiece(int x, int y) {
		return board[x][y];
	}
	
	public void printout() {
		System.out.print("  ");
		for (int j = 0; j < xSize; j++) {
			System.out.print(j + " ");
		}
		System.out.print("\n");
		for (int i = 0; i < xSize; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < ySize; j++) {
				if (board[i][j] == null) {
					System.out.print(". ");
				} else {
					System.out.print(board[i][j]+" ");
				}
			}
			System.out.print("\n");
		}
	}
	
	public int checkWin(){
		System.out.print("Not implemented");
		return 0;
	}
		
}

