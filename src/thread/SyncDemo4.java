package thread;
/**
 * 互斥锁
 * 当synchronized修饰多段代码，但是它们的同步监视器对象是同一个时，这些代码
 * 之间就是互斥的。即:多个线程不能同时运行这些方法.
 * @author soft01
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Foo foo = new Foo();
		final Foo f = new Foo();
		
		Thread t1 = new Thread() {
			public void run() {
				foo.methodA();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				foo.methodA();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"正在执行A方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+"A方法执行完毕");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void methodB() {
		 synchronized(this) {//只要监视器对象是同一个就会互斥
			 try {
					Thread t = Thread.currentThread();
					System.out.println(t.getName()+"正在执行B方法");
					Thread.sleep(5000);
					System.out.println(t.getName()+"B方法执行完毕");
				} catch (Exception e) {
					// TODO: handle exception
				}
		 }
		
	}
}
