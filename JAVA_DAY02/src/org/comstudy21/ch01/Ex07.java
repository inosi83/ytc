package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex07 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		
		
		String name;
		String company;
		int year;
		int pay;
		double grade;
		
		System.out.print("�̸� : ");
		name = scan.nextLine();
		System.out.print("���� : ");
		company = scan.nextLine();
		System.out.print("���� : ");
		year = scan.nextInt();
		System.out.print("���� : ");
		pay = scan.nextInt();
		System.out.print("���� : ");
		grade = scan.nextDouble();
		
		System.out.print(name + "\t");
		System.out.print(company + "\t");
		System.out.print(year + "��\t");
		System.out.print(pay + "����\t");
		System.out.print(grade + "��\t");
	}
}