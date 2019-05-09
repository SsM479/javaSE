package raf;


import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * 向文件中写出字符串操作
 * @author soft01
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\91024\\Desktop\\raf.txt","rw");
		
		String line = "像一颗海草海草海草海草~";
		/*
		 * 将字符串首先根据给定的字符集转换为一组字符
		 * 常见的支持中文的字符集有:
		 * GBK,UTF-8
		 */
		byte[] data = line.getBytes("UTF-8");

		
		raf.write(data);
		raf.write("随风飘摇~".getBytes("UTF-8"));
		System.out.println("写出完毕");
		raf.close();
		
	}
}
