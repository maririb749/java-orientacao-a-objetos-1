package entities;

public class BusinessAccount2 extends Account2 {

	private Double loanLimit;

	public BusinessAccount2() {
		super();

	}

	public BusinessAccount2(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	/*
	 * suponha que para realizar um empréstimo, é descontada uma taxa no valor de
	 * 10.0;
	 */

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}

	}

	/*
	 * Suponha que, nesta classe, a regra para saque seja realizar o saque
	 * normalmente da superclasse, e descontar mais 2.0.
	 */

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
