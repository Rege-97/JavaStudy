package day22;

import java.util.*;

public class StringTest {

	public static void main(String[] args) {

//		String str="사과/배/포도/딸기/귤";
		
		String str = "오늘은 금요일 난방기 30도 하지만 덜덜~";
		
		StringTokenizer st= new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			String temp =st.nextToken();
			System.out.println(temp);
		}

	}

}
