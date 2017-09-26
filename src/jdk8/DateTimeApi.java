package jdk8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApi {

	public static void main(String[] args) throws InterruptedException {
		test();
	}

	private static void test() throws InterruptedException {
		// LocalDate
		LocalDate localDate = LocalDate.of(2017, Month.OCTOBER, 1);// 2017-10-01
		int year = localDate.getYear(); // 2017
		Month month = localDate.getMonth(); // OCTOBER
		int dom = localDate.getDayOfMonth(); // 1
		DayOfWeek dow = localDate.getDayOfWeek(); // SUNDAY
		boolean leap = localDate.isLeapYear(); // false （不是闰年）
		// LocalTime
		LocalTime time = LocalTime.of(14, 32); // 14:32
		int hour = time.getHour(); // 14
		int minute = time.getMinute(); // 32
		time = time.withSecond(6); // 14:32:06
		time = time.plusMinutes(3); // 20:35:06
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		// of： 静态工厂方法，从组成部分中创建实例
		// now： 静态工厂方法，用当前时间创建实例
		// parse： 静态工厂方法，总字符串解析得到对象实例
		// with： 返回一个部分状态改变了的时间日期对象拷贝
		// plus： 返回一个时间增加了的、时间日期对象拷贝
		// minus： 返回一个时间减少了的、时间日期对象拷贝
		// at： 用当前时间日期对象组合另外一个，创建一个更大或更复杂的时间日期对象
		// format： 提供格式化时间日期对象的能力
		// Instance时刻
		Instant start = Instant.now();
		Thread.sleep(1001);
		Instant end = Instant.now();
		System.out.println("end-start=" + (end.compareTo(start)));
		// Duration period 时间段 可作为参数进行日期时间的运算
		Duration duration = Duration.of(1, ChronoUnit.HOURS);
		Period period = Period.of(1, 2, 3);
		System.out.println(duration + period.toString());
		// 格式化
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate2 = LocalDate.parse("2017/10/01", dateTimeFormatter);
		String date = localDate2.format(dateTimeFormatter);
		System.out.println();
		// ZoneId
		ZoneId zoneId = ZoneId.of("America/Caracas");
		LocalDate date2 = localDate.now(zoneId);
		System.out.println(date2);

	}

}
