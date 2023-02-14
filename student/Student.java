package student;

public class Student {
	private String name;
	private double average;
	
	public Student(String name, double average) {
		this.name = name;
		
		if(average > 0.0 && average <=100) {
			this.average = average;			
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAverage(double average) {
		if(average > 0.0 && average <=100) {
			this.average = average;			
		}
	}
	
	public double getAverage() {
		return average;
	}
	
	public String getGrade() {
		String grade = "";
		if(average >= 80 && average <= 100) {
			grade = "A";
		}
		else if(average >= 60 && average < 80) {
			grade = "B";
		}
		else if(average >= 50 && average < 60) {
			grade = "C";
		}else if(average >= 0 && average < 50) {
			grade = "D";
		}
		else {
			grade = "incorrect average";
		}
		
		return grade;
	}
	
	

}
