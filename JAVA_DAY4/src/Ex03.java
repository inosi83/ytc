
public class Ex03 {
	
	public static void main(String[] args){
		for(int i=0; i<5; i++){
			for(int j=0; j<5-i; j++){
				System.out.print("*");
			}//for in for
			System.out.println();
			}//for
		for(int k=1; k<5; k++){
			for(int l=0; l<k+1; l++){
				System.out.print("*");
			}
			System.out.println();
		}//for	
	}//main
	
	public static void ex07(String[] args){
//*****
// ****
//  ***
//   **
//    *
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(j<i ? " ":"*");
			}//for in for
			System.out.println();
		}//for
	}//main
	
	public static void ex06(String[] args){
//	     *
//	    **
//	   ***
//	  ****
//	 *****
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(j<4-i ? " " : "*");
			}//for in for
			System.out.println();
		}//for
	}//main
	
		
	
public static void ex05(String[] args){
		
		char s ='*';
		
		for(int i=0;i<5;i++){
			
			for(int j=0; j<5-i; j++){
				System.out.print(s);
			}//for in for
			System.out.println();
		}//for
	}//main
	
	public static void ex04(String[] args){
		
		char s ='*';
		
		for(int i=0;i<5;i++){
			for(int j=0; j<i+1; j++){
				System.out.print(s);
			}//for in for
			System.out.println();
		}//for
	}//main
	
	
	
//별 그림 출력
	public static void ex03(String[] args){
//		*****
//		*****
//		*****
//		*****
//		*****
		char s = '*';
		for(int i=1; i<=5; i++){
			System.out.print("\t");
			for(int j=1; j<=5; j++){
				System.out.print(s);
			}//for in for
			System.out.println();
		}//for
	
	}//main
	
	public static void ex02(String[] args){
		//*****
		char s = '*';
		for(int i=1; i<=5; i++){
			System.out.print(s);
		}//for
	}//ex02
	public static void ex01(String[] args){
		System.out.print("*");
	}
}//class
