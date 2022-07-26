package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account1;
import entities.BusinessAccount1;
import entities.SavingsAccount;


public class Upcasting_downcasting {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account1 acc = new Account1(1001, "Alex", 0.0);
		BusinessAccount1 bacc = new BusinessAccount1(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account1 acc1 = bacc;
		Account1 acc2 = new BusinessAccount1(1003, "Bob", 0.0, 200.0);
		Account1 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		//DOWNCASTING
		
		BusinessAccount1 acc4 = (BusinessAccount1)acc2;
		acc4.loan(100.00);
		
		//BusinessAccount1 acc5 = (BusinessAccount1)acc3;
		
		if(acc3 instanceof BusinessAccount1) {
			BusinessAccount1 acc5 = (BusinessAccount1) acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		
		
		sc.close();
	}

}
