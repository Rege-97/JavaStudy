package day22;

import java.util.*;

public class Sukbak {

	// 해쉬맵에 방을 생성하는 메서드
	public static void roomSet(HashMap<String, String> map) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				map.put(i + "0" + j, "빈방");
			}
		}
	}

	// 메뉴를 출력하고 입력값을 받는 메서드
	public static int menu(Scanner sc) {
		System.out.println();
		System.out.println("=====================");
		System.out.println("숙박관리프로그램 v1.0");
		System.out.println("---------------------");
		System.out.println("1. 방 예약하기");
		System.out.println("2. 방 취소하기");
		System.out.println("3. 방 현황보기");
		System.out.println("4. 종료");
		System.out.println("=====================");
		System.out.print("메뉴 > ");
		int user_m = sc.nextInt();

		return user_m;

	}
	
	// 입력에 따라 기능을 수행하는 메서드
	public static int run(Scanner sc, HashMap<String, String> map, int user_m) {
		String room = "";

		switch (user_m) {
		case 1:
			System.out.println();
			System.out.println("== 방 예약 ==");
			System.out.print("방 번호 : ");
			room = sc.next();
			
			// 방번호를 입력받고 입력받은 방 번호의 키값에 해당해는 밸류값이 빈방이면
			// 예약 메세지 출력 후 해당 키값에 예약됨의 데이터를 다시 입력
			if (map.get(room).equals("빈방")) {
				System.out.println(room + "호가 예약되었습니다.");
				map.put(room, "예약됨");
			} else if (map.get(room).equals("예약됨")) {
				System.out.println("이미 예약된 방 입니다.");
			}
			break;
		case 2:
			System.out.println();
			System.out.println("== 방 예약 취소 ==");
			System.out.print("방 번호 : ");
			room = sc.next();
			
			// 방번호를 입력받고 입력받은 방 번호의 키값에 해당해는 밸류값이 예약됨이면
			// 취소 메세지 출력 후 해당 키값에 빈방의 데이터를 다시 입력
			if (map.get(room).equals("빈방")) {
				System.out.println(room + "호는 이미 빈방입니다.");
			} else if (map.get(room).equals("예약됨")) {
				System.out.println(room + "호가 예약 취소되었습니다.");
				map.put(room, "빈방");
			}
			break;
			
			
		case 3:
			System.out.println();
			System.out.println("== 방 예약 상태 ==");
			
			// 키값 뽑을 준비
			Iterator<String> keys = map.keySet().iterator();
			int arr1[] = new int[map.size()];
			String arr2[] = new String[map.size()];
			int i = 0;
			
			// 키값을 arr1, 밸류 값을 arr2에 저장
			while (keys.hasNext()) {
				String key = keys.next();
				arr1[i] = Integer.parseInt(key);
				arr2[i] = map.get(key);
				i++;
			}
			int temp1 = 0;
			String temp2 = "";

			// 선택정렬로 arr1과 arr2를 정렬
			for (int j = 0; j < arr1.length; j++) {
				for (int k = j + 1; k < arr1.length; k++) {
					if (arr1[j] > arr1[k]) {
						temp1 = arr1[j];
						temp2 = arr2[j];
						
						arr1[j] = arr1[k];
						arr2[j] = arr2[k];
						
						arr1[k] = temp1;
						arr2[k] = temp2;
					}
				}
			}
			// 출력 
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[j] + "호 : ");
				System.out.print(arr2[j]);
				System.out.println();
			}

			break;
			
			// 프로그램 종료
		case 4:
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
			break;
			// 1~4 이외의 숫자 입력 시 다시 입력 출력
		default:
			System.out.println();
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
		}
		
		// while문을 종료시킬 조건을 위해 입력값 반환
		return user_m;
	}

	public static void main(String[] args) {

		
		// 방번호(key)와 빈방여부(value)를 담을 해쉬맵 생성
		HashMap<String, String> map = new HashMap<String, String>();
		// 해쉬맵에 방 정보 입력 메서드 실행
		roomSet(map);

		// 무한 반복을 위해 while 사용
		while (true) {
		
			
			//메뉴 출력 및 입력 메서드 실행
			try {
			Scanner sc = new Scanner(System.in);
			int user_m = menu(sc);
			if (user_m == 4) {
				break;
			}
			
			// 실행 메서드에서 입력값에 대한 예외를 처리하기 위해 try~catch문 사용
			
				user_m = run(sc, map, user_m);
			} catch (NullPointerException e) {	
				System.out.println("방 번호를 잘못 입력했습니다.");
				System.out.println("메뉴로 돌아갑니다.");
				
			} catch (InputMismatchException e) {
				System.out.println("메뉴는 숫자만 입력이 가능합니다.");
				System.out.println("다시 입력해주세요.");

			} catch (Exception e) {
				System.out.println("알 수 없는 오류 발생");
				System.out.println("고객센터 문의 바람");
				continue;
			}
			// 실행 메서드에서 반환된 입력값이 4면 while문 종료

			

		}
	}

}
