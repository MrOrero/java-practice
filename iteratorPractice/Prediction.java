package iteratorPractice;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Prediction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int correctPrediction = ThreadLocalRandom.current().nextInt(1, 21);
		System.out.println("correct prediction is " + correctPrediction);
		
		System.out.println("Enter your prediction");
		int prediction = 0;
		
		while(prediction != correctPrediction) {
			prediction = sc.nextInt();
			if(prediction <= 0) {
				System.out.println("Get out");
				break;
			}
			else if(prediction < correctPrediction) {
				System.out.println("Your guess is lower than the correct prediction, Enter another number");
			}
			else if(prediction > correctPrediction) {
				System.out.println("Your guess is higher than the correct prediction, Enter another number");				
			}
		}
			System.out.println("Correct guess");
	}
}
