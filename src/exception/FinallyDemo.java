package exception;
/**
 * finally块
 * finally块时定义在异常处理机制的最后一块。它可以直接
 * 跟在try之后活着最后一个catch之后。
 * finally可以保证只要程序执行到了rty块当中，那么无论
 * try块中的语句是否会抛出异常，finally都确保其内容一定被执行。
 * 通常会将释放资源等操作放在finally中，如流的关闭操作
 * @author soft01
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			String string = "";
			System.out.println(string.length());
			return;
		} catch (Exception e) {
			System.out.println("出错了");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("程序结束");
	}
}
