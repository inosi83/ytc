package org.comstudy21.ch01;

import java.io.IOException;

public class Ex04 {
	
	public static void main(String[] args) throws IOException{
	
		byte[] by = new byte[20];
		
		System.out.print("성명 : ");
		System.in.read(by); //byte[] 배열에 입력한다.
		
		System.out.print("입력한 이름 : ");
		System.out.write(by); //byte[] 배열에 있는 것을 출력한다.
	}

}
