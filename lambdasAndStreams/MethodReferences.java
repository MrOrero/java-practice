package lambdasAndStreams;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		
		// display 10 random integers on separate lines
		System.out.println("Random numbers on separate lines:");
		
		randomNumbers.ints(10, 1, 7).forEach(System.out::println);
//		randomNumbers.ints(10, 1, 7).forEach(x -> System.out.println(x));
		
		// display 10 random integers on the same line
		String numbers = randomNumbers.ints(10, 1, 7)
		.mapToObj(String::valueOf)
//		.mapToObj(x ->String.valueOf(x))
		.collect(Collectors.joining(" "));
		System.out.printf("%nRandom numbers on one line: %s%n", numbers);

	}

}
