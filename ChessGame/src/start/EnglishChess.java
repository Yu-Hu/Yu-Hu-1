package start;

import java.util.ArrayList;

import englishChess.*;

public class EnglishChess {
	private Board board;
	private int turn, player; 
	
	public EnglishChess() {
		initialize();
		//test();
		board.printout();
		//runGame();
	}
	
	public void initialize() {
		ArrayList<Piece> White = new ArrayList<Piece>();
		ArrayList<Piece> Black = new ArrayList<Piece>();
		board = new Board();
		
		King king = new King(0, 0, 0, 1);
		board.setPiece(0, 0, king);
	}
}
