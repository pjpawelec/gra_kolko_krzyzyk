package gra.main;

public class ScoreCounter {

	int moveCounter = 2, totalMoves = 0;

	public int gameRound() {
		moveCounter = moveCounter + 1;
		int evenOrOdd = moveCounter % 2;
		totalMoves++;
		return evenOrOdd;
	}
	
	public void reset() {
		moveCounter = 2;
		totalMoves = 0;
	}

}