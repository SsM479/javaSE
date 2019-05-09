package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 显示user.dat文件中所有用户信息
 * @author soft01
 *
 */
public class ShowAllUserDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat","r");
		
		for(int i = 0;i < raf.length()/100;i++) {
			//读用户名
			//连续读取32字节，将其转换为字符串
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"UTF-8").trim();
			
			raf.read(data);
			String password = new String(data,"UTF-8").trim();
			
			raf.read(data);
			String nickName = new String(data,"UTF-8").trim();
			
			int age = raf.readInt();
			
			System.out.println(name+","+password+","+nickName+","+age);
		}
		
		raf.close();
	}
}
