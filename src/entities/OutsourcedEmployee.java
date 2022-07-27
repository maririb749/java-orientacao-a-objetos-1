package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	/*
	 * regra para pagamento de funcionário terceirizado diferente, sobrescreva a
	 * regra de pagamento da classe Employee,na classe de funcionáro terceirizado.
	 */
	
	@Override
	 public double payment() {
		return super.payment() + additionalCharge * 1.1;

	}

}
