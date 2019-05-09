package String;
/**
 * StringBuilder修改字符串的效率
 * @author soft01
 *
 */
public class StringBuilderDemo2 {
	public static void main(String[] args) {
		String string = "a";
		StringBuilder builder = new StringBuilder(string);
		for(int i=0;i<10000000;i++) {
//			string += "a";
			builder.append("a");
		}

		System.out.println("ok");
	}
}
