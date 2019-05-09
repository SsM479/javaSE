package String;
/**
 * char charAt(int index)
 * 返回当前字符串中指定位置处对应的字符
 * @author soft01
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		char c = str.charAt(9);//字符串第9个字符 包括空格
		System.out.println(c);//i
		c = str.charAt(7);
		System.out.println(c);//g
		
		/*
		 * 检测回文
		 * 上海自来水来自海上
		 */
		String line = "上海自来水来自海上";
		for(int i = 0;i < line.length()/2;i++) {
			char c1 = line.charAt(i);
			char c2 = line.charAt(line.length() - 1 - i);
			if(c1!=c2) {
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
		
	}
}
