package org.comstudy21.ex01;

public class Ex01 {

	public static void main(String[] args) {
		//String Ÿ���� ���� name�� �����ϰ� ���� �̸� �����Ѵ�.
		
		String name = "����ȯ";
		//���� name�� ���� consoleȭ�鿡 ����Ѵ�.
		System.out.println(name + " ");
		//for���� �̿��Ͽ� 0~4������ ������ ����϶�.
		
		for(int i=0; i<5; i++){
			System.out.print(i +" ");
		}
		System.out.println();
		//�迭 arr�� �����ϰ� 100,200,300,400,500 �ʱ�ȭ �϶�.
		
		int arr[] = new int[]{100, 200, 300, 400, 500};
		//�迭 arr�� ��� ��Ҹ� ������� ��� �϶�
		int size = arr.length;
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//"arr �迭�� 900�� ����" ��� ����Ѵ�.
		boolean flag=false;
		for(int i=0; i<size; i++){
			if(arr[i]==900){
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("arr �迭�� 900�� �ִ�.");
		} else{
			System.out.println("arr �迭�� 900�� ����.");
		}
	}

}