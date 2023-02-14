import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		System.out.println("The maximum number is " + maximum(num1, num2, num3));
	}
	
	
	public static double maximum (double num1, double num2, double num3) {
		double maximumValue = num1;
		
		if(num2 > maximumValue) {
			maximumValue = num2;
		}

		if(num3 > maximumValue) {
			maximumValue = num3;
		}
		
		return maximumValue;
	}

}
