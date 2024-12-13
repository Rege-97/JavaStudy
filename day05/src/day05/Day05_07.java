package day05;

import java.io.*;

public class Day05_07 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("문제. 다음 중 sky의 뜻은 무엇인지 고르시오. ");
		System.out.println("a. 하늘  b. 바다  c. 공기  d. 나무");
		System.out.print("정답 입력(알파벳) : ");
		
		int answer = System.in.read();
		System.in.skip(2);
		
		if(answer==97) {
			System.out.println("정답입니다.");
		}else
			System.err.println("틀렸습니다. 정답은 a. 하늘 입니다.");
		System.out.println("문제 종료");
	}

}
