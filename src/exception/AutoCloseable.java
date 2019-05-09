package exception;

import java.io.FileOutputStream;

/**
 * JDK7之后退出了一个新的特性:自动关闭
 * java中实现了AutoCloseable接口的类，都可以被该特性自动关闭
 * @author soft01
 *
 */
public class AutoCloseable {
	public static void main(String[] args) {
		/*
		 * 写在try后面小括号里的就可以自动关闭 不需要再finally
		 */
		try(
			FileOutputStream fos = new FileOutputStream("fos.dat");
		){
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
