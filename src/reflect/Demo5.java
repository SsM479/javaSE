package reflect;
/**
 * 利用反射执行有参数的方法
 */
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) throws Exception{
		
		Scanner sca = new Scanner(System.in);
		System.out.print("输入类名:");
		String className = sca.nextLine();
		System.out.print("输入方法名:");
		String methodName = sca.nextLine();
		
		Class cls = Class.forName(className);
		Object obj = cls.newInstance();
		//查找有参数的方法
		Method method = cls.getDeclaredMethod(methodName,int.class,String.class);
		System.out.print("输入参数1:");
		String p1 = sca.nextLine();
		System.out.print("输入参数2:");
		String p2 = sca.nextLine();
		int n = Integer.parseInt(p1);
		Object val = method.invoke(obj, n,p2);
		System.out.println(val);
		
		
//		Scanner sca = new Scanner(System.in);
//		System.out.print("输入类名:");
//		String className = sca.nextLine();
//		System.out.print("输入方法名:");
//		String methodName = sca.nextLine();
//		
//		Class cls = Class.forName(className);
//		Object obj = cls.newInstance();
//		
//		Method method = cls.getDeclaredMethod(methodName, int.class,String.class);
//		Object val = method.invoke(obj, 65,"abc");
//		System.out.println(val);
		
		
		
		
		
	}
}
