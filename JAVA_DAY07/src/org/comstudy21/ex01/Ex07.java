package org.comstudy21.ex01;

public class Ex07 {

    public static void main(String[] args) {
        // 로또번호 생성기 만들기
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
            // 과제: 중복 제거 하도록.
           }
        }
        for (int i = 0; i < lotto .length ; i ++) {
           System. out.print(lotto [i] + " " );
       }
  }

}
//과제2: 1~45를 담고 있는 배열에서 중복되지 않는 6개의 번호를 뽑아서 출력하라.