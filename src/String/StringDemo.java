package String;
/**
 * 字符串的优化：
 * 字符串常量池，JVM在内存中创建了一块区域，用来保存所有已经通过字面量(直接量)创建的字符串对象，
 * 一旦再次发现通过字面量创建该字符串对象时则直接引用以前保存的，而不会再次真实创建该对象，
 * 从而节省了内存的开销
 * @author soft01
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = "123abc";
		
		//s2,s3会重用s1创建的字符串对象
		System.out.println(s1==s2);//true  地址相同
		System.out.println(s2==s3);//true
		
		/*
		 * 字符串的要求时字符串为不变对象，即:一旦创建
		 * 内容不可改变，若改变一定创建新对象
		 */
		s1 = s1 + "!";
		System.out.println(s1);
		System.out.println(s1==s2);//false  s1拼接改变后地址也变化
		
		String s4 = new String("123abc");
		System.out.println(s2==s4);//false  new有强制性 创建新地址 不能重用
		System.out.println(s2.equals(s4));//true
		
		/*
		 * 编译器有一个优化措施，当编译器发现一个计算
		 * 表达式中计算符号两边都是字面量时，会直接进行
		 * 计算，并将结果编译到class文件中。
		 * 例如下面的代码，会被编译器改为：
		 * String s5 = "123abc"
		 */
		String s5 = "123" + "abc";
		System.out.println(s2==s5);//true  虽然是拼接 a=3 int b=1+2=3  只能看到b=3 看不到1+2
		
		String s = "123";
		String s6 = s + "abc";
		System.out.println(s2==s6);//false
		
		
		
		
	}
}
