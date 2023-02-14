package welcome;

import java.util.Scanner;
public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = sc.nextInt();
		
		if(firstNumber == secondNumber) {
			System.out.println(firstNumber + " is equal to " + secondNumber);
		}
		if(firstNumber != secondNumber) {
			System.out.println(firstNumber + " is not equal to " + secondNumber);
		}
		if(firstNumber > secondNumber) {
			System.out.println(firstNumber + " is greater than " + secondNumber);
		}
		if(firstNumber < secondNumber) {
			System.out.println(firstNumber + " is less than " + secondNumber);
		}
		if(firstNumber >= secondNumber) {
			System.out.println(firstNumber + " is greater than or equal to " + secondNumber);
		}
		if(firstNumber <= secondNumber) {
			System.out.println(firstNumber + " is less than or equal to " + secondNumber);
		}
	}

}
