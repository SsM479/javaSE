package raf;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 
 * 程序启动后,要求用户输入一个文件的名字/然后对该
 * 文件进行写操作
 * 之后用户在控制台输入的每行字符串都顺序写入该文件中
 * 当用户输入"exit"时,程序退出
 * @author soft01
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入文件名:");
		String fileName = sca.nextLine();
	
		
		RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
		
		System.out.print("请输入内容:");
		String message = "";
		
		while(true) {
				message = sca.nextLine();
				if("EXIT".equals(message.toUpperCase())) {
					System.out.println("再见");
					break;
				}else {
					raf.write(message.getBytes("UTF-8"));
				}
		}
		
		raf.close();
	}
}
