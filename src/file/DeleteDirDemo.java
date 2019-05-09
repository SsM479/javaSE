package file;

import java.io.File;

/**
 * 删除目录
 * 
 * delete()只能删除空目录
 * @author soft01
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		/*
		 * 删除项目录下的demo目录
		 */
		File dir = new File("a");
		if(dir.exists()) {
			dir.delete();
			System.out.println("目录已删除");
		}else {
			System.out.println("目录不存在");
		}
	
	}
}
