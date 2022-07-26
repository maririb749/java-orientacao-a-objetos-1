package entities;

public class SavingsAccount1 extends Account2 {

	private Double interestRate;

	public SavingsAccount1() {
		super();

	}

	public SavingsAccount1(Integer number, String holder, Double balance, Double interestRate) {
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
	 * Operação para atualizar o saldo com base na taxa de juros.
	 */

	public void updateBalance() {
		balance += balance * interestRate;

	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
