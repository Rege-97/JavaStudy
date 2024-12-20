package day10;

public class Day10_01 {

	public static void main(String[] args) {
		// 배열1

		// 변수 선언
		int var;
		// 변수 초기화
		var = 10;

		// 배열 선언
		int arr[];
		// 메모리 생성
		arr = new int[3];

		// 배열 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		// 배열 출력
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);

		// 배열의 크기 출력
		System.out.println("arr의 크기 : " + arr.length);

		// 선언과 동시에 생성 후 초기화
		double arr2[] = new double[5];
		arr2[0] = 10.1;
		arr2[1] = 20.2;
		arr2[2] = 30.3;
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		System.out.println("arr2[2] = " + arr2[2]);
		System.out.println("arr2[3] = " + arr2[3]);
		System.out.println("arr2[4] = " + arr2[4]);

		// 선언, 생성, 초기화를 한번에
		int arr3[] = { 10, 20, 30, 40, 50, 60, 70 };

		// for문을 사용한 배열의 출력
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}

	}

}
