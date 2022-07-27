package application;

import entities.Account2;
import entities.SavingsAccount1;

public class Sobreposicao {

	/*
	 * Suponha que a opera��o de saque possui uma taxa no valor de 5.0 Entretanto,
	 * se a conta for do tipo poupan�a, esta taxa n�o deve ser cobrada.
	 * 
	 * Como resolver isso? Sobrescrevendo o m�todo withdraw na subclasse
	 * SavingsAccount1.
	 */

	public static void main(String[] args) {

		Account2 x = new Account2(1020, "Alex", 1000.0);
		Account2 y = new SavingsAccount1(1023,"Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	
	}

}
