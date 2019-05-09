package data;

import java.util.Calendar;

/**
 * Calendar可以获取各个时间分量的值
 * int get(int field)
 * 不同的时间分量用不同的数字表示，这些数字无需记忆
 * Calendar都提供了对应的常量
 * @author soft01
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//获取年
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		//获取月(月从0开始)
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(year+"-"+month);
		//获取日
//		int day = calendar.get(Calendar.DAY_OF_WEEK);//一周中第几天
		
//		int day = calendar.get(Calendar.DAY_OF_MONTH);//月中第几天
		int day = calendar.get(Calendar.DATE);//两者相同
		
//		int day = calendar.get(Calendar.DAY_OF_YEAR);//一年中第几天
		System.out.println(day);
		
		System.out.println(year+"-"+month+"-"+day);
		
		/*
		 * 获取时分秒
		 */
//		int h = calendar.get(Calendar.HOUR);//十二小时制
		int h = calendar.get(Calendar.HOUR_OF_DAY);//二十四小时制
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		//周几 周日为1
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		String[] data = {"日","一","二","三","四","五","六",};
		System.out.println("周"+data[dow-1]);
		
		//今年的第几天
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+doy+"天");
		
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年共"+days+"天");
	}
}
