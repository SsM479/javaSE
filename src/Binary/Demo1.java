package Binary;

public class Demo1 {
	public static void main(String[] args) {
//		int n = 50;
//		System.out.println(Integer.toBinaryString(n));
//		System.out.println(n);
		
		//输出0～50的全部二进制
//		for(int i = 0;i < 51;i++) {
//			System.out.println(Integer.toBinaryString(i));
//			System.out.println(i);
//		}
		
		
//		int n = 0x77af5eea;
//		System.out.println(Integer.toBinaryString(n));
		
//		int n = -2;
//		System.out.println(Integer.toBinaryString(n));
		
		//补码编码的规律
		
		int n=-1;
		System.out.println(Integer.toBinaryString(n));
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
	}
}
