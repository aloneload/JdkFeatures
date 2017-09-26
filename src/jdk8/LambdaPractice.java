package jdk8;

public class LambdaPractice {

	public static void main(String[] args) {

		MathOperation addition = (int a, int b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("60 + 12 = " + operate(60, 12, addition));
		System.out.println("60 - 12 = " + operate(60, 12, subtraction));
		System.out.println("60 x 12 = " + operate(60, 12, multiplication));
		System.out.println("60 / 12 = " + operate(60, 12, division));

	}

	private static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}
