package org.comstudy21.ch02;

import java.util.Scanner;

public class Ex04 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		char yn = 'y';
		
		do {
			int number = 1 + (int) (Math.random() * 100); // 1~100������ ���� �߻�
			int userNum = 1;
			int min = 1, max = 100;
			int cnt = 5;
			boolean flag = false;
				System.out.println("�ý��ۿ� ������ ���ڸ� ���纸����.(" + number + ")");
			while (cnt > 0) {
				do {
					System.out.print("�����Է�(" + min + "~" + max + "): ");
					userNum = scan.nextInt();
					if (userNum < min || userNum > max) {
						System.out.println("�����ʰ�!");
					} //�ڵ� ������ �߿�!!
				} while (userNum < min || userNum > max);
				cnt = cnt - 1;
				System.out.print("�õ�Ƚ�� " + (5 - cnt) + "�� ");
				System.out.println(" ��ȸ�� " + cnt + "�����ҽ��ϴ�.");
				//���Ѵ�.
				if (userNum == number) {
					flag = true;
					break;
				} else { //�Է� ������ �ٲ��ش�..
					if (userNum > number) {
						System.out.println("�ʹ� ū ���ڰ� �ԷµǾ����ϴ�.");
						max = userNum - 1;
					} else {
						System.out.println("�ʹ� ���� ���ڰ� �ԷµǾ����ϴ�.");
						min = userNum + 1;
					}
				}
			} //while
			if (flag) {
				System.out.println("����!");
			} else {
				System.out.println("��� ��ȸ�� �������ϴ�.");
			} 
			do {
				System.out.print("�ѹ� �� �Ͻ÷ƴϱ�?[y/n] : ");
				yn = scan.next().charAt(0);
			} while (yn !='y' && yn !='n' );
		} while (yn=='y');
		System.out.println("Goodby! ��䳪��! ¥�̥b! �ȴ�!");
	}//main
}