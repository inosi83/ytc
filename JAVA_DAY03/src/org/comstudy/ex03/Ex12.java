package org.comstudy.ex03;

public class Ex12 {
		//����:
		//1+2+3+4+5+6+7+8+9+10=55
		//1+2-3+4-5+6-7+8-9+10=7    <----
		//1+1+2+3+5+8+13+21=54
		//1+1-2+3-5+8-13+21=14
	public static void main(String[] args){
		
		int sum = 2;
		boolean flag = true;
		for(int i=1; i<=10; i++){
			
			if(flag == true){
				System.out.print(i + (i==10? "=":"+"));
				sum = sum-i;
				flag = false;
			} else {
				System.out.print(i + (i==10? "=":"-"));
				sum += i;
				flag = true;
			} 
		}
		System.out.print(sum);
		
	}
}
/*
 	public static void main(String[] args){
		
		int sum = 0;
		
		for(int i=1; i<=10; i++){
			
			if(i == 1){
				sum = sum + i;
				System.out.print(i);
			} else if(i%2 > 0){
				sum = sum - i;
				System.out.print( "-" + i);
			} else if(i%2 == 0){
				sum = sum + i;
				System.out.print("+" + i);
			}
			
		}
		System.out.print("=" + sum);
		
	}
}
 */
