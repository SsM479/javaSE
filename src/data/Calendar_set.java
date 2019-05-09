package data;

import java.util.Calendar;

/**
 * Calendar提供了：
 * void set(int field,int value)
 * 对给定的时间分量设置给定的值
 * @author soft01
 *
 */
public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		/*
		 * 2008-08-08 20:08:08
		 */
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.SECOND, 8);
		calendar.set(2009, Calendar.SEPTEMBER, 9, 21, 9, 9);
		
		
		System.out.println(calendar.getTime());
		
	}
}
