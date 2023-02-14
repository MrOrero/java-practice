package collections;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits);
		System.out.printf("Unsorted array elements: %s%n", list);
		
		Collections.sort(list); // sort ArrayList
		System.out.printf("Sorted array elements: %s%n", list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("Sorted array elements in descending order: %s%n", list);
	}

}
