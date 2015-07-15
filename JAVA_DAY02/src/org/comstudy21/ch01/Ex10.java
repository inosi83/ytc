package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex10 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
	
		int 숫자 = 0;
		String 타입 = "";
				
				System.out.print("정수입력: ");
		숫자 = scan.nextInt();
		
		if(숫자 < 0) {
			타입 = "음수";
			} else{
				타입 = "양수";
				if(숫자 == 0) {
					타입 = "0";
				}
			}
		System.out.println("입력한 숫자"+ 숫자 +"는 "+ 타입 +"입니다.");
	}
}



/*
IF문
의미: 조건1이 참이면 실행1을 하고 조건1이 거짓이면 실행1을 생략.
조건에는 논리값이 들어간다.
if(조건1) {
   실행1;
   }
   ------------------------------
   
IF~ELSE 문
의미: 조건1이 참이면 실행1을 하고 조건1이 거짓이면 실행2를 한다.

if(조건1) {
	실행1;
} else {
	실행2;
}
------------------------------
의미: 조건1이 참이면 실행1을 하고 조건2가 참이면 실행2를 하고 
	조건3이 참이면 실행3을 하고 조건n이 참이면 실행n을 하고, 
	아무것에도 조건이 맞지않으면 else문 이하를 한다.

if(조건1) {
	실행1;
} else if(조건2) {
	실행2;
} else if(조건3) {
	실행3;
} else if(조건n) {
	실행n;
} else {
	그밖의 실행;
*/