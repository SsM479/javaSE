package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map也提供了对应的contains方法，并且可以分别判断包含key和vlaue
 * boolean containsKey(K k)
 * boolean containsValue(V v)
 * @author soft01
 *
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("语文", 98);
		map.put("数学", 100);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 98);
		System.out.println(map);
		
		/*
		 * key与value的包含关系也是依靠元素自身的equals
		 * 方法比较的结果而定。
		 */
		boolean ck = map.containsKey("物理");
		System.out.println(ck);
		boolean vk = map.containsValue(95);
		System.out.println(vk);
	}
}
