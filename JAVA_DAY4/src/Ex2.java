import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int start = 0; // ���� �� ��
		int end = 0; // ���� �� ��
		Scanner scan = new Scanner(System.in);
		// ���۴� : 3
		// ����� : 5
		// 3��~ 5�ܱ��� ��� �ϵ����Ѵ�.
		// ���۴��� ����� ���� ū ���� ���͵� ���� ���� �ϵ��� �Ѵ�.
		System.out.print("���۴��� �Է��Ͻÿ�: ");
		start = scan.nextInt();
		System.out.print("������� �Է��Ͻÿ�: ");
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
