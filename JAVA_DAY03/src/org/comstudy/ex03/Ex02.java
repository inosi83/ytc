package org.comstudy.ex03;

import java.util.Scanner;

public class Ex02 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		double d = Math.random()*100;
		int num = (int)Math.floor(d);//casting~
		int userNum = 0;
		
		
		System.out.println("num => " + num);
		System.out.print("�����Է� : ");
		userNum = scan.nextInt();
		
		
		//userNum�� ����ڰ� ���ڸ� �Է��ؼ�
		//num�� ��� ������ ��ġ�ϴ� �Ǻ��ϴ� ���α׷�.
		//��ġ ���� �ʴ´ٸ� �� ū �������� ���� �������� ����
		if(num == userNum){
			System.out.print("�Է� ���ڰ� �����ϴ�.");
		}else {
			if(num < userNum){
			System.out.print("�Է� ���ڰ� Ů�ϴ�.");
			}else{
			System.out.print("�Է� ���ڰ� �۽��ϴ�");
			}
		}
	}
}