package object;
/**
 * 测试Point重写Object的相关方法
 * @author soft01
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point point = new Point(1,2);
		
		/*
		 * Object定义的toString方法的意图是返回该对象
		 * 以一个字符串形式返回。但是本身Object提供的这个方法
		 * 返回的字符串为这个对象的"句柄"。即：对象的地址信息。
		 * 实际开发意义不大。为此，当我们需要用到一个对象的toString
		 * 方法时，就应当重写这个方法。注意，java提供的类基本都重写
		 * 了toString只有我们自己定义的类才需要额外重写。
		 */
		String string = point.toString();
		System.out.println(string);
		/*
		 * System.out.println(Object obj)
		 * 该方法可以将给定对象的toString方法返回的字符串输出到控制台
		 */
		System.out.println(point);
		
		Point point2 = new Point(1,2);
		System.out.println(point==point2);//false
		System.out.println(point.equals(point2));//true,若不重写equals也为false equals本质也是==
	}
}
