package day10;

import java.io.*;

public class Day10_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("몇명의 시험점수를 입력하시겠습니까? : ");
		int user = Integer.parseInt(br.readLine());

		int arr[] = new int[user];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번 시험점수 : ");

			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / (double) arr.length;

		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");

	}

}
