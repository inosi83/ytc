package org.comstudy21.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{55,65,66,88,98,100,75};
		int total = 0;
		double avg = 0.0;
		//arr배열 요소에 있는 값들의 총점과 평균을 구해서 출력하라.
		//반복문은 for 문을 사용한다.
		
		for(int i=0; i<arr.length; i++){
			total = total + arr[i];		
		}
		System.out.println("총점 : " +total);
		avg = (double)total/arr.length;
		System.out.println("평균 : "+(""+avg).substring(0,5));
	}
}
