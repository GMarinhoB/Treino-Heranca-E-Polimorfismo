package util;

public class Employee {
	
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public String getName() {
		return name;
	}
	public Integer getHours() {
		return hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public Double payment() {
		return hours*valuePerHour;
	}
	
	public String toString() {
		return name+ " - $ " +String.format("%.2f", payment());
	}
	
}
