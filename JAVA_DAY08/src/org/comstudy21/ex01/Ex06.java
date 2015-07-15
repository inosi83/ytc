package org.comstudy21.ex01;

public class Ex06 {

	/*
	 * 1 2 3 4 5 
	 * 10 9 8 7 6 
	 * 11 12 13 14 15 
	 * 20 19 18 17 16 
	 * 21 22 23 24 25
	 */
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = cnt++;
				} else {
					arr[i][4-j] = cnt++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
