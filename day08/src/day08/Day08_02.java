package day08;

public class Day08_02 {

	public static void main(String[] args) {
		// 다중 for문1

		for (int i = 1; i <= 5; i++) {
			System.out.println("O O O O O");
		}

		System.out.println("-------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("O ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("O ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("O ");
			}
			System.out.println();
		}

	}

}
