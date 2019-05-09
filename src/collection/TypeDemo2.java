package collection;

public class TypeDemo2 {
	public static void main(String[] args) {
		/*
		 * Type中的x,y都是泛型<T>,而泛型的实际类型时
		 * Object,所以x,y实际上就是Object类型
		 */
		/*
		 * 再使用时，指定T为Integer,那么编译器会依靠该类型检查
		 * 对x,y赋值时的实际值的类型是否符合要求
		 * 并且再获取它们的值时，编译器会自动添加造型代码
		 */
		Type<Integer> t1 = new Type<Integer>(1,2);
		System.out.println(t1);
		//编译器会检查实参是否满足泛型所指定类型的要求
		t1.setX(2);
		//获取时，无需造型
		int x1 = t1.getX();
		System.out.println("x1:"+x1);
		System.out.println(t1);
		
		Type<Double> t2 = new Type<Double>(1.1,2.2);
		System.out.println(t2);
		t2.setY(3.3);
		double y2 = t2.getY();
		System.out.println("y2:"+y2);
		System.out.println(t2);
		
		Type<String> t3 = new Type<String>("你","我");
		System.out.println(t3);
		t3.setX("他");
		String x3 = t3.getX();
		System.out.println("x3:"+x3);
		System.out.println(t3);
		
		
	}
}
