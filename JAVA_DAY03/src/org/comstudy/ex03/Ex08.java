package org.comstudy.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args){
		//switch ~case 문을 이용해서 월의 총 날짜를 출력하는 프로그램.
		//월 입력: 2
		//2월 28일까지 있다.
		Scanner scan = new Scanner(System.in);
		
		int month = 0;
		int day = 31;
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
		
		switch(month){
		case 2: day = 28; break;
		case 4: 
		case 6:  
		case 9:  
		case 11: day = 30; break;
		
		}
		System.out.print(month + "월은 "+ day +"일 까지 있다.");
	}
}
