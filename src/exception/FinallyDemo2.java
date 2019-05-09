package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * finally在IO中的作用
 * @author soft01
 *
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		/*
		 * fos若在try中定义，则不能在finally块中访问
		 */
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos.dat");
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/*
				 * 若fos路径错误，则不能初始化,fos还是null。此时关闭会空指针异常，所以需要判断
				 */
				if(fos!=null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
