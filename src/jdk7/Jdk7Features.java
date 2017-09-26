package jdk7;

import java.util.List;
import java.util.logging.Logger;

import javax.swing.table.TableStringConverter;

public class Jdk7Features {

	public static void main(String[] args) {
		try {
			test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void test() throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			Logger log = Logger.getLogger(Jdk7Features.class.getName());
			log.info("running...");
		
		}
	}
	

}
