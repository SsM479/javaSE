package String;
/**
 * 字符串支持正则表达式的方法三：
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定字符串
 * @author soft01
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		/*
		 * 将当前字符串中的数字部分替换为NUMBER
		 */
		System.out.println(line.replaceAll("\\d+", "#NUMBER#"));
	}
}
