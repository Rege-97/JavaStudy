package day14;

import java.io.*;
import java.text.BreakIterator;

public class Day14_03 {

	public static int gameStart() {
		int com = (int) (Math.random() * 3 + 1);

		System.out.println("============================");
		System.out.println("  가위 바위 보 게임 v2.0 ");
		System.out.println("----------------------------");
		System.out.println(" 1.가위 2.바위 3.보 4.종료 ");
		System.out.println("============================");
		return com;

	}

	public static int userInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int user = 0;
		do {
			System.out.print("입력 : ");
			user = Integer.parseInt(br.readLine());

			if (user <= 0 || user >= 5) {
				System.out.println("잘못 입력하였습니다.");
			} else if (user==4){
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}else {
				break;
			}

		} while (user != 4);

		return user;
	}

	public static void gameVs(int user, int com) {
		if (user != 4) {
			System.out.println("컴퓨터 : " + com);
			System.out.println("사용자 : " + user);

			System.out.println();
		}

		if ((com == 1 && user == 2) || (com == 2 && user == 3) || (com == 3 && user == 1)) {
			System.out.println("사용자 승!");
		} else if ((com == 2 && user == 1) || (com == 3 && user == 2) || (com == 1 && user == 3)) {
			System.out.println("컴퓨터 승!");
		} else if (user == com) {
			System.out.println("비겼습니다.");
		}
		System.out.println();

	}
	
	

	public static void main(String[] args) throws IOException {

		while (true) {

			int com = gameStart();

			int user = userInput();

			gameVs(user, com);

		}

	}

}
