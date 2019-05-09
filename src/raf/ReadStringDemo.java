package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符串
 * @author soft01
 *
 */
public class ReadStringDemo{
	public static void main(String[] args) throws IOException{
		/*
		 * 将note.txt文件中的所有字符读取出来
		 */
		RandomAccessFile raf = new RandomAccessFile("demo.txt","r");
		/*
		 * 若想读取一个字符,应当读取几个字节?
		 * 不同的字符集,对应的文字占用的字节量时不同的
		 * 英文时相同的,无论哪个字符集都是1字节,都用的
		 * asc编码的部分.但是对于中文而言则不然,
		 * 在GBK编码中,每个中文占用2字节,在UTF-8中每个
		 * 中文字占用3个字节.
		 * 占用的这些字节对应的2进制不全是表达字符本身的数据,
		 * 还含有算法(通过这个,得知应当读取几个字节表示一个文字).
		 */
		
		byte[] data = new byte[(int)raf.length()];
		//读取指定的字节量(这里等于将文件所有字节写入)
		raf.read(data);
		/*
		 * String的构造方法允许我们将指定的字节数组中
		 * 所有的字节按照给定的字符集转换为一个字符串
		 */
		String string = new String(data,"UTF-8");
		System.out.println(string);
		
		raf.close();
	}
}
