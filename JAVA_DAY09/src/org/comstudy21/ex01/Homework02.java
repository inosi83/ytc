package org.comstudy21.ex01;

import java.util.Scanner;

class Sung {
	String name;
	int kor, eng, mat;
	int total, rank;
	char grade;
	double avg;
}

public class Homework02 {

	static Sung[] people = new Sung[30];
	static int top = 0;
	static Scanner scan = new Scanner(System.in);

	static void input() {
		System.out.println("***INPUT***");
		people[top] = new Sung();
		System.out.print("���� : ");
		people[top].name = scan.next();
		System.out.print("���� : ");
		people[top].kor = scan.nextInt();
		System.out.print("���� : ");
		people[top].eng = scan.nextInt();
		System.out.print("���� : ");
		people[top].mat = scan.nextInt();

		people[top].total = people[top].kor + people[top].eng + people[top].mat;
		people[top].avg = people[top].total / 3.0;
		switch ((int) (people[top].total) / 30) {
		case 10:
		case 9:
			people[top].grade = 'A';
			break;
		case 8:
			people[top].grade = 'B';
			break;
		case 7:
			people[top].grade = 'C';
			break;
		case 6:
			people[top].grade = 'D';
			break;
		default:
			people[top].grade = 'F';
		}
		people[top].rank = 1;
		for(int i=0; i<top-1; i++){
			for(int j=i+1; j<top; j++){
				if(people[i].total > people[j].total){
					people[i].rank = people[j].rank;
					j= -1;
				}
			}
		}
		// ���� : ȫ�浿
		// ���� : 34
		// ���� : 65
		// ���� : 34
		top++;
	}

	static void output() {
		System.out.println("***OUTPUT***");
		System.out.println("����\t����\t����\t����\t����\t���\t����\t���");
		System.out.println("===============================================================");
		for (int i = 0; i < top; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t %c\t%d\n", people[i].name, people[i].kor, people[i].eng,
					people[i].mat, people[i].total, people[i].avg, people[i].grade, people[i].rank);
		}
		System.out.println();
		// ���� ���� ���� ���� ���� ��� ���
		// ========================================================
		// ȫ�浿 34 65 34 343 34 1
	}

	static void search() {
		System.out.println("***SEARCH***");
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = scan.next();
		for (int i = 0; i < top; i++) {
			if (name.equals(people[i].name)) {
				System.out.println("����\t����\t����\t����\t����\t���\t����\t���");
				System.out.println("===============================================================");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t %c\t%d\n", people[i].name, people[i].kor, people[i].eng,
						people[i].mat, people[i].total, people[i].avg, people[i].grade,people[i].rank);
			}
		}
		System.out.println();
	}

	static void end() {
		System.out.println("***END***");
		System.exit(0);
	}

	public static void main(String[] args) {
		do {
			System.out.println("1.�Է� 2.��� 3.�˻� 4.����");
			System.out.print("����: ");
			int no = scan.nextInt();
			System.out.println();
			switch (no) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				search();
				break;
			case 4:
				end();
			}
		} while (true);
	}
}