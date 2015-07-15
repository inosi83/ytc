import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int start = 0; // 시작 할 단
		int end = 0; // 종료 할 단
		Scanner scan = new Scanner(System.in);
		// 시작단 : 3
		// 종료단 : 5
		// 3단~ 5단까지 출력 하도록한다.
		// 시작단이 종료단 보다 큰 값이 들어와도 정상 실행 하도록 한다.
		System.out.print("시작단을 입력하시오: ");
		start = scan.nextInt();
		System.out.print("종료단을 입력하시오: ");
		end = scan.nextInt();
		if (start > end) {
			int ing = 0;
			ing = start;
			start = end;
			end = ing;
		}//if
		for (int i=start;  i<=end; i++) {
			System.out.println("--------------"+i);
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");

			}//for in for
			System.out.println();
		}//for
		System.out.println();
	}//main

	public static void ex01(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
			System.out.println();
		}
	}
}//class
