package day11;

import java.io.*;

public class Day11_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[][] = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				System.out.print((i + 1) + "번째 " + (j + 1) + "번째 수 : ");
				arr[i][j] = Integer.parseInt(br.readLine());
			}
			arr[i][2]=arr[i][0]+arr[i][1];
		}

		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i][0] + " + " + arr[i][1] + " = " + arr[i][2]);
		}
		
	}

}
