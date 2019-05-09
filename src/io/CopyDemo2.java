package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 处理流，也称高级流
 * 在IO操作中，通常我们会在低级流上连接一些高级流，这样
 * 当数据流经这些高级流时，它们可以对数据进行相应的加工处理，
 * 以简化我们对数据的相关操作。而这个过程，成为流链接操作。
 * 
 * 缓冲流
 * 是一对高级流，作用是提高读写效率。
 * 缓冲流内部维护一个数组，无无论我们做随机读写还是块读写操作，
 * 最终都会流经缓冲流时改变为块读写操作，从而提高了读写效率
 *
 * @author soft01
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("demo.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("demo_cp.txt"));
		
		int len = -1;
		while((len=bis.read())!=-1) {
			bos.write(len);
		}
		
		System.out.println("复制完毕");
		/*
		 * 关闭流的时候，只需要关闭最外层高级流即可
		 */
		bis.close();
		bos.close();
	}
}
