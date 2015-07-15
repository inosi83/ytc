package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex09 {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		double area = 0.0; //면적
		double line = 0.0; //둘레의 길이
		double r = 0.0; //반지름
		final double PI = Math.PI; //3.141592
		//final을 변수 선언시 사용하면 상수가 된다.
		
		//반지름을 입력 받아서 원의 면적과 둘레의 길이를 출력하는 프로그램.
				
		System.out.print("반지름 입력: ");
		r = scan.nextDouble();
		
		area = r * r * PI;
		line = 2 * r * PI;
		
		System.out.println("반지름 : " + r);
		System.out.println("면적 : " + new String(""+area).substring(0,6));
		System.out.println("둘레 : " + new String(""+line).substring(0,6));
		
	}
}

/*
 식별자 명명규칙(작명규칙)
 1. 영문 대/소문자, 숫자 특수문자(_,$)의 조합으로 명명한다.
 2. 한글을 사용할수 있다. (가급적 쓰지 않는것이 좋다.)
 3. 대/소문자 구분을 한다. 즉, int와 INT는 다르다.
 4. 첫글자로 숫자가 올수 없다.
 5. 예약어는 사용 금지.
 6. 중복도니 이름 사용 금지.
 7. 특수문자나 공백 포함 금지. &name, @age 등등 사용금지
 8. int _ = 30;  int $ = 50;  사용가능
 */












