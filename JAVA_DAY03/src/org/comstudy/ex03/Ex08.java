package org.comstudy.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args){
		//switch ~case ���� �̿��ؼ� ���� �� ��¥�� ����ϴ� ���α׷�.
		//�� �Է�: 2
		//2�� 28�ϱ��� �ִ�.
		Scanner scan = new Scanner(System.in);
		
		int month = 0;
		int day = 31;
		
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		
		switch(month){
		case 2: day = 28; break;
		case 4: 
		case 6:  
		case 9:  
		case 11: day = 30; break;
		
		}
		System.out.print(month + "���� "+ day +"�� ���� �ִ�.");
	}
}
