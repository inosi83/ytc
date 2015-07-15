package org.comstudy21.ex01;
//접근지정자를 생략하면 default 접근지정자
//default 접근 지정자로 선언한 클래스는 같은 피키지에 중복안됨.
class Point2 {
	private int x;
	private int y;
	//일반적으로 클래스의 필드는 private 맴버로 선언.
	//일반적으로 클래스의 메소드는 public 맴버로 선언.
	public void setX(int value){
		x=value;
	}
	public void setY(int value){
		y=value;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		
		Point2 pt01 = new Point2();
//		pt01.x = 100;
//		pt01.y = 200;
//		
//		System.out.println("pt01.x = "+pt01.x);
//		System.out.println("pt01.y = "+pt01.y);
		pt01.setX(150);
		pt01.setY(200);
		System.out.println("pt01.getX() = " + pt01.getX());
		System.out.println("pt01.getY() = " + pt01.getY());
	}
}
