package org.comstudy21.ex01;

public class Ex01 {

	public static void main(String[] args) {
		//String 타입의 변수 name을 선언하고 본인 이름 대입한다.
		
		String name = "김정환";
		//변수 name의 값을 console화면에 출력한다.
		System.out.println(name + " ");
		//for문을 이용하여 0~4까지의 정수를 출력하라.
		
		for(int i=0; i<5; i++){
			System.out.print(i +" ");
		}
		System.out.println();
		//배열 arr을 선언하고 100,200,300,400,500 초기화 하라.
		
		int arr[] = new int[]{100, 200, 300, 400, 500};
		//배열 arr의 모든 요소를 순서대로 출력 하라
		int size = arr.length;
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//"arr 배열에 900은 없다" 라고 출력한다.
		boolean flag=false;
		for(int i=0; i<size; i++){
			if(arr[i]==900){
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("arr 배열에 900은 있다.");
		} else{
			System.out.println("arr 배열에 900은 없다.");
		}
	}

}
