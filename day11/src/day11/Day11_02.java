package day11;

public class Day11_02 {

	public static void main(String[] args) {
		// 2차원 배열1

		// 1. 선언
		int arr[][];

		// 2. 생성
		arr = new int[4][3];

		// 3. 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		// arr[0][2] = 30;
		arr[1][0] = 40;

		System.out.println("arr[0][0] = " + arr[0][0]);
		System.out.println("arr[1][0] = " + arr[1][0]);
		System.out.println("arr[2][0] = " + arr[2][0]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
