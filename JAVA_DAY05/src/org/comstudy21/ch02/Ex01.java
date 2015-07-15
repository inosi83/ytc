package org.comstudy21.ch02;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		char yn = 'y';
		String name = "";
		
		do{
			System.out.print("성명입력: ");
			name = scan.nextLine();
			System.out.println("성명: "+name);
			
			System.out.print("또 하시겠습니까? [y/n] ");
			yn = scan.nextLine().charAt(0);
			System.out.println();
			//y나 n이 아니면 다시 입력 받도록 하세요.
			while(yn != 'y'&&yn !='n'){
			System.out.print("다시입력하세요[y/n] ");
			yn = scan.nextLine().charAt(0);
			}
		}
		
		while(yn == 'y');
		System.out.println("시스템 종료! 다음 기회에~");
		
	}
}
