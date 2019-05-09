package list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组操作
 * 
 * Collection提供了一个方法:toArray
 * 该方法可以将当前集合转换为一个数组
 * @author soft01
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/*
		 * 若给的数组长度不够，会自己重新new一个同对象的，并给足够的长度:
		 * (new String[1])<size 自己new个size大小的数组 lenth=4
		 * 
		 * (new String[10])>size 
		 * 多余的输出 null
		 */
		String[] array = c.toArray(new String[c.size()]);
		System.out.println(array.length);
		for(String str : array) {
			System.out.println(str);
		}
	}
}
