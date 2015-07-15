package org.comstudy21.ex01;

import java.util.Scanner;

public class Ex04 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month, day;
		int total = 0;
		int nextMonth = 0;
		int nextDay = 0;

		// 1. ���� �Է� �޾Ƽ� �ش� ���� ��¥ ���� ���.
		// 2. 2���� 28�ϱ��� �ִ�.
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		System.out.print("�� �Է�: ");
		day = scan.nextInt();

		System.out.println(month + "���� " + days[month - 1] + " ���� �ֽ��ϴ�");

		// 1�� 1�Ϻ��� �Է� ���ϱ����� �� ��¥�� total�� �����Ͽ� ���.
		// 1�� 1�Ϻ��� x�� x�ϱ����� �� xx���� ������.
		for (int i = 0; i < month - 1; i++) {
			total = total + days[i];
		} // for
		total = total + day;
		System.out.println("1�� 1�Ϻ��� " + month + " �� " + day + " �ϱ����� �� " + total + " ���� ������.");
		System.out.println("���� ��¥�� " + (365 - total) + "��");
		// 4�� 10���� 100�� �Ĵ� x�� x���̴�. <~ �� ��µǴ� ���α׷��� ����.
		
		total = 100;
		int idx = month;
		total = total - (days[idx-1] - day);
		idx %= 12;
		while(days[idx%12] < total){

			total -= days[idx++];
			idx %= 12;
		}
		System.out.print("100�� �Ĵ� " +(idx+1) + "�� ");
		System.out.println(total+ "��");
		//System.out.println("100�� �Ĵ� "+nextMonth+"��"+nextDay+"���Դϴ�");
	}
}