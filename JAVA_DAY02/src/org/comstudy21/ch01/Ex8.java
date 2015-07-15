package org.comstudy21.ch01;

public class Ex8 {

	public static void main(String[] args){
		//변수 선언
		//자료형 변수명;
		//자료형 변수명 = 초기값;
		//주의: 멤버필드 초기화 하지않으면 기본값이 초기값.
		//	   정수타입은 0으로 객체 타입은 null로 초기값.
		//local변수(지역변수) - 함수내부에 선언 - 
		//지역변수는 초기화 하지 않으면 스레기값으로 초기화 된다. 
		//즉, 지역변수는 선언과 동시에 초기화 하는것이 관례.
		
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		result = num1 + num2; //정수를 연산하는 산술 연산.
		
		System.out.println(num1 +" + "+ num2 +" = "+ result);
		
	}
}
