package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		String name;
		int age;
		double 시력;
		
		
		//Scnner은 자바 1.5버전 이후부터 포함
		//java.util.Scanner를 import 해야 한다.
		System.out.print("성명 : ");
		name = scan.nextLine();
		System.out.print("나이 : ");
		age = scan.nextInt();
		System.out.print("시력 : ");
		시력 = scan.nextDouble();
		
		System.out.printf("성명:%s, 나이:%d, 시력:%.1f \n", name, age, 시력);
	}//end of main
}
