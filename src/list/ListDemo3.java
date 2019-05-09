package list;


import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集操作
 * @author soft01
 *
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < 10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> subList = list.subList(3, 8);//含头不含尾
		System.out.println(subList);
		
		/*
		 * 将子集元素扩大10倍
		 */
		for(int i = 0;i < subList.size();i++) {
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		/*
		 * 在子集上做操作也就是在原集合上做操作
		 * 
		 */
		System.out.println(list);
		/*
		 * 删除2-8
		 */
		list.subList(2,9).clear();
		System.out.println(list);
		
	}
}
