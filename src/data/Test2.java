package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品的促销日期
 * 
 * 城区启动后，要求用户输入某商品的生产日期:yyyy-MM-dd
 * 以及保质期的天数
 * 然后经过程序计算，输出该商品的促销日期:yyyy-MM-dd
 * 
 * 促销日期规则：商品过期日前两周的周三
 * @author soft01
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入生产日期:");
		String birStr = sca.nextLine();
		System.out.println("请输入保质期天数:");
		int befo = sca.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birStr);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		if(befo>14) {
			calendar.add(Calendar.DAY_OF_YEAR, befo-14);
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
			System.out.println("促销日期是:"+sdf.format(calendar.getTime()));
		}else {
			System.out.println(sdf.format(sdf.parse(birStr)));
		}
		
		
		
	}
}
