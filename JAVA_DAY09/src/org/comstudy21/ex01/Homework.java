package org.comstudy21.ex01;

import java.util.Scanner;

public class Homework {

	static String n(){//성명 입력
		System.out.print("이름 : ");
		String name = scan.nextLine();
		return name;
	}
	static int add(int kor,int eng, int mat){ //국어, 영어, 수학 점수
		
		int total = kor + eng + mat;
		return total;
	}
	static int total, avg; // 총점, 평균
	static char ch; //학점

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//1명의 성명, 국어, 영어, 수학 점수를 입력받아서
		//총점, 평균, 학점을 출력하는 프로그램을 구현.
		String name = n();
		
		System.out.print("국어 성적 : ");
		int kor = scan.nextInt();
		System.out.print("영어 성적 : ");
		int eng = scan.nextInt();
		System.out.print("수학 성적 : ");
		int mat = scan.nextInt();
		
		total = add(kor, eng, mat);
		System.out.println("총점은 : " + total);
		avg = total/3;
		System.out.println("평균은 : " + avg);
		
		if(avg >= 90){
			System.out.print(name + "학점은 A입니다.");
		}else if(avg >=80){
			System.out.print(name + "학점은 B입니다.");
		}else if(avg >=70){
			System.out.print(name + "학점은 C입니다.");
		}else if(avg >=60){
			System.out.print(name + "학점은 D입니다.");
		}else{
			System.out.print("F입니다.");
		}
	}
}
