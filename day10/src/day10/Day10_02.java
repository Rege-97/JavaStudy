package day10;

public class Day10_02 {

	public static void main(String[] args) {
		// 배열2 - 대입 가능

		int arr[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------------");

		arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
