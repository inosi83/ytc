package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex01 {
//	*******
//	**    *
//	* *   *
//	*  *  *
//	*   * *
//	*    **
//	*******

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ũ��: ");
		int size = scan.nextInt();
		
		for(int i=0;i<size;i++){
			for(int j=0; j<size; j++){
				if(j==0 || i==size-1 || i==j+(size/2) 
						||i==j-(size/2) || i==-j+(size/2) || i==-j+3*(size/2)
						|| i==0 || j==size-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
	}
	// *********
	// **** ****
	// ***   ***
	// **     **
	// *       *
	// **     **
	// ***   ***
	// **** ****
	// *********
	public static void homework07(String[] args) {
		int size = 5;
		for(int i=0; i<9; i++){
			for(int j=0;j<9;j++){
				System.out.print(j>=size&&j<9-size ? " " : "*");
			}
			System.out.println();
			size =i<4 ? size-1 : size+1;
		}
	}
		

	
//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
	public static void homework06(String[] args) {
		int size = 4;
		for(int i=0; i<9; i++){
			for(int j=0; j<5; j++){
				System.out.print(j<size ? " ":"*");
			}
			System.out.println();
			size = i<4 ? size-1:size+1;
		}
	}

	//     *
	//    ***
	//   *****
	//  *******
	// *********
	//  *******
	//   *****
	//    ***
	//     *
	public static void homework05(String[] args) {
		int size = 4;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 - size; j++) {
				System.out.print(j < size ? " " : "*");
				
			}
			System.out.println();
			size = i < 4 ? size - 1 : size + 1;
		}
	}// main

	// *********
	// *******
	// *****
	// ***
	// *
	public static void homework04(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9 - i; j++) {
				System.out.print(j < i ? " " : "*");
			}
			System.out.println();
		}

	}

	// *
	// ***
	// *****
	// *******
	// *********
	public static void homework03(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 + i; j++) {
				System.out.print(j < 4 - i ? " " : "*");
			}
			System.out.println();
		}

	}

	public static void homework02(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		// **
		// ***
		// ****
		// *****
		int size = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j < size ? " " : "*");
			}
			size = i < 4 ? size + 1 : size - 1;
			System.out.println();
		}
	}

	public static void homework01(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		// **
		// ***
		// ****
		// *****
		int size = 5;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println();

			size = i < 4 ? size - 1 : size + 1;
			// if(i<4){
			// size--;
			// }else{
			// size++;
			// }//else
		} // for
	}
}
