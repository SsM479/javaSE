package String;
/**
 * String startsWith(String str)
 * 判断当前字符串是否以给丁的字符串开始的
 * 
 * String endsWith(String str)
 * 判断当前字符串是否是以给丁的字符串结尾的
 * @author soft01
 *
 */
public class StartsWithDemo {
	public static void main(String[] args) {
		String line = "thinking in java";
		
		boolean starts = line.startsWith("think");
		System.out.println("starts:" + starts);
		
		boolean ends = line.endsWith("ava");
		System.out.println("ends:" + ends);
	}
}
