package org.comstudy21.ex01;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int i = 0;
		// ÷�ڴ� ����� ���� ��� ��밡��.
		arr[i++] = 30; // i: 0 -> 1
		arr[i++] = 70; // i: 2 -> 2
		arr[i++] = 40;
		arr[i++] = 90;
		arr[i++] = 80;
		System.out.println("i => " + i); // 5
		// �迭�� for���� �� ��︰��.
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] => " + arr[i]);
		}
	}// main
}// class