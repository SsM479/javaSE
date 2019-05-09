package thread;
/**
 * 静态方法若使用synchronized修饰后，那么该方法一定
 * 具有同步效果。
 * 静态方法所使用的同步监视器对象为其方法所属类的类对象，
 * 即：Class的一个实例。每个类都有且只有一个Class实例
 * 与之对应(反射知识中会介绍)
 * @author soft01
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				//静态方法只用类名来调，用对象会警告，就算不同对象也会同步+
				Boo.dosome();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				Boo.dosome();
			}
		};
		
		t1.start();
		t2.start();
	}
}


class Boo{
	//静态方法一定有同步效果
	public synchronized static void dosome() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在运行dosome");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行dosome");
		} catch (Exception e) {
		}
	}
}