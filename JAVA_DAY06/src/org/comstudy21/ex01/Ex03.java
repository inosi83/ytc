package org.comstudy21.ex01;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = { 50, 30, 80, 70, 20, 90 };

		// 오름차순 정렬을 해서 출력하라.
		// 선택정렬, 삽입정렬, 버블정렬...
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} // if
			} // for in for
		} // for
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}// main
}// class
