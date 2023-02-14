package array;

public class GradeBook {
	private int [] grades;
	private String course;
	
	public GradeBook(String course, int [] grades) {
		this.course = course;
		this.grades = grades;
	}
	
	public void setCourseName(String courseName) {
		this.course = courseName;
	}
	
	public String getCourseName() {
		return course;
	}
	
	public void processGrades() {
		outputGrades();
		System.out.println("The average is " + calculateAverage());
		System.out.println("The lowest grade is " + calculateLowestGrade());
		System.out.println("The highest grade is " + calculateHighestGrade());
	}
	
	public void outputGrades() {
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Student " + (i+1) + ": " + grades[i]);			
		}
	}
	
	public double calculateAverage() {
		int total = 0;
		double average = 0;
		for(int grade: grades) {
			total += grade;
		}
		average = (double)total/grades.length;
		return average;
	}
	
	public int calculateLowestGrade() {
		int lowestGrade = grades[0];
		for(int grade : grades) {
			if(grade < lowestGrade) {
				lowestGrade = grade;
			}
		}
		return lowestGrade;
	}
	
	public int calculateHighestGrade() {
		int highestGrade = grades[0];
		for(int grade : grades) {
			if(grade > highestGrade) {
				highestGrade = grade;
			}
		}
		return highestGrade;
	}
	
	
	
}

