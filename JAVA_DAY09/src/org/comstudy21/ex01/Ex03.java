package org.comstudy21.ex01;
//Point Ŭ���� ����.
//���������ڰ� ������ defalut �����������̴�.
//���� ��Ű�� �������� ���� ���� �����ϴ�.
class Point {
	int x;
	int y;
}

public class Ex03 {
	public static void main(String[] args) {
		//Point Ŭ������ �̿��ؼ� ��ü ����.
		Point pt01 = new Point();
		
		pt01.x = 30; //.�� ���� ���� �����̴�. scope
		pt01.y = 40;
		
		System.out.println("pt01.x = "+pt01.x);
		System.out.println("pt01.y = "+pt01.y);
	}//main
}//class