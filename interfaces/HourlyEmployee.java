package interfaces;

public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName,String socialSecurityNumber, double hourlyWage, double hoursWorked) {
		super(firstName, lastName, socialSecurityNumber);
		
		if((hoursWorked < 0 || hoursWorked > 168) && hourlyWage < 0) {
			throw new IllegalArgumentException("hours worked out of bounds, hourly wage must be more than 0");
		}
		this.hoursWorked = hoursWorked;
		this.hourlyWage = hourlyWage;
		
	}
	
	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage < 0)  {
			throw new IllegalArgumentException("hourly wage must be more than 0");
		}
		this.hourlyWage = hourlyWage;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	
	public void setHoursWorked(double hoursWorked) {
		if(hoursWorked < 0 || hoursWorked > 168) {
			throw new IllegalArgumentException("hours worked out of bounds");
		}
		this.hoursWorked = hoursWorked;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	@Override
	public double earnings() {
		if (getHoursWorked() <= 40) { // no overtime
			return getHourlyWage() * getHoursWorked();
		}
		else {
			return 40 * getHourlyWage() + (getHoursWorked() - 40) * getHourlyWage() * 1.5;
	}
	}
	// return String representation of HourlyEmployee object
	@Override
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
		super.toString(), "hourly wage", getHourlyWage(),
		"hours worked", getHoursWorked());
	}
}
