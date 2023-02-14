package interest;

public class BasePlusCommissionEmployeeComposition {
	private double baseSalary; // base salary per week
	private CommissionEmployee employee;
	
	public BasePlusCommissionEmployeeComposition(CommissionEmployee employee, double baseSalary) {
		// if baseSalary is invalid throw exception
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
		this.employee = employee;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base say must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
	// return base salary
	public double getBaseSalary() {return baseSalary;}

	public double earnings() {
		// not allowed: commissionRate and grossSales private in superclass
		return baseSalary + (employee.getCommissionRate() * employee.getGrossSales());
	}
	
	public String toString() {
		 return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
		 "commission employee", employee.getFirstName(), employee.getLastName(),
		 "social security number", employee.getSocialSecurityNumber(),
		 "gross sales", employee.getGrossSales(),
		 "commission rate", employee.getCommissionRate());
	 }
}
