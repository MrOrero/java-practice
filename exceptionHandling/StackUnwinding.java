package exceptionHandling;

public class StackUnwinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch (Exception exception) { // catch exception thrown in method1
			System.err.printf("%s%n%n",exception.getMessage());
			exception.printStackTrace();

			// obtain the stack-trace information
			StackTraceElement[] traceElements = exception.getStackTrace();
			
			System.out.printf("%nStack trace from getStackTrace:%n");
			System.out.println("Class\t\tFile\t\t\tLine\tMethod");

			// loop through traceElements to get exception description
			for (StackTraceElement element : traceElements) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
			}
		}
    }
		// call method2; throw exceptions back to main
		public static void method1() throws Exception {
			method2();
		}
		// call method3; throw exceptions back to method1
		public static void method2() throws Exception {
			method3();
		}
		
		// throw Exception back to method2
		public static void method3() throws Exception {
			throw new Exception("Exception thrown in method3");
		}

}
