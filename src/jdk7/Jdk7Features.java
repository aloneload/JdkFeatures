package jdk7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Jdk7Features {

	public static void main(String[] args) {
		int add = 1_342_000;
		test();
		// try-with-resource
		try (BufferedReader br = new BufferedReader(new FileReader("data/nio-data.txt"))) {
			
			String line;
			while((line=br.readLine())!=null) {
			System.out.println(line);
			}
		} catch (IOException|NumberFormatException e) {//此处演示多个异常
			e.printStackTrace();
		}

	}

	private static void test() {
		// switch
		String s = "java8";
		switch (s) {
		case "java8":
			System.out.println("java8");
			break;
		case "java7":
			System.out.println("java7");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

}
