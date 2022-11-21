package self.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


public class Basics {
	public static void main(String[] args) throws IOException {
//		arrayStream();
//		System.err.println();
//		arrayListStream();
//		System.out.println();
//		reduceStreamInteger();
//		reduceStreamDouble();
//		reduceStreamArrayList();
//		reduceStreamArray();
		readFromFile();
	}
	

	private static void arrayStream() {
		
		//For arrays (int[]), a data structure, use Arrays.stream or Stream.of
		Arrays.stream(new int[] {4, 2, 6, 3, 1})
				.filter(x -> x % 2 != 0)
				.forEach(x -> System.out.println(x));
	}
	
	private static void arrayListStream() {
		
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
		
		for(int x : list) System.out.println(x);
	}
	
	private static void reduceStreamInteger() {
		
		Integer total = Stream.of(2, 3, 4, 5)
								.reduce(0, (Integer a, Integer b) -> a + b);
		System.out.println(total);
	}
	
	private static void reduceStreamDouble() {
		double total = Stream.of(2.3, 4.2, 5.3, 5.5).reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println(total);
		System.out.println();
	}
	
	private static void reduceStreamArrayList() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(6);
		Integer totoal = list.stream().reduce(0, (Integer a, Integer b) -> a + b);
		System.out.println(totoal);
	}
	
	private static void reduceStreamArray() {
//		Integer[] array = {2, 3, 5, 6};
//		Integer total = Arrays.stream(array).reduce(0, (Integer a, Integer b) -> a + b);
		Integer total = Arrays.stream(new Integer[] {2, 3, 5, 2, 5}).reduce(0, (Integer a, Integer b) -> a + b);
		System.out.println(total);
	}

	private static void readFromFile() throws IOException {
		Stream<String> animes = Files.lines(Paths.get("D:\\Study\\GitHub repos\\Java-Learnings\\Java-Learnings\\src\\self\\TextFiles\\Animes"));
		animes
			.sorted()
			.filter(x -> x.contains("o"))
			.forEach(x -> System.out.println(x));
		animes.close();
	}
	
	
}
