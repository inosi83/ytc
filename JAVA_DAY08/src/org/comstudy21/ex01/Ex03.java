package org.comstudy21.ex01;

public class Ex03 {
	public static void main(String[] args) {
	
		int[] ball = new int[45];
		int number =1;
		for(int i=0;i<ball.length;i++){
			ball[i] = number++;
		}
		//중복 안되는 ball배열의 요소를 6개 뽑아서 출력하라.
		int cnt = 0;
		while(cnt<6){
			//위치가 랜덤하다.
			int idx = (int)(Math.random()*45);
			while(ball[idx] == 0){
				idx = (int)(Math.random()*45);
			}
			System.out.print(ball[idx] + " ");
			ball[idx] = 0;
			cnt++;
		}	
	}
}
