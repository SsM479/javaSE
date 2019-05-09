package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Random ran = new Random();
		List<String> list = new ArrayList<String>();
		for(int i = 1;i < 11;i++) {
			int num = ran.nextInt(100);
			list.add(i+":"+num);
		}
		System.out.println(list);
		/*
		 * sort方法会对集合元素进行自然排序(从小到大)
		 */
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
