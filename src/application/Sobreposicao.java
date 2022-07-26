package application;

import entities.Account2;
import entities.BusinessAccount2;
import entities.SavingsAccount1;

public class Sobreposicao {

	/*
	 * Suponha que a operação de saque possui uma taxa no valor de 5.0 Entretanto,
	 * se a conta for do tipo poupança, esta taxa não deve ser cobrada.
	 * 
	 * Como resolver isso? Sobrescrevendo o método withdraw na subclasse
	 * SavingsAccount1.
	 */

	public static void main(String[] args) {

		Account2 acc1 = new Account2(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account2 acc2 = new SavingsAccount1(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
	
	    Account2 acc3 = new BusinessAccount2(1003, "Bob", 1000.0, 500.0);
	    acc3.withdraw(200.0);
	    System.out.println(acc3.getBalance());
	
	}

}
