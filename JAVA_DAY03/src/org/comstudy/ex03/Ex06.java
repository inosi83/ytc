package org.comstudy.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args){
		
		String mode = "";
		int no = 0;
		Scanner scan = new Scanner(System.in);
		//�������� �۹̼� ���� ���
		System.out.println("(1)�б� (2)���� (3)����");
		System.out.print("���� : ");
		no = scan.nextInt();
		
		switch(no){
		case 3: mode = " ���� "; //break�� �����ϸ� ���� case�� ����.
		case 2: mode += " ���� ";
		case 1: mode += " �б� 3";
		}
		
		System.out.println("���: "+ mode);
	}
}
