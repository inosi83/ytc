package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex03_1 {
	static Scanner scan = new Scanner(System.in); //�ʵ�(��������)
	public static void main(String[] args){
		
		String name = ""; //local (��������)
		
		System.out.print("���� : ");
		name = scan.nextLine();
		
		System.out.println(name + "�� �ȳ��ϼ���?");
	}

}
