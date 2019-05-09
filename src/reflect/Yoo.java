package reflect;

public class Yoo {
	@Test//标注以自定注解
	public void test(){
		System.out.println("test()");
	}
	
	@Override
	@Test
	@Test1
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	@Test
	@Test1
	@Test2
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
