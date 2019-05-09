package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean remove(E e)
 * 从集合中删除给定元素
 * @author soft01
 *
 */
public class RemoveDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(1,2));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * 删除也是删除集合中给定元素equals比较为ture的元素，
		 * 对于List而言，重复元素只删第一个
		 * HashSet集合不能有重复元素
		 */
		c.remove(p);
		System.out.println(c);
	}
}
