package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，特点:可以按行读取字符串
 * @author soft01
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 将当前程序的源代码输出到控制台
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/io/BRDemo.java"),"UTF-8"));
		/*
		 * String readLine()
		 * 连续读取若干字符，知道读取了换行符为止，然后
		 * 将换行符之前的所有字符组成一个字符串返回，注意
		 * 返回的字符串中不包含最后读取到的换行符。
		 * 当读取到了末尾，则返回null
		 */
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
