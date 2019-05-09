package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称
 * 输入要修改昵称的用户的用户名,然后将该用户的昵称修改
 * 若输入的用户名无效，则做出提示。
 * @author soft01
 *
 */
public class UpdateUserDemo {
	public static void main(String[] args) throws IOException {
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入用户名:");
		String username = sca.nextLine();
		
		
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		
		boolean have = false;
		for(int i = 0;i < raf.length()/100;i++) {
			//移动指针到指定用户的位置
			raf.seek(i*100);
			//先读取用户名
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"UTF-8").trim();
			
			if(name.equals(username)) {
				System.out.print("请输入新的昵称:");
				String nickname = sca.nextLine();
				//先移动指针
				raf.seek(i*100+64);
				//将新的昵称写入
				byte[] nickArr = nickname.getBytes("UTF-8");
				nickArr = Arrays.copyOf(nickArr, 32);
				raf.write(nickArr);
				System.out.println("修改完毕");
				have = true;
				break;
			}
		}
		if(!have) {
			System.out.println("查无此人");
		}
		raf.close();
	}
}
