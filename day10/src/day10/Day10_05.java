package day10;

import java.io.*;

public class Day10_05 {

	public static void main(String[] args) throws IOException {
		// 배열 실습

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번 시험점수 : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

}
