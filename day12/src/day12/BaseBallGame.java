package day12;

import java.io.*;
import java.util.Arrays;

public class BaseBallGame {

	public static void main(String[] args) throws IOException {
		// 숫자 야구 게임

		int com[] = new int[3];

		// 정답 랜덤 입력
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9 + 1);
		}
		// 중복값 체크
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < com.length; j++) {
				if (com[i] == com[j] && i != j) {
					com[i] = (int) (Math.random() * 9 + 1);
					i--;
					break;
				}
			}
		}

		// 게임 소개
		System.out.println("====================================================");
		System.out.println("            ＊숫 자 야 구 게 임 v1.0＊");
		System.out.println("----------------------------------------------------");
		System.out.println("1 ~ 9까지 숫자 세개를 공백으로 구분해서 입력하세요.");
		System.out.println("                   (ex : 1 2 3)");
		System.out.println("====================================================");
		System.out.println();
		System.out.println(Arrays.toString(com));
		int user[] = new int[3];
		int num_count = 0;
		int s_count = 0;
		int b_count = 0;
		boolean bool = true;

		// 게임 로직

		// 게임 횟수 10회 반복 설정
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "회차 입력 : ");

			// user 배열에 입력(공백 구분 위해 skip 1)
			for (int j = 0; j <= 2; j++) {
				user[j] = System.in.read() - 48;
				System.in.skip(1);

			}

			// 입력값 검사

			// 숫자가 아닌 문자를 잘못 입력했을 시 i를 1 감소시켜 해당 회차 다시 진행
			for (int j = 0; j <= 2; j++) {
				if (user[j] > 9 || user[j] < 1) {
					System.out.println("잘못 입력했습니다.");
					System.out.println();
					bool = false;
					break;
				}
			}
			if (bool == false) {
				System.in.skip(2);
				i--;
				bool = true;
				continue;
			}

			// 중복된 수 입력 검사

			// 중복된 수가 입력되면 카운트하고 카운트가 한번이라도 됐으면 i를 1 감소시켜 해당 회차 다시 진행
			for (int j = 0; j < user.length; j++) {
				for (int z = 0; z < user.length; z++) {
					if (user[j] == user[z] && j != z) {
						num_count++;
						j--;
						break;
					}
				}
				if (num_count >= 1) {
					System.out.println("중복된 숫자를 입력하면 안돼요~");
					System.out.println();
					System.in.skip(2);
					i--;
					break;
				}
			}
			if (num_count >= 1) {
				num_count = 0;
				continue;
			}

			// 비교하여 값이 같을 때 자리가 같으면 스트라이크 카운트 1+ 자리가 다르면 볼 카운트 1+
			for (int j = 0; j <= 2; j++) {
				for (int z = 0; z <= 2; z++) {
					if (com[j] == user[z]) {
						if (j == z) {
							s_count++;
						} else {
							b_count++;

						}
					}

				}
			}

			// 스트라이크 카운트가 3회면 성공 메세지 표시 후 프로그램 종료
			// 카운트가 아예 없으면 다시 시도 문구 출력 후 다음 횟수 반복 시작
			if (s_count == 3) {
				System.out.print(" " + s_count + "스트라이크 성공!");
				System.exit(0);
			} else if (s_count == 0 && b_count == 0) {
				System.out.println("다시 생각해보세요~");
				System.out.println();
				System.in.skip(2);
				continue;
			}

			// 쌓인 카운트들 출력
			System.out.print("힌트 :");
			if (s_count > 0) {
				System.out.print(" " + s_count + "스트라이크 ");
			}
			if (b_count > 0) {
				System.out.print(" " + b_count + "볼 ");
			}

			// 다시 카운트를 세기 위해 0으로 초기화
			s_count = 0;
			b_count = 0;
			System.in.skip(2);
			System.out.println();
			System.out.println();
		}
		// 10회를 반복할 동안 프로그램이 종료되지 않으면 반복문을 나와서 실패 출력
		System.out.println("실패!");
	}

}
