package org.comstudy21.ex01;

public class Ex07 {

    public static void main(String[] args) {
        // �ζǹ�ȣ ������ �����
        int[] lotto = new int[6];
        int cnt = 0;

        while (cnt < lotto.length) {
            int number = (int) (1 + Math.random() * 45);
            boolean flag = false;
            for(int i=0; i<lotto.length; i++){
            	if(number == lotto[i]){
            		flag = true;
            		break;
            	}
            }
            if(!flag){
            lotto[cnt] = number;
            cnt++;
            // ����: �ߺ� ���� �ϵ���.
           }
        }
        for (int i = 0; i < lotto .length ; i ++) {
           System. out.print(lotto [i] + " " );
       }
  }

}
//����2: 1~45�� ��� �ִ� �迭���� �ߺ����� �ʴ� 6���� ��ȣ�� �̾Ƽ� ����϶�.