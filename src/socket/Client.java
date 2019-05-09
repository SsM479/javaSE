package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author soft01
 *
 */
public class Client {
	/*
	 * 套接字
	 * 封装了TCP协议的通讯细节，让我们可以简单的使用它
	 * 完成TCP通讯。
	 * Socket连接后提供了两条流，通过两条流的读写操作
	 * 完成与远端计算机的数据交换.
	 */
	private Socket socket;
	/*
	 * 用来初始化客户端
	 */
	
	public Client() {
		try {
			/*
			 * 实例化Socket时需要传入两个参数:
			 * 1:服务端的IP地址
			 * 2:服务端的端口号
			 * 通过IP地址可以找到服务端所在的计算机，通过
			 * 端口可以找到运行在服务端计算机上的服务端应用程序
			 * 注意，实例化Socket的过程就是连接的过程，若
			 * 连接失败会抛出异常
			 * 
			 * 
			 */
			System.out.println("正在连接服务端");
			//localhost  176.29.15.106
			socket = new Socket("localhost",8088);
			System.out.println("与服务端建立连接");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 客户端开始工作的方法
	 */
	public void start() {
		PrintWriter pw = null;
		try {
			//先启动读取服务端消息的线程
			ServerHandler handler = new ServerHandler();
			Thread thread = new Thread(handler);
			thread.start();
			
			Scanner sca = new Scanner(System.in);
			/*
			 * Socket提供的方法
			 * OutputStream getOutputStream()
			 * 该方法获取一个字节输出流，通过该流写出的数据
			 * 会发送给远端计算机
			 */
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
			
			String message = null;
			while(true) {
				message = sca.nextLine();
				pw.println(message);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
	/*
	 * 该线程负责循环读取服务端发送过来的消息
	 */
	private class ServerHandler implements Runnable{
		BufferedReader br = null;
		public void run() {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				
				String line = null;
				while((line = br.readLine())!=null) {
					System.out.println(line);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
