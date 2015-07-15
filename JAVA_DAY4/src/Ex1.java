
public class Ex1 {


public static void main(String[] args){
	int dan;
	for(dan=2; dan<=9; dan++){
		System.out.println(dan);
	 for(int i=1;i<10;i++){
		System.out.println(dan + "*" + i + "=" + i*dan);
	 }
	}
}


	
public static void ex04main(String[] args){
	int dan=2;
	//for문을 이용해서 구구단 2단 출력하라.
	for(int i=1;i<10;i++){
		System.out.println(dan + "*" + i + "=" + i*dan);
	}
}

public static void ex03(String[] args){
	for(int i=2; i<=10; i+=2){
		System.out.print(i + "\t");
	}
}
	
public static void ex02(String[] args ){
	System.out.println("새로운 메인");
	//ex01(new String[1]);
}
	public static void ex01(String[] args){
		
		for(int i=1; i<=10; i+=2){ //증가식을 바꿀수 있다.
			System.out.print(i+"\t");
		}
	}//일반적인 사용자 정의 함수.
}
