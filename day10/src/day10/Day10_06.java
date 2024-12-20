package day10;

import java.io.*;

public class Day10_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번 시험점수 : ");

			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / (double)arr.length;

		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");

	}

}
