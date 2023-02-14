package composition;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date birthDate = new Date(2,4,2002);
		Date hireDate = new Date(3,1,2023);
		
		Employee employee = new Employee("orero", "ozore", birthDate, hireDate);
		
		System.out.print(employee);
		
	}

}
