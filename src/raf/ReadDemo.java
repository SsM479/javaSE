package raf;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取一个字节
 * @author soft01
 *
 */
public class ReadDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("test.dat","r");
		
		/*
		 * int read()
		 * 从文件中读取1个字节，并以int形式返回。若返回
		 * 值为-1，则表示文件读取到末尾了
		 */
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		
		raf.close();
		
		
	}
}
