package list;

import java.util.LinkedList;

/**
 * List提供的另一组通过下标操作元素的方法：
 * st,get
 * @author soft01
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * E get(int index)
		 * 获取指定下标位置的元素
		 */
		System.out.println(list.get(1));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		/*
		 * E set(int index,E e)
		 * 将给定元素设置到指定位置，返回值为原为值对应的元素(替换元素操作)
		 * 也有下标越界，不能超出size
		 */
		String str =list.set(1,"2");//返回被替换的值
		System.out.println(list);
		System.out.println("str:"+str);
		
	}
}
