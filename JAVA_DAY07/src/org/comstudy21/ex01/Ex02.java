package org.comstudy21.ex01;

public class Ex02 {

	public static void main(String[] args) {
	
		int[] arr = new int[]{60, 90, 80, 70, 100};
		int[] arr2;
		arr2 = new int[arr.length];
		//arr�迭�� ��Ұ��� arr2�迭�� ��� ���.
		int i=0;
		for(i=0; i<arr.length; i++){
		arr2[i] = arr[i];
		System.out.print(arr2[i] + " ");
		}		
	}
}