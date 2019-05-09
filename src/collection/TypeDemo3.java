package collection;
/**
 * 泛型时编译器认可，而非虚拟机认可
 * @author soft01
 *
 */
public class TypeDemo3 {
	public static void main(String[] args) {
		Type<Integer> t1 = new Type<Integer>(1,2);
		//编译器会检查实参类型是否符合泛型要求
		t1.setX(3);
		//编译器会自动补充造型回Integer的代码
		int x1 = t1.getX();
		System.out.println("x1:"+x1);
		System.out.println("t1:"+t1);
		
		//当不指定泛型时，编译器默认认为ie时原型Object
		Type t2 = t1;//指向同个对象
		System.out.println("t2:"+t2);
		t2.setX("一");
		System.out.println("t2:"+t2);
		//类造型异常
		x1 = t1.getX();//编译器自动补充造型  而X是String 造型成Integer会有ClassCastExcetion
		System.out.println("x1:"+x1);
		System.out.println("t1:"+t1);
	}
}
