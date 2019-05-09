package reflect;

public class Foo {
	int a = 5;
	
	public void test() {
		System.out.println("test方法");
	}
	
	private void demo() {
		System.out.println("demo方法");
	}
	
	public int demo(int n,String s) {
		System.out.println("demo(int,String)");
		return n+s.length();
	}
	
	public boolean demo(int n,int t) {
		System.out.println("test(int,int)");
		return n>t;
	}
	
	public int test(int n,String s) {
		System.out.println("test(int,String)");
		return n+s.length();
	}
	
	public double test(double n,String s) {
		System.out.println("test(double,String)");
		return n+s.length();
	}
	
	
}
