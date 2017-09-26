package jdk5;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

public class Jdk5Features {
	

	public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2));
		packOrUnpack();
		int out = Version.JDK8.getAttibute();
		System.out.println("out:" + out);
		// 内省
		People people = new People(1,"zhangsan");
		BeanInfo beanInfo=Introspector.getBeanInfo(people.getClass());
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor propertyDescriptor : pds) {
			Object out2 = propertyDescriptor.getReadMethod().invoke(people);
			System.out.println(out2);
		}
	}

	private static void packOrUnpack() {
		int a = 4;
		Integer b = 5;// 装箱 5-》integer
		System.out.println(a + b);// 拆箱 //计算 int 的4+5
	}

	// 可变参数
	private static int sum(int... intlist) {
		int sum;
		sum = 0;
		for (int i = 0; i < intlist.length; i++) {
			sum += intlist[i];
		}
		return sum;

	}
}

enum Version {
	JDK8(8), JDK7(7);
	private int attibute;

	public int getAttibute() {
		return this.attibute;
	}

	private Version(int attibute) {
		this.attibute = attibute;
	}
}
class People{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private int index;

	public People(int index, String name) {
		this.index = index;
		this.name = name;
	}
}