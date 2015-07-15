package org.comstudy.ex03;

public class Ex13 {

	public static void main(String[] args){
		int pre = 0;
		int cur = 1;
		int next = 0;
		int sum = 0;
		while(cur<=21){
			System.out.print(cur + ( cur==21?"=":"+"));
			
			sum = sum + cur;
			next = pre + cur;
			pre = cur;
			cur = next;
		}
		System.out.print(sum);
	}
}

/*
public static void main(String[] args){
		//����:
		//1+2+3+4+5+6+7+8+9+10=55
		//1+2-3+4-5+6-7+8-9+10=7    
		//1+1+2+3+5+8+13+21=54	<----
		//1+1-2+3-5+8-13+21=14
		int sum = 0;
		int a=0, b=1, c=1;
		
		for(int i=1; i<=8; i++){
			System.out.print(c+(i == 8 ? "=" : "+"));
			sum = sum+c;
			c = a + b;
			a = b;
			b = c;			
		}
			System.out.print(sum);
	}
}
*/