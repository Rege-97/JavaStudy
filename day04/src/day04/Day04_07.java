package day04;

import java.io.*;

public class Day04_07 {

	public static void main(String[] args) throws IOException{
		// 문자열 입력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요 : ");
		String name = br.readLine();
		
		System.out.println("당신의 이름은? : "+ name);

	}

}
