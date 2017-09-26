package stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectOfStream {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		IntStream.range(1, 100).collect(ArrayList::new, (lists, element) -> lists.add(element),
				(list1, list2) -> list1.addAll(list2));
		// 简化版
		Stream.of("java8", "action").collect(Collectors.toList());

	}

}
