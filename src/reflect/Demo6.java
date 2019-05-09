package reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 紧耦合：组件和组件之间是紧密关联的关系。例如：手机和电池一体化的现象称为紧耦合
 * 松耦合：组件和组件之间不是紧密关联的关系，可以将组件进行重新组合，可以进行组件替换。
 *         诺基亚电池可以更换的现象叫松耦合
 * 解耦：将组件关系从紧耦合改变成松耦合称为解耦 
 * 
 * 反射API可以动态解析注解
 * @author soft01
 *
 */
public class Demo6 {
	public static void main(String[] args) throws Exception{
		/*
		 * 运行期间利用反射API查找标注在方法上的注解
		 * 1.动态加载类
		 * 2.动态查找所有方法
		 * 3.查找方法上标注的注解
		 */
		
		Scanner sca = new Scanner(System.in);
		System.out.print("输入类名:");
		String className = sca.nextLine();
		Class cls = Class.forName(className);
		//动态查找全部方法
		Method[] method = cls.getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			//method[i]代表cls类每一个方法
			System.out.println(method);
			//Annotations 注解，getAnnotations用于获取标注在方法上的注解
			Annotation[] annotations = method[i].getAnnotations();
			for(Annotation ann : annotations) {
				System.out.println(ann);
			}	
		}
		
		
//		Scanner sca = new Scanner(System.in);
		 
	}
}
