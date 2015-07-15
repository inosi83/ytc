package org.comstudy.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args){
		
		int no = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(1)수성 (2)금성 (3)지구 (4)목성");
		System.out.print("선택: ");
		no = scan.nextInt();
		
		switch(no){
		case 1 : System.out.println("수성으로 가세요.");break;
		case 2 : System.out.println("금성으로 가세요.");break;
		case 3 : System.out.println("지구로 가세요.");break;
		case 4 : System.out.println("목성으로 가세요.");break;
		default: System.out.println("안드로메다로 가세요.");
		}
	}
}
