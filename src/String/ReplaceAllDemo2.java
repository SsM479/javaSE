package String;
/**
 * 和谐用语
 * @author soft01
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args) {
		String regex = "wqnmlgdsb|mmp|sb|nc|tmd|mdzz|cnm|djb";
		
		String message = "wqnmlgdsb!你这个sb!你怎么这么nc!mdzz!你这个djb!我真tmdmmp";
		
		System.out.println(message.replaceAll(regex, "***"));
		
		
		
		
		
		
	}
}
