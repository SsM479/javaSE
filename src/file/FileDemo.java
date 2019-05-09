package file;

import java.io.File;

/**
 * java.io.File
 * File表示一个抽象路径，简单的理解为可以访问文件系统中
 * 的一个文件或目录。
 * 使用File我们可以：
 * 1.访问其表示的文件或目录的属性信息(名字，大小，修改时间)
 * 2.可以操作文件或目录(创建，删除)
 * 3.可以访问一个目录中的所有子项
 *   但是不能访问一个文件的数据
 * 
 * @author soft01
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * 访问项目目录下的test.txt文件
		 * 在使用路径时，通常我们都使用相对路径，因为
		 * 绝对路径的指向太明确，导致的问题时不可变动，
		 * 那么在跨平台时会出现很多问题
		 * 相对目录比较灵活，但是要请求相对路径时哪里，
		 * 而相对的路径要基于程序的运行环境而定。对于
		 * 我们现在都是eclipse中运行程序而言，那么其表示的
		 * "当前目录"就是当前程序所在的项目目录
		 */
		File file = new File("./test.txt");
		
		System.out.println(file.getName());
		System.out.println(file.length());//字节量
		
		System.out.println("可读:"+file.canRead());
		System.out.println("可写:"+file.canWrite());
		System.out.println("隐藏:"+file.isHidden());
	}
}
