package iteratorPractice;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to calculate Factorial");
		int number = sc.nextInt();
		int factorial = 1;
		
		for(int i = number; i >=1 ; i--) {
			factorial *= i;		
		}
		System.out.println(factorial);
	}

}
