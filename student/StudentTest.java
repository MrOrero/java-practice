package student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("joshua", 50);
		
		// display initialized values
		System.out.println("Student name is " + student.getName());
		System.out.println("Student average is " + student.getAverage());
		
		//set name and average
		student.setName("Orero");
		student.setAverage(80);
		
		System.out.println("Student name is " + student.getName());
		System.out.println("Student average is " + student.getAverage());
		
		// Get grade
		System.out.println("Student grade is " + student.getGrade());
		
		
	}

}
