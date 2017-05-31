package start;

import java.util.ArrayList;

import englishChess.*;

public class Play {
	private Board board;
	private int turn, player; 
	
	public Play() {
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
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		long start;
		long end;
		start = System.currentTimeMillis(); // Start timer
		Play game = new Play();
		end = System.currentTimeMillis(); // Stop Timer
		System.out.println("Time: " + (end-start) + "ms");
		
	}
}
