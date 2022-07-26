package entities;

public class BussinesAccount extends Account {

	private Double loanLimit;

	public BussinesAccount() {
		super();

	}

	public BussinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
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
	 * suponha que para realizar um empr�stimo,
	 * � descontada uma taxa no valor de 10.0;
	 */

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
			

		}

	}

}
