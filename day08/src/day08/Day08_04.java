package day08;

public class Day08_04 {

	public static void main(String[] args) {
		// 다중 for문3

//		for (int i = 5; i > 0; i--) {
//			for (int j = i; j <= i + 4; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 5; i++) {
			for (int j = 5-i; j <=9- i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
