package org.comstudy21.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
		int [] arr = {3,1,5,1,4,2};
		int number = 1;
		//arr �迭�� number ���� ���� ���� ��Ұ� ������ 
		//Math.random�� �̿��ؼ� ���� �ٲ��.
		//�� arr�迭���� �ߺ� �Ǵ� ���� ����� �Ѵ�.
		int size = arr.length;
		for(int i=0; i<size; i++){
			if(arr[i] == number){
				int newNum = (int)(1+Math.random()*10);
				//arr�� 0���� ~ arr�� cnt�������� ������ �������� �ִ��� �˻�
				//���� ���� �ִٸ� �� ���� �߻�.
				//�ٽ� 0 ���� ���� cnt�������� �������� �ִ��� �˻�.
				for(int j=0; j<size; j++){
					if(newNum == arr[j]){
						newNum = (int)(1+Math.random()*10);
						j = -1;
					}
				}
				arr[i] = newNum;
			}
		}//for
		for(int i=0; i<size; i++){
		System.out.print(arr[i]+" ");
		}
	}//main
}