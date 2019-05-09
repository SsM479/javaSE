package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 聊天室服务端
 * @author soft01
 *
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket主要有两个作用：
	 * 1：向系统申请服务端口，客户端就是通过这个端口与服务端建立连接的。
	 * 2：监听服务端口，一旦客户端与服务端建立连接，就会自动创建一个Socket，
	 *    并通过该Socket与建立连接的客户端进行交互。
	 */
	private ServerSocket server;
	
	/*
	 * 保存每个ClientHandler对应客户端的输出流，用于
	 * 广播消息
	 */
//	private PrintWriter[] allOut = {};
	private List<PrintWriter> allOut = new ArrayList<PrintWriter>();
	
	public Server() {
		try {
			/*
			 * 实例化ServerSocket的同时申请服务端口
			 */
			System.out.println("正在启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		
		try {
			
			while(true) {
				System.out.println("等待客户端连接...");
				/*
				 * ServerSocket的accept方法:
				 * Socket accept()
				 * 该方法时一个阻塞方法，调用后就处于阻塞状态
				 * 等待客户端的连接，一旦一个客户端连接了，这里
				 * 会马上返回一个Socket,通过这个Socket可以与
				 * 该客户端交互。
				 * 每当调用一次 accept方法就可以等待一个客户端的连接，
				 * 只有多次调用，才能感知其他客户端的连接.
				 */
				Socket socket = server.accept();
				System.out.println("一个客户端连接了");
				
				/*
				 * 启动一个线程来处理该客户端的交互
				 */
				Runnable clientHandler = new ClientHandler(socket);
				Thread thread = new Thread(clientHandler);
				thread.start();
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	/*
	 * 该线程的任务时处理与指定客户端的交互工作
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		//客户端的地址信息
		private String host;
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
			//通过socket获取远端计算机的地址信息
			InetAddress address = socket.getInetAddress();
			//获取IP地址的字符串形式:xxx.xxx.xxx.xxx
			host = address.getHostAddress();
			
		}
		
		public void run() {
			BufferedReader br = null;
			PrintWriter pw = null;
			try {
				/*
				 * socket提供的方法
				 * InputStream getInputStream()
				 * 
				 */
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
				
				/*
				 * 将该输出流存入共享数组allOut,便于其他的ClientHandler实例
				 * 也可以访问这个输出流，从而给该客户端发送消息。
				 * 
				 * 多个线程不能同时向allOut数组中添加元素，否则会
				 * 出现并发安全问题
				 */
				synchronized (allOut) {
					//1.对allOut数组扩容
//					allOut = Arrays.copyOf(allOut, allOut.length+1);
//					System.out.println(allOut.length);
//					//2.将该输出流存入数组最后一个位置
//					allOut[allOut.length-1] = pw;
					
					allOut.add(pw);
				}
				
				
				String message = null;
				while((message=br.readLine())!=null) {
					System.out.println(host+"说:"+message);
					synchronized (allOut) {
						//便利allOut,给所有客户端发送该消息
//						for (int i = 0; i < allOut.length; i++) {
//							allOut[i].println(host+"说:"+message);
//						}
						for(PrintWriter p : allOut) {
							p.println(host+"说:"+message);
						}
					}
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//处理客户端断开连接后的操作
				/*
				 * 1将当前客户端对应的输出流从allOut数组中删除
				 */
//				for(int i = 0;i < allOut.length;i++) {
//					try {
//						socket.sendUrgentData(0);
//					} catch (IOException e) {
//						System.arraycopy(allOut, i+1, allOut, i,allOut.length-i-1);
//						allOut = Arrays.copyOf(allOut, allOut.length-1);
//						allOut[i].close();
//						System.out.println("客户端离开了");
//						System.out.println(allOut.length);
//						break;
//					}
//				}
				synchronized (allOut) {
//					for(int i = 0;i < allOut.length;i++) {
//						if(allOut[i]==pw) {
//							allOut[i] = allOut[allOut.length-1];
//							allOut = Arrays.copyOf(allOut, allOut.length-1);
//							System.out.println(host+"离开了");
//							System.out.println(allOut.length);
//							break;
//						}
//					}
					allOut.remove(pw);
				}
				
				/*
				 * 将该socket关闭，释放资源
				 */
				try {
					socket.close();
				} catch (IOException e) {
				}
				
			}
		}
	}
}
