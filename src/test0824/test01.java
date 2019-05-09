package test0824;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Map<String,Integer> api = new HashMap<String,Integer>();
		Scanner sca = new Scanner(System.in);
		while(true) {
			System.out.println("是否更新?(YES/NO)");
			String ifAdd = sca.next().toUpperCase();
			if("NO".equals(ifAdd)) {
				break;
			}
			System.out.print("请输入地区:");
			String area = sca.next();
			System.out.print("请输入PM值:");
			int pm = sca.nextInt();
			if(api.containsKey(area)) {
				Integer oPM = api.get(area);
				if(oPM<pm) {
					api.put(area, pm);
				}
			}else {
				api.put(area, pm);
			}
		}
		
		api.forEach((k,v)->System.out.println(k+":"+v));
	}
}
