package org.comstudy21.ex01;

public class Ex03 {
	public static void main(String[] args) {
	
		int[] ball = new int[45];
		int number =1;
		for(int i=0;i<ball.length;i++){
			ball[i] = number++;
		}
		//�ߺ� �ȵǴ� ball�迭�� ��Ҹ� 6�� �̾Ƽ� ����϶�.
		int cnt = 0;
		while(cnt<6){
			//��ġ�� �����ϴ�.
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