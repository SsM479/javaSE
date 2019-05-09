package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流链接中使用PW
 * @author soft01
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 使用流链接形式向文件中写出字符串
		 */
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("pw2.txt"),"UTF-8")));
		
		pw.println("我们一起学猫叫");
		pw.println("一起喵喵喵!!!");
		
		pw.close();
		
//		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("pw2.txt"),"UTF-8")));
//		pw.println("他他他");
//		pw.println("你好再见");
//		System.out.println("写出完毕");
//		pw.close();
	}
}
