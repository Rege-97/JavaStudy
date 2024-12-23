package day11;

import java.io.*;

public class Day11_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[][] = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 2; j++) {
				System.out.print((i + 1) + "번 학생의 " + (j + 1) + "번 시험점수 : ");
				arr[i][j] = Integer.parseInt(br.readLine());
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / (arr.length - 2);
		}

		System.out.println("------------------------------------------");
		System.out.println("점수1\t점수2\t점수3\t합계\t평균\t");
		System.out.println("------------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		System.out.println("점수1\t점수2\t점수3\t합계\t평균\t");
		System.out.println("------------------------------------------");
		

		int temp[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] < arr[j][4]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
	}

}
