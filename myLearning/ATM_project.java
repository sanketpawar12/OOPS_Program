package my_learning;

import java.util.Scanner;

public class ATM_project {
	
	private double balance;
	
	private Scanner scanner;
	
	public ATM_project() {
		balance = 1000.0; //initial balance
		scanner = new Scanner(System.in);
	}
	
	public void displayMenu() {
		// to show the entry options to the user
		System.out.println("ATM Menu");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		
	}
	
	public void checkBalance() {
		System.out.println("Your balance is $"+balance);
	}
	
	public void deposit() {
		System.out.println("Enter the amount to deposit: $");
		double amount = scanner.nextDouble();
		if(amount > 0) {
			balance += amount;
			System.out.println("$" + amount + " has been deposited");
		}
		else {
			System.out.println("Invalid amount please add positive value");
		}
	}
	
	public void withdraw() {
		System.out.println("Enter the amount to withdraw: $");
		double amount = scanner.nextDouble();
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("$" + amount + "has been withdrawn");
		} else if(amount > balance) {
			System.out.println("Insufficient funds. Your balance is $" + balance);
		} else {
			System.out.println("Invalid amount, please enter a positive value");
		}
	}
	
	
	public static void main(String[] args) {
		ATM_project atm = new ATM_project();
		
		while(true) {
			
			atm.displayMenu();
			System.out.println("Enter your choice:");
			int choice = atm.scanner.nextInt();
			
			switch(choice) {
			case 1: 
				atm.checkBalance();
				break;
			case 2:
				atm.deposit();
				break;	
			case 3: 
				atm.withdraw();
				break;
			case 4:
				System.out.println("Thank you for using ATM, Good Bye");
				break;
			default:
				System.out.println("Invalid choice, please select a valid option");
			}	
	  }
   }
}
