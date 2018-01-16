package com.explore.queue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneExam {
	public static void main(String[] args) {
//		test();
		// Date date = new Date("Tue Jan 16 23:37:38 CST 2018");
		Date date = new Date("16 Jan 2018 16:01:23 GMT");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(date);
		System.out.println(df.format(date));
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(df.format(date));

	}

	private static void test() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("currently time is : " + currentTimeMillis);
		Date date = new Date(currentTimeMillis);
		System.out.println("Date toString is :" + date.toString());
		System.out.println("Date GMT is :" + date.toGMTString());
		System.out.println("Date LOCALE is :" + date.toLocaleString());
		System.out.println("Date is :" + date);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		String formatDate = df.format(date);
		System.out.println("default format is :" + formatDate);
		df.setTimeZone(TimeZone.getTimeZone("EST"));
		formatDate = df.format(date);
		System.out.println("EST format is :" + formatDate);
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		formatDate = df.format(date);
		System.out.println("EST format is :" + formatDate);
	}
}
