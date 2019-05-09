package integer;
/**
 * java有8个基本类型，但是它们不具备面向对象的特性，所以
 * 不能直接参与面向对象开发，那么在实际使用上会出现很多的不便，
 * 为此java为8个基本类型提供了对应的包装类，以便于让基本类型以对象
 * 形式存在并参与面向对象的开发中
 * @author soft01
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//可以通过实例化将基本类型转换为对应的包装类
		//不建议用这种
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(1);
		
		//推荐用静态方法valueOf将基本类型转为包装类 
		Integer i1 = Integer.valueOf(1);
		Integer i2 = Integer.valueOf(1);
		
		Double d1 = Double.valueOf(1.0);
		Double d2 = Double.valueOf(1.0);
		
		System.out.println(i1==i2);//false   true 用valueOf在一个字节的范围(-128~127)之间可以重用
		System.out.println(i1.equals(i2));//true 只有自己定义的类需要重写equals
		
		System.out.println(d1==d2);//false  Double中是直接new 与Double d1 = new Double(1.0)没区别 
		
		/*
		 * 数字类型的包装类提供了一组方法:
		 * intValue,doubleValue,floatValue等等
		 * 可以将当前包装类表示的数字转换为对应的基本类型
		 */
		int d = i1.intValue();
		System.out.println(d);
		
		double dou = i1.doubleValue();
		System.out.println(dou);
		
		byte b = i1.byteValue();
		System.out.println(b);//最大值为127,若i1=128，则是最大值+1:127+1=-128
		
		//获取int的最大值
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
		
	}
}
