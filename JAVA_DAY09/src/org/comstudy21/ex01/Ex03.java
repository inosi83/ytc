package org.comstudy21.ex01;
//Point 클래스 선언.
//접근지정자가 없으면 defalut 접근지정자이다.
//같은 패키지 내에서는 서로 접근 가능하다.
class Point {
	int x;
	int y;
}

public class Ex03 {
	public static void main(String[] args) {
		//Point 클래스를 이용해서 객체 생성.
		Point pt01 = new Point();
		
		pt01.x = 30; //.은 범위 지정 연산이다. scope
		pt01.y = 40;
		
		System.out.println("pt01.x = "+pt01.x);
		System.out.println("pt01.y = "+pt01.y);
	}//main
}//class
