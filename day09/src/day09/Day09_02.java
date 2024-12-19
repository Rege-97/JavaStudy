package day09;

import java.io.*;

public class Day09_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int user = 0;
		int com = 0;

		String user_s = "보";
		String com_s = "보";

		while (true) {
			System.out.println("============================");
			System.out.println("  가위 바위 보 게임 v1.0 ");
			System.out.println("----------------------------");
			System.out.println(" 1.가위 2.바위 3.보 4.종료 ");
			System.out.println("============================");

			do {
				System.out.print("메뉴 > ");
				user = Integer.parseInt(br.readLine());
				com = (int) (Math.random() * 3 + 1);
				System.out.println();

				if (user >= 5 || user <= 0) {
					System.out.println("잘못 입력하였습니다.");
				} else if (user <= 3) {
					break;
				}

			} while (user != 4);

			if (user == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (user == 1) {
				user_s = "가위";
			} else if (user == 2) {
				user_s = "바위";
			} else {
				user_s = "보";
			}

			if (com == 1) {
				com_s = "가위";
			} else if (com == 2) {
				com_s = "바위";
			} else {
				com_s = "보";
			}

			System.out.println("사용자 : " + user + "." + user_s);
			System.out.println("컴퓨터 : " + com + "." + com_s);
			System.out.println();

			if (user == 1) {
				if (com == 1) {
					System.out.println("비겼습니다.");
				} else if (com == 2) {
					System.out.println("컴퓨터 승!");
				} else {
					System.out.println("사용자 승!");
				}
			} else if (user == 2) {
				if (com == 1) {
					System.out.println("사용자 승!");
				} else if (com == 2) {
					System.out.println("비겼습니다.");
				} else {
					System.out.println("컴퓨터 승!");
				}
			} else if (user == 3) {
				if (com == 1) {
					System.out.println("컴퓨터 승!");
				} else if (com == 2) {
					System.out.println("사용자 승!");
				} else {
					System.out.println("비겼습니다.");
				}
			}

//			switch (user - com) {
//			case 2:
//			case -1:
//				System.out.println("컴퓨터 승!");
//				break;
//			case 1:
//			case -2:
//				System.out.println("사용자 승!");
//				break;
//			case 0:
//				System.out.println("비겼음!");
//				break;
//			}

//			if (user == com) {
//				System.out.println("비겼음!");
//			} else if ((user + 1) % 3 == com % 3) {
//				System.out.println("컴퓨터 승!");
//			} else {
//				System.out.println("사용자 승!");
//			}

			System.out.println();
		}
	}

}
