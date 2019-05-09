package io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流,特点是可以按行写出
 * 字符串，并且可以自动行刷新。
 * 
 * 注:
 * java.io.BufferedWriter是缓冲字符输出流，内部有缓冲区
 * 可以进行块写操作提高效率，而PrintWriter就是通过连接它
 * 实现的缓冲功能(PW的很多构造方法内部自动连接它)
 * @author soft01
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter(File f)
		 * PrintWiter(String path)
		 * 
		 * 以上两种构造方法都支持一个承诺重载，就是再传入一个参数允许我们指定写出字符时的字符集
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		
		pw.println("hate the game 耶");
		pw.println("我在南方");
		
		System.out.println("写出完毕");
		pw.close();
	}
}
