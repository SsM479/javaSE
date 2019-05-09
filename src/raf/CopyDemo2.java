package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 若向提高读写效率，可以通过提高每次实际读写的数据量
 * 减少实际读写次数来达到
 * 
 * 单字节读写称为随机读写方式
 * 一次读写一组字节成为块读写方式
 * @author soft01
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		//1
		RandomAccessFile src = new RandomAccessFile("demo.txt", "r");
		//2
		RandomAccessFile desc = new RandomAccessFile("demo_cp.txt","rw");
		/*
		 * RAF提供的块读写方法：
		 * int read(byte[] data)
		 * 一次性从文件中读取给定的数组长度的字节量，并存入到该数组中，返回值为
		 * 实际读取到的字节量。
		 * 若返回值为-1，表示本次没有读取道任何数据(实际是已经是文件末尾了)
		 * 
		 * void write(byte[] data)
		 * 一次性将给定的字节数组中所有字节写出
		 * 
		 * void write(byte[] data,int index,int len)
		 * 一次性将给定的字节数组中的index处开始的连续len个字节写出
		 */
		 int len = -1;//表示每次实际读取到的字节量
		 byte[] data = new byte[1024*10];//10k
		 
		 long start = System.currentTimeMillis();
		 while((len=src.read(data))!=-1) {
			 desc.write(data, 0, len);
		 }
		 long end = System.currentTimeMillis();
		 System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		 
		 src.close();
		 desc.close();
	}
}
