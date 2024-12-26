package day13;

public class Day13_04 {

	public static void refTest(int arr[]) {

		arr[2] = 1004;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// 메서드 4 - call by reference

		int arr[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		refTest(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
