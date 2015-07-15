package org.comstudy.ex03;

public class Ex10 {

	public static void main(String[] args){
		
		int sum = 0;
		final int MAX = 10;
		
		for(int i=1; i<=MAX; i++){
			System.out.print(i+ (i==MAX ? "=" :"+"));
			sum = sum+i;
		}
		
		System.out.println(sum);
	}
}
