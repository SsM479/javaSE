package String;
/**
 * int indexOf(String str)
 * 查找给定字符串在当前字符串中的位置。若当前字符串不包含给定内容。
 * 则返回值-1
 * @author soft01
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println("index:" + index);//2  第一个in的第一个单词的位置
		/*
		 * 重载方法允许从指定位置开始查找第一次出现的位置
		 */
		index = str.indexOf("in", 3);//从第3位开始找
		System.out.println("index:" + index);//5
		/*
		 * 查找给定字符串在当前字符串中最后一次出现的位置
		 */
		index = str.lastIndexOf("in");
		System.out.println("index:" + index);//9  最后一次出现
	}
}
