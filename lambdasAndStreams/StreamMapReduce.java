package lambdasAndStreams;

import java.util.stream.IntStream;

public class StreamMapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum the even integers from 2 through 20
		System.out.printf("Sum of the even ints from 2 through 20 is: %d%n",
		IntStream.rangeClosed(1, 10) // 1…10
		.map((int x) -> {return x * 2;}) // multiply by 2
		.sum());
	}

}
