package array;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] grades =  {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		GradeBook gradeBook = new GradeBook("Java Programming", grades);
		System.out.printf("Welcome to the grade book for%n%s%n%n",gradeBook.getCourseName());gradeBook.processGrades();
	}

}
