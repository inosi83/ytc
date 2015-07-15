package org.comstudy21.ch01;

import java.util.Scanner;

public class Ex03 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		String name = "";
		
		System.out.print("성명 : ");
		name = scan.nextLine(); //문자열 입력
		
		System.out.println(name + "님 안녕하세요?");
		

	}

}
