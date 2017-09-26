package jdk8;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		Optional<String> optional = Optional.of("java8");
		// Optional<String> optional2 = Optional.of(null); 报错
		Optional<String> optional2 = Optional.ofNullable(null);
		String name = optional2.orElse("default");
		System.out.println("name:" + name);// 输出default
		// 如果不包装，将得不到有用的信息
		// optional2.get();// ava.util.NoSuchElementException: No value present

		// orElseThrow与orElse方法类似，区别在于返回值。
		// orElseThrow抛出由传入的lambda表达式/方法生成异常。
		try {
			optional2.orElseThrow(Exception::new);
		} catch (Throwable ex) {
			System.out.println(ex.getMessage());
		}

		// lambda表达式返回值会包装为Optional实例。
		Optional<String> upperName = optional.map((value) -> value.toUpperCase());
		// 如果满足返回Optional实例值，否则返回空Optional。
		Optional<String> longName = optional2.filter((value) -> value.length() > 6);

	}

}
