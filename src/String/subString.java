package String;

public class subString {
	public static void main(String[] args) {
		String str = "abcdefghijk";
		String s = str.substring(3, 7);//3到6
		System.out.println(s);
		s = str.substring(3);//3到最后
		System.out.println(s);
	}
}
