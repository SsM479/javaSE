package file;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入行数:");
		int row = sca.nextInt();
		if(row<3||row>21) {
			System.out.println("非法行数!");
			return;
		}else {
			for(int i = row;i > 0;i--) {
				for(int j = 2*i-1;j > 0 ;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
