package stream;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperatorOfStream {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		IntStream.rangeClosed(1, 5) // 产生1到5
				// filter(Predicate<T>) 与预期匹配的流的元素
				.filter(x -> x % 2 == 0) // 留下 2，4
				// map(Function<T, U>) 将提供的函数应用于流的元素的结果
				.map(x -> x * x) // 产生 4，16
				// flatMap(Function<T, Stream<U>> 将提供的流处理函数应用于流元素后获得的流元素
				.flatMap(x -> IntStream.of(x)) // 此处没啥意义
				// distinct() 已删除了重复的流元素
				.distinct() // 去掉重复
				// sorted() 按自然顺序排序的流元素
				.sorted() // 排序
				// Sorted(Comparator<T>) 按提供的比较符排序的流元素
				// limit(long) 截断至所提供长度的流元素
				.limit(3) // 取前三个
				// skip(long) 丢弃了前 N 个元素的流元素
				.skip(1) // 跳过一个
				.forEach(System.out::print);
		// takeWhile(Predicate<T>) （仅限 Java 9）在第一个提供的预期不是 true 的元素处阶段的流元素
		// dropWhile(Predicate<T>) （仅限 Java 9）丢弃了所提供的预期为 true 的初始元素分段的流元素

	}

}
