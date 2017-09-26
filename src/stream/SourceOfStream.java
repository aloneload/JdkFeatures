package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SourceOfStream {

	public static void main(String[] args) {
		try {
			run();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	private static void run() throws FileNotFoundException {
		// Collection.stream()
		Arrays.asList(1, 2, 3, 4, 5).stream();
		// Stream.of(T...)
		Stream.of(1, 2, 3, 4, 5);
		// Stream.of(T[])
		Stream.of(new int[] { 1, 2, 3 });
		// Stream.empty()
		Stream.empty();
		// Stream.iterate(T first, BinaryOperator<T> f)
		Stream.iterate(1, x -> x + 1);
		// Stream.iterate(T first, Predicate<T> test, BinaryOperator<T> f) //java9
		// Stream.generate(Supplier<T> f)
		Stream.generate(new Random()::nextInt);
		// IntStream.range(lower, upper)
		IntStream.range(1, 6);
		// IntStream.rangeClosed(lower, upper)
		IntStream.rangeClosed(1, 5);
		// BufferedReader.lines()
		new BufferedReader(new FileReader("test.txt")).lines();

	}
}
