package welcome;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter grade");
		while(i <= 10) {
			double grade = sc.nextDouble();
			total = total + grade;
			i++;
		}
		double average = total/10;
		System.out.println("Average is " + average);
	}

}
