package org.comstudy21.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{55,65,66,88,98,100,75};
		int total = 0;
		double avg = 0.0;
		//arr�迭 ��ҿ� �ִ� ������ ������ ����� ���ؼ� ����϶�.
		//�ݺ����� for ���� ����Ѵ�.
		
		for(int i=0; i<arr.length; i++){
			total = total + arr[i];		
		}
		System.out.println("���� : " +total);
		avg = (double)total/arr.length;
		System.out.println("��� : "+(""+avg).substring(0,5));
	}
}