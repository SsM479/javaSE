package String;
/**
 * 字符串提供了可以将当前字符串中的英文部分转换为全大写或全小写
 * String toUpperCase()
 * String toLowerCAse()
 * @author soft01
 *
 */
public class UpperLowerDemo {
	public static void main(String[] args) {
		String string = "我爱Java";
		
		String upper = string.toUpperCase();
		System.out.println(upper);
		
		String lower = string.toLowerCase();
		System.out.println(lower);
	}
}
