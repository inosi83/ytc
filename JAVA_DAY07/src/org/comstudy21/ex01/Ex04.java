package org.comstudy21.ex01;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{90, 60, 100, 70, 80};
		int max, min;
		int size = arr.length;
		//arr 배열에서 가장 큰 값은 max에 가장 작은 값은 min대입
		//for 문을 이용해서 구현하라.
		max = arr[0];
		min = arr[0];
		for(int i=0; i<size; i++){
			if(max<arr[i]){
				max = arr[i];
			}else if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.print("min : " + min);
	}
}
