package self.java8.stream;

import java.util.Arrays;

public class Basics {
	public static void main(String[] args) {
		Arrays.stream(new int[] {4, 2, 6, 3, 1})
				.filter(x -> x % 2 != 0)
				.forEach(x -> System.out.println(x));
	}
}
