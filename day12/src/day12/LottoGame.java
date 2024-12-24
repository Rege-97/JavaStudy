package day12;

import java.io.*;

public class LottoGame {

	public static void main(String[] args) throws IOException {
		// 로또번호생성기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 프로그램 소개
		System.out.println("===========================================");
		System.out.println("    ★대 박 기 원 로 또 번 호 생 성 기★");
		System.out.println("===========================================");

		// 프롬프트 및 입력
		System.out.print("  몇개의 로또번호를 생성하시겠습니까? : ");
		int game = Integer.parseInt(br.readLine());

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
