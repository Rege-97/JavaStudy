package day08;

public class Day08_05 {

	public static void main(String[] args) {
		// 다중 for문 4
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}

	}

}
