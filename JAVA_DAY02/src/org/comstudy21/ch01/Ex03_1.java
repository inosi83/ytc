package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex03_1 {
	static Scanner scan = new Scanner(System.in); //필드(전역변수)
	public static void main(String[] args){
		
		String name = ""; //local (지역변수)
		
		System.out.print("성명 : ");
		name = scan.nextLine();
		
		System.out.println(name + "님 안녕하세요?");
	}

}
