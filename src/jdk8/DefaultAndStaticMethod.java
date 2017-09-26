package jdk8;

public class DefaultAndStaticMethod implements A {

	public static void main(String[] args) {
		DefaultAndStaticMethod defaultAndStaticMethod = new DefaultAndStaticMethod();
		// 调用默认方法
		defaultAndStaticMethod.print();
		//调用静态方法
		A.born();
		//调用继承的默认方法
		defaultAndStaticMethod.inherit();
		
	}
	@Override
	public void inherit() {
		System.out.println("继承自A的方法");
	}

}

interface A {
	default void print() {
		System.out.println("我是A默认方法");
	}
	default  void inherit() {
		System.out.println("我是A需要被继承的方法");
	}

	static void born() {
		System.out.println("我是A静态方法");
	}
}
