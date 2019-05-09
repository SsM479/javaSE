package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * @author soft01
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
		
		String line = "齐天大圣";
		byte[] data = line.getBytes("UTF-8");
		
		bos.write(data);
		/*
		 * void flush()
		 * 缓冲流的flush方法用于强制将缓冲区中已缓存的数据进行一次性写出
		 * 频繁的调用flush方法会降低写效率，但是能保证写出数据的即时性.
		 */
//		bos.flush();
		System.out.println("写出完毕");
		//缓冲流在关闭时会自动进行一次flush操作
		bos.close();
		
	}
}
