package String;
/**
 * 字符串支持正则表达式方法一:
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求，
 * 需要注意，这里正则表达式无论是否加了边界匹配符(^...$)
 * 都是做全匹配验证
 * @author soft01
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String mail = "479372360@qq.com";
		/*
		 * 邮箱的正则表达式
		 *\w+@\w+(\.[a-z]+)+
		 */
		String regex = "\\w+@\\w+(\\.[a-z]+)+";
		
		if(mail.matches(regex)) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}
	}
}
