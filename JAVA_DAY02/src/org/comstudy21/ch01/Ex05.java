package org.comstudy21.ch01;

import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		
		System.out.print("입력1 : ");
		int ch1 = System.in.read();
		System.in.read();  //버퍼의 '\n' 제거
		System.in.read();  //버퍼의 '\r' 제거
		
		System.out.print("입력2 : ");
		int ch2 = System.in.read();

		System.out.println("ch =>" + (char)ch1);  //아스키코드, 바이너리코드
		System.out.println("ch =>" + ch2);
	}

}
