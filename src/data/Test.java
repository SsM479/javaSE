package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入自己的生日:yyyy-MM-dd
 * 然后经过程序计算，输出到今天为止一共活了多少天
 * 再输出其出生10000天的纪念日是哪天
 * @author soft01
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入生日(yyyy-MM-dd):");
		String birDay = sca.nextLine();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birDate = sdf.parse(birDay);
		long time = (date.getTime()-birDate.getTime())/1000/60/60/24;
		System.out.println("一共活了:"+time+"天");
		
		long a = birDate.getTime()+1000*60*60*24*10000l;
		date.setTime(a);
		System.out.println(sdf.format(date));	
	}
}
