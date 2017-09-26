package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.transform.Source;

public class StreamTest {

	public static void main(String[] args) {
		new StreamTest().run();

	}

	private void run() {
		Stream.of("a", "b", "c").forEach(System.out::println);

		String[] strArray = { "a", "b", "c" };
		Stream.of(strArray).forEach(System.out::println);
		Arrays.stream(strArray).forEach(System.out::println);

		Arrays.asList(strArray).stream().forEach(System.out::println);

		IntStream.of(new int[] { 1, 2 }).forEach(System.out::println);
		IntStream.range(1, 4).forEach(System.out::println);
		IntStream.rangeClosed(1, 3).forEach(System.out::println);
		
		IntStream.iterate(0,n->n+3).limit(10).forEach(System.out::println);
		IntStream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
		

		Stream<String> sourceStream = Stream.of("a", "b", "c");
		String[] out = sourceStream.toArray(String[]::new);
		System.out.println(Arrays.toString(out));
		sourceStream.collect(Collectors.toList());
//		sourceStream.collect(Collectors.toCollection(ArrayList::new));
//		sourceStream.collect(Collectors.toSet());
//		String out2 = sourceStream.collect(Collectors.joining()).toString();
		
	}

}
