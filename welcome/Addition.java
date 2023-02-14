package welcome;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Integer: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter second Integer: ");
		int secondNumber = sc.nextInt();
		
		int total = firstNumber + secondNumber;
		
		System.out.println("The addition of " + firstNumber + " and " + secondNumber + " is " + total );
	}

}
