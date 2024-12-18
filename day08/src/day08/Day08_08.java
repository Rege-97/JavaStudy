package day08;

public class Day08_08 {

	public static void main(String[] args) {
		// 보조제어문

//		for (int j = 1; j <= 5; j++) {
//			for (int i = 1; i <= 10; i++) {
//				if (i == 5) {
//					break;
//				}
//				System.out.println(i);
//			}
//		}

		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 10; i++) {
				if (i == 5) {
					continue;
				}
				System.out.println(i);
			}
		}

	}

}
