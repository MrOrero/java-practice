package account;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Account myAccount1 = new Account("Orero", 5.0);
		Account myAccount2 = new Account("Princess", 10.0);
		
		displayAccount(myAccount1);
		displayAccount(myAccount2);
				
		//set new account name
		System.out.print("Enter account 1 name: ");
		String account1Name = sc.nextLine();
		myAccount1.setName(account1Name);
		
		System.out.print("Enter account 2 name: ");
		String account2Name = sc.nextLine();
		myAccount2.setName(account2Name);
		
		
		// Deposit into account
		System.out.println("Enter amount to deposit into account 1: ");
		double amount1 = sc.nextDouble();
		myAccount1.deposit(amount1);
		
		System.out.println("Enter amount to deposit into account 2: ");
		double amount2 = sc.nextDouble();
		myAccount2.deposit(amount2);
		
		
		//display updated account details
		displayAccount(myAccount1);
		displayAccount(myAccount2);
		
	}
	
	public static void displayAccount(Account obj) {
		System.out.println("Account name is "+ obj.getName());
		System.out.println("Account balance is "+ obj.getBalance());
	}


}
