package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex11 {
	private static Scanner scan = new Scanner(System.in);
		public static void main(String[] args){
			
			int num1 = 0, num2 = 0, num3 = 0;
			int max = 0, mid = 0 , min = 0;
			//���� 3���� �Է� �޾Ƽ� ū��, ��� ��, �������� ���.
			
			System.out.print("ù��° : ");
			num1 = scan.nextInt();
			System.out.print("�ι�° : ");
			num2 = scan.nextInt();
			System.out.print("����° : ");
			num3 = scan.nextInt();
			
			if(num1 > num2 && num2 > num3) {
				max = num1;
				mid = num2;
				min = num3;
				} 
			else if(num1 > num3 && num3 > num2){
				max = num1;
				mid = num3;
				min = num2;
				} 
			else if(num2 > num1 && num1 > num3){
				max = num2;
				mid = num1;
				min = num3;
				} 
			else if(num2 > num3 && num3 > num1){
				max = num2;
				mid = num3;
				min = num1;
				} 
			else if(num3 > num1 && num1 > num2){
				max = num3;
				mid = num1;
				min = num2;
				} 
			else if(num3 > num2 && num2 > num1){
				max = num3;
				mid = num2;
				min = num1;
				}
			System.out.println("ū ��     : "+ max);
			System.out.println("��� �� : "+ mid);
			System.out.println("���� ��   : "+ min);
			
		}
}
