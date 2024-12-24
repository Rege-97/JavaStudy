package day12;

import java.io.*;

public class LottoGame {

	public static void main(String[] args) throws IOException {
		// 로또번호생성기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 프로그램 소개
		System.out.println("===========================================");
		System.out.println("    ★대 박 기 원 로 또 번 호 생 성 기★");
		System.out.println("           최대 99개 생성 가능!");
		System.out.println("===========================================");

		// 입력 자리수 검사를 위해 10의 자리와 1의 자리와 엔터값을 넣을 배열을 생성
		int arr_g[] = new int[3];
		int game = 0;
		boolean bool = false;

		// 프롬프트 및 입력 및 잘못 입력시 다시 입력 검증
		while (bool == false) {
			System.out.print("  몇개의 로또번호를 생성하시겠습니까? : ");
			// 배열에 숫자를 넣으면 차례대로 버퍼에서 입력
			for (int i = 0; i < 2; i++) {
				arr_g[i] = System.in.read() - 48;
			}
			// 버퍼에 남은 엔터 값을 마지막 칸에 입력
			arr_g[2] = System.in.read();

			// 백의 자리를 입력 시 arr_g[2]의 값이 -48을 안하여 13보다 무조건 크므로 잘못 입력 출력
			// 0을 입력해도 다시 입력 출력
			if (arr_g[2] > 13 || arr_g[0] == 0) {
				System.out.println("   잘못 입력했습니다. 다시 입력해주세요.");
				System.out.println();
				System.in.skip(2048); // 버퍼 초기
			} else if (arr_g[2] == 13) { // 10의 자리까지 입력 시 [2]의 값이 13이 되므로 각 자리수 더해서 game에 저장

				game = (arr_g[0] * 10) + arr_g[1];
				bool = true;

			} else if (arr_g[2] == 10) { // 1의 자리 수 입력 시 [2]의 값이 10이 되므로 [0] game에 저장
				game = arr_g[0];
				bool = true;
			}
		}

		// 로또 번호 배열 생성
		int arr[][] = new int[game][6];

		// 랜덤 번호 입력
		for (int i = 0; i < game; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = (int) (Math.random() * 45 + 1);
			}
		}

		// 중복값 확인 후 있으면 다시 번호 생성
		for (int i = 0; i < game; i++) {
			for (int j = 0; j < 6; j++) {
				for (int z = 0; z < 6; z++) {
					if (arr[i][j] == arr[i][z] && j != z) {
						arr[i][j] = (int) (Math.random() * 45 + 1);
						j--;
						break;
					}
				}
			}
		}

		// 결과 표시
		System.out.println();
		System.out.println("①\t②\t③\t④\t⑤\t⑥");
		System.out.println("-------------------------------------------");

		for (int i = 0; i < game; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
