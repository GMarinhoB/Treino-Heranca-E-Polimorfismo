package util;

public class OutsorcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + (1.1* additionalCharge);
	}

	@Override
	public String toString() {
		return name+ " - $ " +String.format("%.2f", payment());
	}
	
	
	
}
