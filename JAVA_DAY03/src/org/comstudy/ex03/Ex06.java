package org.comstudy.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args){
		
		String mode = "";
		int no = 0;
		Scanner scan = new Scanner(System.in);
		//리눅스의 퍼미션 설정 모양
		System.out.println("(1)읽기 (2)쓰기 (3)실행");
		System.out.print("선택 : ");
		no = scan.nextInt();
		
		switch(no){
		case 3: mode = " 실행 "; //break를 생략하면 다음 case도 실행.
		case 2: mode += " 쓰기 ";
		case 1: mode += " 읽기 3";
		}
		
		System.out.println("기능: "+ mode);
	}
}
