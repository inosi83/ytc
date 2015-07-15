package org.comstudy21.ex01;

public class Ex08 {

	/*
	 * 1 2 3 4 5 
	 * 	 6 7 8 
	 *     9 
	 *   10 11 12 
	 *13 14 15 16 17
	 */

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int cnt = 1;

		for (int i = 0; i < 5; i++) {
			int start = i<2 ? i : 4-i;
			int end = i<2 ? 5-i : i+1;

			for (int j =start; j < end; j++) {
				arr[i][j] = cnt++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j]==0? " " :arr[i][j])+"\t");
			}
			System.out.println();
		}
	}
}
