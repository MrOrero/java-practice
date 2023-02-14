package welcome;

import java.security.SecureRandom;

public class Craps {
	
	private enum Status {CONTINUE, WON, LOST};

	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myPoint = 0;
		Status gameStatus;
		int myRoll = rolldice();
		
		switch (myRoll) {
			case SEVEN: // win with 7 on first roll
			case YO_LEVEN: // win with 11 on first roll
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: // lose with 2 on first roll
			case TREY: // lose with 3 on first roll
			case BOX_CARS: // lose with 12 on first roll
				gameStatus = Status.LOST;
				break;
			default: // did not win or lose, so remember point
				gameStatus = Status.CONTINUE; // game is not over
				myPoint = myRoll; // remember the point
				System.out.printf("Point is %d%n", myPoint);
				break;
		}
		
		while(gameStatus == Status.CONTINUE) {
			int nextRoll = rolldice();
			if(nextRoll == 7) {
				gameStatus = Status.LOST;
			}
			if(nextRoll == myPoint) {
				gameStatus = Status.WON;
			}
		}
		
		// display won or lost message
		if (gameStatus == Status.WON) {
			System.out.println("Player wins");
		}else {
			System.out.println("Player loses");
		}
	}

	public static int rolldice() {
		SecureRandom randomNumbers = new SecureRandom();
		int firstRoll = 1 + randomNumbers.nextInt(6);
		int secondRoll = 1 + randomNumbers.nextInt(6);
		
		int rollSum = firstRoll + secondRoll;
		System.out.printf("Player rolled %d + %d = %d%n", firstRoll, secondRoll, rollSum);
		return rollSum;
	}
}
