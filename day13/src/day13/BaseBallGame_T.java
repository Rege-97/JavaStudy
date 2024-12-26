package day13;

import java.io.*;

public class BaseBallGame_T {

	public static void main(String[] args) throws IOException {
		int com[] = new int[3];

		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9 + 1);
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();

		System.out.println("==숫자 야구 게임 v1.0==");

		for (int z = 1; z <= 10; z++) {

			System.out.print("n회차 입력 : ");
			int user[] = new int[3];
			for (int i = 0; i < user.length; i++) {
				user[i] = System.in.read() - 48;
			}
			System.in.skip(2);

			for (int i = 0; i < user.length; i++) {
				System.out.print(user[i] + " ");
			}
			System.out.println();

			int strike = 0;
			int ball = 0;
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) {
						strike++;
					} else if (com[i] == user[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println("결과 : " + strike + "스트라이크 / " + ball + "볼");
			if(strike==3) {
				System.out.println("정답입니다! 축하 축하");
				System.exit(0);
			}
		}
		System.out.println("10회의 기회를 모두 소진하였습니다.");
		System.out.println("==Game Over==");
	}

}
