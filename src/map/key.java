package map;
/**
 * HashMap是当今查询速度最快的数据结构，内部使用数组实现，
 * 但HashMap可以根据key的hashcode值计算出其在数组对应
 * 的下标，这省去了遍历数组查询的工作，从而查询性能不
 * 受到数据量所影响。
 * 但是会影响HashMap查询性能的情况是在HashMap中产生链表
 * 而产生链表的一个主要情况位：
 * 当两个key的hashcode值相同，但是equals比较不一样时,
 * 在HashMap中就会产生链表。
 * 注：hashcode决定元素在数组中的位置，equals决定key是否
 *     重复
 * 为此，API手册对于这两个方法的重写有明确说明:
 * 1:成对重写
 *   当需要重写一个类的equals方法时就要连同重写hashCode方法。
 * 2:一致性
 *   当两个对象equals比较为true时，hashCode方法返回的数
 *   字必须相等。反之亦然(不是必须)。hashCode相等时，
 *   equals比较尽量保证为true。因为若使用这个类的实例作为
 *   key在HashMap中使用时，若两个对象hashCode值相等，但
 *   equals比较不为true时会产生链表。
 * 3:稳定性
 *   当参与equals比较的属性值没有发生改变的前提下，多次调用
 *   hashCOde方法返回的数字应当保持不变。
 *   
 *   容积问题:存储数据应该为容量的3/4，要预估存储元素，避免扩容
 * @author soft01
 *
 */
public class key {
	private int x;
	private int y;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		key other = (key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
