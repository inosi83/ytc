package org.comstudy.ex03;

public class Ex11 {

	//����:
	//1+2+3+4+5+6+7+8+9+10=55
	//1+2-3+4-5+6-7+8-9+10=7
	//1+1+2+3+5+8+13+21=54
	//1+1-2+3-5+8-13+21=14
	public static void main(String[] args){
		
		int sum = 0;
		
		for(int i=1; i<=10; i++){
			System.out.print(i + (i == 10 ? "=" : "+"));
			sum = sum + i;
		}
		System.out.print(sum);
	}
}
