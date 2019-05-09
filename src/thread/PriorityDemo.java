package thread;
/**
 * 线程的优先级
 * 线程的优先级有10个等级，分别用数字1-10表示
 * 其中1是最低优先级，10为最高，5是默认值
 * 
 * 理论上优先级月高的线程获取CPU时间片的次数就越多
 * 线程是不能主动获取CPU时间片的，只能被动的被分配
 * 通过调整优先级可以最大成都改善获取时间片的次数。
 * @author soft01
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max = new Thread() {
			public void run() {
				for(int i = 0;i < 10000;i++) {
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread() {
			public void run() {
				for(int i = 0;i < 10000;i++) {
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread() {
			public void run() {
				for(int i = 0;i < 10000;i++) {
					System.out.println("nor");
				}
			}
		};
		
		max.setPriority(10);
		min.setPriority(1);
		
		max.start();
		min.start();
		norm.start();
	}
}
