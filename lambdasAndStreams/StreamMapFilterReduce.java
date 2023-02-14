package lambdasAndStreams;

import java.util.stream.IntStream;

public class StreamMapFilterReduce {
	// sum the triples of the even integers from 2 through 10
	public static void main(String[] args) {
		System.out.println(
			IntStream.rangeClosed(2, 10)
			.filter(x -> x%2 == 0)
			.map(x -> x * 3)
			.sum()
		);
		
		//without filter
		System.out.println(
				IntStream.rangeClosed(2, 10)
				.map(x ->{ 
					if(x%2 == 0) {
						return x * 3;
					}
					return 0;
				})
				.sum()
		);
		
		System.out.println(
				IntStream.rangeClosed(2, 10)
				.filter( x -> {
					System.out.printf("%nfilter: %d%n", x);
					return x % 2 == 0;
				})
				.map(
					x -> {
					System.out.println("map: " + x);
					return x * 3;
				})
				.sum()
			);
	}

}
