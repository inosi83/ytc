package org.comstudy21.ch02;

import java.util.Scanner;

public class Ex04 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		char yn = 'y';
		
		do {
			int number = 1 + (int) (Math.random() * 100); // 1~100사이의 난수 발생
			int userNum = 1;
			int min = 1, max = 100;
			int cnt = 5;
			boolean flag = false;
				System.out.println("시스템에 선택한 숫자를 맞춰보세요.(" + number + ")");
			while (cnt > 0) {
				do {
					System.out.print("숫자입력(" + min + "~" + max + "): ");
					userNum = scan.nextInt();
					if (userNum < min || userNum > max) {
						System.out.println("범위초과!");
					} //코드 순서도 중요!!
				} while (userNum < min || userNum > max);
				cnt = cnt - 1;
				System.out.print("시도횟수 " + (5 - cnt) + "번 ");
				System.out.println(" 기회는 " + cnt + "번남았습니다.");
				//비교한다.
				if (userNum == number) {
					flag = true;
					break;
				} else { //입력 범위를 바꿔준다..
					if (userNum > number) {
						System.out.println("너무 큰 숫자가 입력되었습니다.");
						max = userNum - 1;
					} else {
						System.out.println("너무 작은 숫자가 입력되엇습니다.");
						min = userNum + 1;
					}
				}
			} //while
			if (flag) {
				System.out.println("성공!");
			} else {
				System.out.println("모든 기회가 끝났습니다.");
			} 
			do {
				System.out.print("한번 더 하시렵니까?[y/n] : ");
				yn = scan.next().charAt(0);
			} while (yn !='y' && yn !='n' );
		} while (yn=='y');
		System.out.println("Goodby! 사요나라! 짜이쩬! 안뇽!");
	}//main
}
