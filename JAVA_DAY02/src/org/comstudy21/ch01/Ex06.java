package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		String name;
		int age;
		double �÷�;
		
		
		//Scnner�� �ڹ� 1.5���� ���ĺ��� ����
		//java.util.Scanner�� import �ؾ� �Ѵ�.
		System.out.print("���� : ");
		name = scan.nextLine();
		System.out.print("���� : ");
		age = scan.nextInt();
		System.out.print("�÷� : ");
		�÷� = scan.nextDouble();
		
		System.out.printf("����:%s, ����:%d, �÷�:%.1f \n", name, age, �÷�);
	}//end of main
}
