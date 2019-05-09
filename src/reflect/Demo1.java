package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
/**
 * class.forName()
 * newInstance()
 * invoke()
 * @author soft01
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		test(123);
		test("你好");
		test(new ArrayList());
		test(true);
		Collection<String> c = new Vector<String>();
		Iterator<String> itr = c.iterator();
		//itr的具体对象的类型是什么?
		test(itr);//Vector$itr   迭代器是内部类实现的  是哪种集合就是哪种类型集合的类型
	}
	
	public static void test(Object obj) {
		/*
		 * obj的具体类型是什么？  只有调用了方法才知道
		 * 如何在方法中检查对象的具体类型？
		 * 利用反射API可以“动态”检查对象的类型
		 * Object类上定义getClass,用于检查软件执行期间对象的具体类型
		 */
		Class cls = obj.getClass();
		System.out.println(cls);
		
		/*
		 * 进一步动态检查类型的内部结构：
		 * 1.检查类型声明的全部成员变量
		 *   getDeclaredFields()方法的功能是检查cls
		 * 代表的类型中全部的字段(成员变量)
		 */
		
		// Declared声明的 Fields字段，成员变量
		Field[] fields = cls.getDeclaredFields();
//		for (int i = 0; i < fields.length; i++) {
//			System.out.println(fields[i]);
//		}
		System.out.println("-------------------------"+cls+"字段-------------------------");
		for(Field field : fields) {
			System.out.println(field);
		}
		
		/*
		 * 2.检查类中声明的方法
		 *   getDeclaredMethdos()动态获取当前类型中声明的方法信息,不含继承方法
		 *   getMethods()获取当前类和父类中继承的方法信息
		 */
		Method[] methods = cls.getDeclaredMethods();
		System.out.println("-------------------------"+cls+"方法-------------------------");
		for(Method method : methods) {
			System.out.println(method);
		}
		
		/*
		 * 3.检查类中的构造器
		 *   getDeclaredConstructors()获取当前类型中的构造器
		 */
		Constructor[] constructors = cls.getDeclaredConstructors();
		System.out.println("-------------------------"+cls+"构造器-------------------------");
		for(Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		
	}
}
