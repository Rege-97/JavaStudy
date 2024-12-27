package day14;

import java.io.*;

public class Day14_02 {

	public static int[] inputArr() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 수 : ");
			arr[i] = Integer.parseInt(br.readLine());
		}

		return arr;
	}

	public static void printArr(int arr[]) {
		System.out.println("========================");

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static void sortArr(int arr[]) {
		int temp = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// 메서드 실습

		int arr[] = inputArr();

		printArr(arr);

		sortArr(arr);

		printArr(arr);

	}

}
