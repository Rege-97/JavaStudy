package day21;

import java.util.*;

public class Day21_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str_s = sc.nextLine();
		StringBuffer str = new StringBuffer(str_s);
		StringBuffer str2 = new StringBuffer(str_s);
		StringBuffer star=new StringBuffer("");

		String arr[] = { "바보", "똥개", "말미잘", "멍게", "해삼", "멍청이", "쪼다" };

		for (int i = 0; i < arr.length; i++) {
			if (str_s.contains(arr[i])) {
				str.delete(str.indexOf(arr[i]), str.indexOf(arr[i]) + arr[i].length());
				str.insert(str_s.indexOf(arr[i]), "**");

			}
		}
		System.out.println(str);
		
		
		for (int i = 0; i < arr.length; i++) {
		
			if (str_s.contains(arr[i])) {
				for(int j=0;j<arr[i].length();j++) {
					star.append("*");
				}
				
				str2.delete(str2.indexOf(arr[i]), str2.indexOf(arr[i]) + arr[i].length());
				str2.insert(str_s.indexOf(arr[i]), star);
			}
			star.delete(0, star.length());
		}
		System.out.println(str2);
	}

}
