package entities;

public class SavingsAccount extends Account1 {

	private Double interestRate;

	public SavingsAccount() {
		super();

	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	/*
	 * Opera��o para atualizar o saldo com base na taxa de juros.
	 */

	public void updateBalance() {
		balance += balance * interestRate;

	}
}
