package self.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
	public static void main(String[] args) {
		
		//For arrays (int[]), a data structure, use Arrays.stream or Stream.of
		Arrays.stream(new int[] {4, 2, 6, 3, 1})
				.filter(x -> x % 2 != 0)
				.forEach(x -> System.out.println(x));
		
		// For ArrayList, a collection, use variablename.stream()
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(1);
		list.stream()
				.filter(x -> x % 2 != 0)
				.forEach(x -> System.out.println(x));
	}
}
