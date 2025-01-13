package day23;

import java.util.*;

public class ResevationProgramm {

	HashMap<String, Boolean> map;

	public ResevationProgramm() {
		map = new HashMap<String, Boolean>();
		map.put("101", false);
		map.put("102", false);
		map.put("103", false);
		map.put("201", false);
		map.put("202", false);
		map.put("203", false);
		map.put("301", false);
		map.put("302", false);
		map.put("303", false);
	}

	public void printMenu() {
		System.out.println("==============================");
		System.out.println(" 숙박 예약 관리 프로그램 v1.0 ");
		System.out.println("------------------------------");
		System.out.println("1. 방 예약하기");
		System.out.println("2. 방 예약 취소하기");
		System.out.println("3. 방 예약 현황 보기");
		System.out.println("4. 종료");
		System.out.println("==============================");
	}

	public void roomReser(Scanner sc) {
		System.out.println("==방 예약하기==");
		System.out.print("방 번호 : ");
		String room = sc.nextLine();

		if (map.get(room)) {
			System.out.println("이미 예약된 방입니다.");
		} else {
			System.out.println(room + "호실 예약되었습니다.");
			map.put(room, true);
		}
	}

	public void roomCancle(Scanner sc) {
		System.out.println("==방 취소하기==");
		System.out.print("방 번호 : ");
		String room = sc.nextLine();

		if (map.get(room)) {
			System.out.println(room + "호실 취소되었습니다.");
			map.put(room, false);
		} else {
			System.out.println("이미 빈방입니다.");
		}
	}

	public void roomState() {
		System.out.println("==방 예약 현황==");

		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			boolean value = map.get(key);
			System.out.println(key + "호실 " + (value ? "예약됨" : "빈방"));
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ResevationProgramm rp = new ResevationProgramm();

		while (true) {
			rp.printMenu();
			System.out.print("메뉴> ");
			int user = sc.nextInt();
			sc.nextLine();

			switch (user) {
			case 1:
				rp.roomReser(sc);
				break;
			case 2:
				rp.roomCancle(sc);
				break;
			case 3:
				rp.roomState();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
		}

	}

}
