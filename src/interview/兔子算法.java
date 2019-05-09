package interview;

public class 兔子算法 {

	public void demo() {
		long s1 = 1;
		long s2 = 1;
		long temp;
		
		for(int i = 1;i<=100;i++) {
			if(i == 1) {
				System.out.println("第" + i + "个月的兔子对数:" + s1);
			}else if(i == 2) {
				System.out.println("第" + i + "个月的兔子对数:" + s2);
			}else {
				temp = s2;
				s2 = s1 + s2;
				s1 = temp;
				System.out.println("第" + i + "个月的兔子对数:" + s2);
			}
		}
	}
}
