package org.comstudy21.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9};
		//arr배열에 arr2배열을 연결 하라.
		int[] temp = new int[arr.length];
		int size = arr.length;
		
		for(int i=0; i<size; i++){
			temp[i] = arr[i];
		}
		arr = new int[temp.length + arr2.length];		
		int size1 = temp.length + arr2.length;
		for(int i=0; i<size1; i++){
			if(i<size){
				arr[i] = temp[i];
			}else{
				arr[i] = arr2[i-size];
			}
			System.out.print(arr[i]+ " ");
		}
	}
}
