package day08;

public class Day08_03 {

	public static void main(String[] args) {
		// 다중 for문2

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= i + 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
