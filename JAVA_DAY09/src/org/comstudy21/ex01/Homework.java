package org.comstudy21.ex01;

import java.util.Scanner;

public class Homework {

	static String n(){//���� �Է�
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		return name;
	}
	static int add(int kor,int eng, int mat){ //����, ����, ���� ����
		
		int total = kor + eng + mat;
		return total;
	}
	static int total, avg; // ����, ���
	static char ch; //����

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//1���� ����, ����, ����, ���� ������ �Է¹޾Ƽ�
		//����, ���, ������ ����ϴ� ���α׷��� ����.
		String name = n();
		
		System.out.print("���� ���� : ");
		int kor = scan.nextInt();
		System.out.print("���� ���� : ");
		int eng = scan.nextInt();
		System.out.print("���� ���� : ");
		int mat = scan.nextInt();
		
		total = add(kor, eng, mat);
		System.out.println("������ : " + total);
		avg = total/3;
		System.out.println("����� : " + avg);
		
		if(avg >= 90){
			System.out.print(name + "������ A�Դϴ�.");
		}else if(avg >=80){
			System.out.print(name + "������ B�Դϴ�.");
		}else if(avg >=70){
			System.out.print(name + "������ C�Դϴ�.");
		}else if(avg >=60){
			System.out.print(name + "������ D�Դϴ�.");
		}else{
			System.out.print("F�Դϴ�.");
		}
	}
}
