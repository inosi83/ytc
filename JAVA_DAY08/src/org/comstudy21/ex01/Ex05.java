package org.comstudy21.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int cnt = 1;
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				arr[j][i] = cnt++;
			}
		}
		for(int i=0;i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void ex02(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 1;
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
			arr[i][j] = cnt++;
		}	
	}
	for(int i=0;i<arr.length; i++){
		for(int j=0; j<arr[i].length; j++){
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
}
	public static void ex01(String[] args) {
		
		int [][]arr = {
				{1,2,3,4,},
				{5,6,7,8},
				{9,10,11,12}
				};
		//2���� �迭�� ������ 2�� fop���� �̿��ؼ� ����϶�.
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}