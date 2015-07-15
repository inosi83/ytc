package org.comstudy21.ex01;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{60, 90, 80, 70, 100};
		int[] arr2;
		arr2 = new int[arr.length];
		int size = arr.length;
		//위치가 reverse 되도록한다.
		for(int i=0; i<size; i++){
				arr2[i] = arr[(size-1)-i];		
				System.out.print(arr2[i]+" ");
		}	
	}
}
