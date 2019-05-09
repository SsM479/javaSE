package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque接口 双端队列，是Queue的子接口
 * 双端队列的特点是：队列两端都可以做进出队操作
 * 常用实现类:java.util.LinkedList
 * @author soft01
 *
 *
 *栈：后进先出   //进入文件夹，后退前进功能
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		//从队首入列
		deque.offerFirst("four");
		System.out.println(deque);
		//从队尾入列
		deque.offerLast("five");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
	}
}
