import java.util.Scanner;

public class Ex05 {

	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int q = 0;
		
		System.out.print("�Է�: ");
		q = scan.nextInt();
		
		if((q%2 == 0)&&(q<5)){
			System.out.print("ERROR!");
		}else{
			for(int a=0; a<q; a++){
				System.out.print("*");
			}//for1
			System.out.println();
			for(int b=0; b<q-2; b++){
				System.out.print("*");
				for(int c=0; c<b; c++){
					System.out.print("^");
				}//for in for1
				System.out.print("*");
				for(int e=0; e<q-b-3; e++){
					System.out.print("^");
				}//for in for2
					System.out.print("*");
				System.out.println();
			}//for2
			for(int f=0; f<q; f++){
				System.out.print("*");
			}
		}//else
	}//main
}
