package org.comstudy21.ex01;

public class Ex05 {

	public static void main(String[] args) {

		int[] arr = new int[] { 60, 90, 80, 70, 100 };
		int[] arr2 = new int[] { 6, 9, 8, 7, 10 };
		int[] arr3;
		arr3 = new int[arr.length + arr2.length];	
		// arr3�迭�� arr�迭�� arr2�迭�� ������ ���Ķ�.
		
		int size1 = arr.length;
		int size3 = arr.length + arr2.length;
		
		for (int i = 0; i < size3; i++) {
			if(i<size1){
				arr3[i] = arr[i];
			} else {
				arr3[i] = arr2[i-size1];
			}
			System.out.print(arr3[i]+ " ");
		}
	}
}