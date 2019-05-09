package String;
/**
 * String time()
 * 去除一个字符串两边的空白字符
 * @author soft01
 *
 */
public class trimDemo {
	public static void main(String[] args) {
		String string = "     hello       ";
		System.out.println(string);
		String trim = string.trim();
		System.out.println(trim);
	}
}
