package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex09 {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		double area = 0.0; //����
		double line = 0.0; //�ѷ��� ����
		double r = 0.0; //������
		final double PI = Math.PI; //3.141592
		//final�� ���� ����� ����ϸ� ����� �ȴ�.
		
		//�������� �Է� �޾Ƽ� ���� ������ �ѷ��� ���̸� ����ϴ� ���α׷�.
				
		System.out.print("������ �Է�: ");
		r = scan.nextDouble();
		
		area = r * r * PI;
		line = 2 * r * PI;
		
		System.out.println("������ : " + r);
		System.out.println("���� : " + new String(""+area).substring(0,6));
		System.out.println("�ѷ� : " + new String(""+line).substring(0,6));
		
	}
}

/*
 �ĺ��� ����Ģ(�۸��Ģ)
 1. ���� ��/�ҹ���, ���� Ư������(_,$)�� �������� ����Ѵ�.
 2. �ѱ��� ����Ҽ� �ִ�. (������ ���� �ʴ°��� ����.)
 3. ��/�ҹ��� ������ �Ѵ�. ��, int�� INT�� �ٸ���.
 4. ù���ڷ� ���ڰ� �ü� ����.
 5. ������ ��� ����.
 6. �ߺ����� �̸� ��� ����.
 7. Ư�����ڳ� ���� ���� ����. &name, @age ��� ������
 8. int _ = 30;  int $ = 50;  ��밡��
 */












