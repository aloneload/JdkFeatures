package stream;

import java.util.TooManyListenersException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import jdk7.Test;

public class TerminalOfStream {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		IntStream.rangeClosed(1, 10)
		.parallel()
				// forEach(Consumer<T> action) 将提供的操作应用于流的每个元素。
				// toArray() 使用流的元素创建一个数组。
				// reduce(...) 将流的元素聚合为一个汇总值。
				// collect(...) 将流的元素聚合到一个汇总结果容器中。
				// min(Comparator<T>) 通过比较符返回流的最小元素。
				// max(Comparator<T>) 通过比较符返回流的最大元素。
				// count() 返回流的大小。
				// {any,all,none}Match(Predicate<T>) 返回流的任何/所有元素是否与提供的预期相匹配。
				// findFirst() 返回流的第一个元素（如果有）。
				// findAny() 返回流的任何元素（如果有）。
				// 注意，由于以下流只能消费一次，以下代码只能执行一行
				.forEach(System.out::println);
		// .toArray();
		// .reduce(Integer::sum);
		// .collect(toList());
		// .min();
		// .max();
		// .count();
		// .findAny();
	}

}
