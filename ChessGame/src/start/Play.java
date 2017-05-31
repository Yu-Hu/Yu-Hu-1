package start;

import java.util.ArrayList;

import englishChess.*;

public class Play {
	private Board board;
	private int turn, player;
	
	public Play() {
		EnglishChess eChess = new EnglishChess();
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
