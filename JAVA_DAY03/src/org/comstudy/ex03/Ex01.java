package org.comstudy.ex03;

import java.util.Scanner;

public class Ex01 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		int score = 0;
		char grade = 'F';

		//������ score�� �Է� �޾Ƽ� ������ grade�� ��´�.
		//������ �Է¹޾� ������ ����ϴ� ���α׷���
		//�� 0��~100�� ������ ������ �����ϵ��� �Ѵ�.
		//0~100�� ���̰� �ƴϸ� Error!�� ����ϵ��� �Ѵ�.
		System.out.print("�����Է�: ");
		score = scan.nextInt();
		while(!(score >= 0 && score <= 100)){  //score < 0 || score > 100)
			System.out.println("Error! ������ 1~100����.");
			System.out.print("�����Է�: ");
			score = scan.nextInt();
		}
		System.out.println("��ȿ�� ������ �Է� �Ǿ���.");
		if(score >= 90){
			System.out.println("�������߾��");
			grade = 'A';
		}else if(score >= 80 ){
			grade = 'B';
		}else if(score >= 70 ){
			grade = 'C';
		}else if(score >= 60 ){
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.print("������ " + score + " ���̸� ������ " + grade + " �Դϴ�.");
		
	}
}