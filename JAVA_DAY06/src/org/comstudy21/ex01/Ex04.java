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

		// 1. 월을 입력 받아서 해당 월의 날짜 수를 출력.
		// 2. 2월은 28일까지 있다.
		System.out.print("월 입력: ");
		month = scan.nextInt();
		System.out.print("일 입력: ");
		day = scan.nextInt();

		System.out.println(month + "월은 " + days[month - 1] + " 까지 있습니다");

		// 1월 1일부터 입력 월일까지의 총 날짜를 total에 누적하여 출력.
		// 1월 1일부터 x월 x일까지는 총 xx일이 지났다.
		for (int i = 0; i < month - 1; i++) {
			total = total + days[i];
		} // for
		total = total + day;
		System.out.println("1월 1일부터 " + month + " 월 " + day + " 일까지는 총 " + total + " 일이 지났다.");
		System.out.println("남은 날짜는 " + (365 - total) + "일");
		// 4월 10일의 100일 후는 x월 x일이다. <~ 로 출력되는 프로그램을 만듬.
		
		total = 100;
		int idx = month;
		total = total - (days[idx-1] - day);
		idx %= 12;
		while(days[idx%12] < total){

			total -= days[idx++];
			idx %= 12;
		}
		System.out.print("100일 후는 " +(idx+1) + "월 ");
		System.out.println(total+ "일");
		//System.out.println("100일 후는 "+nextMonth+"월"+nextDay+"일입니다");
	}
}
