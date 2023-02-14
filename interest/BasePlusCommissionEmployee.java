package interest;


public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary; // base salary per week
// six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName,String socialSecurityNumber, double grossSales,double commissionRate, double baseSalary) {
		// explicit call to superclass CommissionEmployee constructor
		super(firstName, lastName, socialSecurityNumber,grossSales, commissionRate);
		// if baseSalary is invalid throw exception
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
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
	// calculate earnings
	@Override
	public double earnings() {
		// not allowed: commissionRate and grossSales private in superclass
		return baseSalary + super.earnings();
	}
	// return String representation of BasePlusCommissionEmployee
	@Override
	public String toString() {
		// not allowed: attempts to access private superclass members
		return String.format("%s %s%n%s: %.2f","base-salaried", super.toString(), "base salary", getBaseSalary());
	}
}
