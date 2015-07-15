package org.comstudy21.ex01;

public class Ex01 {

	static int add(int x, int y){
		int c = x + y;
		return c;
	}
	public static void main(String[] args) {
		
		int sum = 0;
		int a = 10;
		int b = 20;
		
		sum = add(a,b);
		
		System.out.println("sum = "+sum);
	}
}
