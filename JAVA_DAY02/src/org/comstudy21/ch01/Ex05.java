package org.comstudy21.ch01;

import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		
		System.out.print("�Է�1 : ");
		int ch1 = System.in.read();
		System.in.read();  //������ '\n' ����
		System.in.read();  //������ '\r' ����
		
		System.out.print("�Է�2 : ");
		int ch2 = System.in.read();

		System.out.println("ch =>" + (char)ch1);  //�ƽ�Ű�ڵ�, ���̳ʸ��ڵ�
		System.out.println("ch =>" + ch2);
	}

}
