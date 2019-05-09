package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;
/**
 * 反射用途：
 * 1.访问不可见(包括私有)的属性,方法  method.setAccessible(true);
 * 2.将一段程序与另外一段程序进行解耦
 * @author soft01
 * 过程：
 * 1.动态输入类名
 * 2.根据类型动态加载类到内存中
 * 3.动态创建类型的实例
 * 4.动态查找类型全部的方法
 * 5.遍历查找每个方法的名，如果是符合要求的，则
 *   利用反射API执行方法。
 */
public class Demo2 {
	public static void main(String[] args) throws Exception{
		
			/*
			 * 动态加载类，并且动态创建类
			 * 如下代码可以动态加载任何的类，创建其对象
			 * 注意：类型必须有无参数构造器
			 */
			Scanner sca = new Scanner(System.in);
			//运行期间通过控制度去读类名
			System.out.print("请入类名:");
			String className = sca.nextLine();
			//动态加载类到方法区，类名错误时抛异常
			Class cls = Class.forName(className);
			//显示加载的结果
			System.out.println(cls);
			//动态创建对象，如果没有无参数构造器时，抛异常
			Object obj = cls.newInstance();
			//显示创建好的对象
			System.out.println(obj);
			
			//动态输入方法名
			System.out.print("要求用户输入方法名:");
			String methdName = sca.nextLine();
			//根据方法名动态查找方法method
			//getDeclaredMethod()  根据给定的方法名查找一个方法，返回值是一个方法.如果每由找到抛异常
			Method method = cls.getDeclaredMethod(methdName);
			//开启方法的访问权限，用来访问不可见方法
			method.setAccessible(true);
			//动态执行方法,obj对象上一定要包含要包含指定的方法
			Object val = method.invoke(obj);
			//val是方法的返回值，如果没有返回值则为null
			System.out.println(val);
			
	}
}
