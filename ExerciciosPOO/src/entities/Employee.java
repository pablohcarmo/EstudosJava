package entities;

public class Employee {
	public String name;
	public double GrossSalary, Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += (GrossSalary * percentage) / 100;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f ", NetSalary());
	}
}