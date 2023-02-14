package collections;

import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"black", "blue", "yellow"};
		LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
		
		links.addLast("red"); // add as last item
		links.add("pink"); // add to the end
		links.add(3, "green"); // add at 3rd index
		links.addFirst("cyan"); // add as first item
		
		// cyan, black, blue, yellow, green, red, pink
		
		System.out.println("links: ");
		
		for (String color : links) {
			System.out.println(color);
		}
		
		System.out.println();
		// get LinkedList elements as an array
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");
		
		for (String color : colors) {
			System.out.println(color);
		}
	}
}