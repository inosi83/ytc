package org.comstudy21.ex01;

import java.util.Scanner;

public class Ex02 {
	static Scanner scan = new Scanner(System.in);
	
	static String getName(){
		System.out.print("����: ");
		String n = scan.next();
		
		return n;
	}
	static int getAge(){
		System.out.print("Age: ");
		int a = scan.nextInt();
		
		return a;
	}
	public static void main(String[] args) {
		
		String name = getName();
		int age = getAge();
		
		System.out.println("Name = "+ name);
		System.out.println("Age = " + age);
	}
}
