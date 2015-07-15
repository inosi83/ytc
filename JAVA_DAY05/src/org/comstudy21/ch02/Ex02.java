package org.comstudy21.ch02;

import java.util.Scanner;

public class Ex02 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
		char yn = 'y';
		do {
			int number = 1 + (int) (Math.random() * 100);// 1~100������ ���� �߻�
			int userNum = 0;
			int min = 1, max = 100;
			int cnt = 5;
			System.out.println("�ý��ۿ� ������ ���ڸ� ���纸����.");
			System.out.print("���ϱ��(1~100): ");
			userNum = scan.nextInt();
			while (userNum > number || userNum < number) {
				cnt = cnt - 1;
				if (userNum > number) {
					max = userNum - 1;
					System.out.println("����! �õ�Ƚ��" + cnt + "ȸ ���ҽ��ϴ�.");
					System.out.println("ū ���ڸ� �Է��ϼ̽��ϴ�.");
					System.out.print("���ϱ��(" + min + "~" + max + ") : ");
					userNum = scan.nextInt();
					while (max < userNum || userNum < min) {
						System.out.print("���� �ʰ� �ٽ��Է� : ");
						userNum = scan.nextInt();
					}
				} else if (userNum < number) {
					min = userNum + 1;
					System.out.println("����! �õ�Ƚ��" + cnt + "ȸ ���ҽ��ϴ�.");
					System.out.println("���� ���ڸ� �Է��ϼ̽��ϴ�.");
					System.out.print("���ϱ��(" + min + "~" + max + ") : ");
					userNum = scan.nextInt();
					while (max < userNum || userNum < min) {
						System.out.print("���� �ʰ� �ٽ��Է� : ");
						userNum = scan.nextInt();
					}
				} // else if
				if (cnt == 1) {
					System.out.println("�ǰ�! ��ȸ�� ��� �����̽��ϴ�.("+number+")");
					System.out.print("��õ� �Ͻðڽ��ϱ�?[y/n] : ");
					yn = scan.next().charAt(0);
					while (yn != 'y' && yn != 'n') {
						System.out.print("�ٽ��Է��ϼ���[y/n] : ");
						yn = scan.next().charAt(0);
					} // while
					if (yn != 'n') {
						break;
					}
				}
				if (yn == 'n') {
					break;
				}
			} // while
			if (number == userNum) {
				System.out.println("����!(" + number + ")");
				System.out.print("�� �Ͻðڽ��ϱ�?[y/n] : ");
				yn = scan.next().charAt(0);
				while (yn != 'y' && yn != 'n') {
					System.out.print("�ٽ��Է��ϼ���[y/n] : ");
					yn = scan.next().charAt(0);
				} // while
			} // if
			
		} while (yn == 'y');
		System.out.println("������ �ٽ� ������");
	}
}
// 1.����� ��ȣ �Է�
// 2.�����̸� ������ ���!
// 3.�����̸� ū������ ���������� ����ϰ� ������ �� �����Ѵ�.
// max�� min�� ����
// 4.�� ������ ������ ��õ� �Ұ������� �����.
/*
 * �ý����� ������ ���ڸ� ���� ������.(47) 
 * ���ϱ��(1~100���� ����)? 
 * 50 ���� Ƚ�� 4ȸ ���ҽ��ϴ�. 
 * �ʹ� ū ���ڸ� �Է�
 * �Ͽ����ϴ�. 
 * ------------------------- 
 * ���ϱ��(1~49���� ����)? 
 * 50 ������ �ʰ��� ���ڰ� ���Խ��ϴ�. 
 * �ٽ� �Է� �ϼ���. 
 * ���ϱ��(1~49���� ����)? 
 * 30 ���� �õ� Ƚ�� 3ȸ ���ҽ��ϴ�. 
 * �ʹ� ���� ���ڸ� �Է� �Ͽ����ϴ�.
 * ------------------------- 
 * ���ϱ��(31~49���� ����)?
 * 
 * ........
 * 
 * ��ȸ�� ��� ������ �ǰ�! �����̸� ���� !
 * 
 * ��õ� �Ͻðڽ��ϱ�? [y/n] y�� ������ ó������ �ٽ� ����.
 * 
 * n�� ������ ��! ������ �ٽ� ������.
 */
