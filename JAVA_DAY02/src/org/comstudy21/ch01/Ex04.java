package org.comstudy21.ch01;

import java.io.IOException;

public class Ex04 {
	
	public static void main(String[] args) throws IOException{
	
		byte[] by = new byte[20];
		
		System.out.print("���� : ");
		System.in.read(by); //byte[] �迭�� �Է��Ѵ�.
		
		System.out.print("�Է��� �̸� : ");
		System.out.write(by); //byte[] �迭�� �ִ� ���� ����Ѵ�.
	}

}
