package composition;

public class Date {

	private int day;
	private int month;
	private int year;
	
	private static final int [] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(int day, int month, int year) {
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException("month must be from 1 to 12");
		}
		if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
			throw new IllegalArgumentException("out of range for the specified month");
		}
		// check for leap year if month is 2 and day is 29
		if (month == 2 && day == 29 && !(year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0))) {
			throw new IllegalArgumentException("day (" + day +") out-of-range for the specified month and year");
		}
		
		this.day = day;
		this.month = month;
		this.year = year;
		
		System.out.printf("Date object constructor for date %s%n", this);
	}
	
//	return a String of the form month/day/year
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}
