package thread;
/**
 *  线程提供了获取线程信息的相关方法
 * @author soft01
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		//获取线程唯一标识
		long id = main.getId();
		System.out.println("id:"+id);
		//获取线程名字
		String name = main.getName();
		System.out.println("name:"+name);
		//获取线程优先级
		int priority = main.getPriority();
		System.out.println("优先级:"+priority);
		//判断是否处于活动状态
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:"+isAlive);
		//判断是否为守护线程
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		//判断是否是被中断的
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
		
	}
}
