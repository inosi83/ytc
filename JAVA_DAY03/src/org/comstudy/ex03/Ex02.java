package org.comstudy.ex03;

import java.util.Scanner;

public class Ex02 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		double d = Math.random()*100;
		int num = (int)Math.floor(d);//casting~
		int userNum = 0;
		
		
		System.out.println("num => " + num);
		System.out.print("숫자입력 : ");
		userNum = scan.nextInt();
		
		
		//userNum에 사용자가 숫자를 입력해서
		//num에 담긴 난수와 일치하는 판별하는 프로그램.
		//일치 하지 않는다면 더 큰 숫자인지 작은 숫자인지 구분
		if(num == userNum){
			System.out.print("입력 숫자가 같습니다.");
		}else {
			if(num < userNum){
			System.out.print("입력 숫자가 큽니다.");
			}else{
			System.out.print("입력 숫자가 작습니다");
			}
		}
	}
}
