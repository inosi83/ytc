package org.comstudy21.ex01;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int i = 0;
		// 첨자는 상수와 변수 모두 사용가능.
		arr[i++] = 30; // i: 0 -> 1
		arr[i++] = 70; // i: 2 -> 2
		arr[i++] = 40;
		arr[i++] = 90;
		arr[i++] = 80;
		System.out.println("i => " + i); // 5
		// 배열은 for문과 잘 어울린다.
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] => " + arr[i]);
		}
	}// main
}// class
