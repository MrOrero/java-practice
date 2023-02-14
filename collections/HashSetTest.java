package collections;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;



public class HashSetTest {
// HashSets are unordered
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create and display a List<String>
		String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
		List<String> list = Arrays.asList(colors);
		System.out.printf("List: %s%n", list);
		
		// eliminate duplicates then print the unique values
		printNonDuplicates(list);
	}
		
		// create a Set from a Collection to eliminate duplicates
	private static void printNonDuplicates(Collection<String> values) {
		// create a HashSet
		Set<String> set = new HashSet<>(values);
		
		System.out.printf("%nNonduplicates are: ");
		
		for (String value : set) {
			System.out.printf("%s ", value);
		}
		
		System.out.println();
	}

}
