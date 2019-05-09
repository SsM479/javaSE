package file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
	public static void main(String[] args) {
		File dir = new File("a");
//		FileFilter filter = new MyFilter();
		/*
		 * 使用匿名内部类形式创建文件过滤器
		 * 过滤条件为：只获取文件
		 */
		FileFilter filter = new FileFilter() {
			public boolean accept(File file) {
				return file.isFile();
			}
		};
		File[] subs = dir.listFiles(filter);
		for (int i = 0; i < subs.length; i++) {
			System.out.println(subs[i].getName());
		}
	}
}

//class MyFilter implements FileFilter{
//	@Override
//	public boolean accept(File file) {
//		String name = file.getName();
//		System.out.println("正在过滤:" + name);
//		return name.startsWith(".");
//	}
//	
//}
