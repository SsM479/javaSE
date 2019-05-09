package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) throws Exception{
		/*
		Scanner sca = new Scanner(System.in);
		
		System.out.print("请输入动态类名:");
		String className = sca.nextLine();
		//1.动态获取类名
		Class cls = Class.forName(className);
		System.out.println(cls);
		//2.动态创建对象
		Object obj = cls.newInstance();
		System.out.println(obj);
		//3.动态查找所有方法
		Method[] methods = cls.getDeclaredMethods();
		//4.遍历全部方法，找到以test开头的方法
		for (int i = 0; i < methods.length; i++) {
			//5.获取方法名称
			String name = methods[i].getName();
			System.out.println(name);
			//6.检查方法名是否以test为开头
			if(name.startsWith("test")) {
				//7.执行找到方法
				methods[i].invoke(obj);
			}
		}
		*/
		
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入动态类名:");
		String className = sca.nextLine();
		Class cls = Class.forName(className);
		Object obj = cls.newInstance();
		Method[] methods = cls.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			String name = methods[i].getName();
			System.out.println(name);
			if(name.startsWith("test")) {
				methods[i].invoke(obj);
			}
		}
		
		
		
	}
}
