package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 完成简易记事本功能
 * 程序启动后要求输入文件名，然后对该文件写操作
 * 之后输入的每一行字符串都按行写入到该文件中
 * 当输入exit时程序退出
 * 
 * 使用PW完成该功能，并且自行使用流链接完成
 * @author soft01
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入文件名:");
		String fileName = sca.next();
		/*
		 * 当创建PW时第一个参数为一个流时，那么就可以
		 * 再传入一个boolean值类型的参数，若该值为true
		 * 那么当前PW就具有了自动行刷新功能，即:每当
		 * 使用println方法写出以行字符串后就会自动flush
		 * 
		 * 注:使用自动行刷新可以提高写出数据的即时性，但是
		 * 由于会提高写出次数，必然会导致写效率降低
		 */
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName,true),"UTF-8")),true);
		System.out.println("请开始输入内容:");
		
		
		while(true) {
			String message = sca.next();
			if("exit".equals(message)) {
				System.out.println("程序退出!");
				break;
			}else {
				pw.println(message);
			}
		}

		pw.close();
		
	}
}
