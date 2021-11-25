package chapter04;

import java.sql.Date;
import java.util.Random;

public class IfDice140 {
	public static void main(String[] args) {
		//pseudo Random 가짜 랜덤
//		int randomNum =(int) (Math.random() * 6) + 1;
		/*
		 * 괄호 안의 숫자만큼 랜덤 생성
		 * random.nextInt(6); // 0 ~ 5 까지
		 * random.nextInt(100); // 0 ~ 99까지
		 * 1 ~ 10까지 를 원한다면
		 * random.nextInt(10) + 1;
		 * System.out.println(random.nextInt(10)+ 1);
         * System.out.println(randomNum);
		 */
		Random random = new Random();

		int randomNum = random.nextInt(6) + 1;

		if(randomNum==1) {
			System.out.println("1번이 나왔습니다");
		} else if(randomNum==2) {
			System.out.println("2번이 나왔습니다");
    	} else if(randomNum==3) {
		    System.out.println("3번이 나왔습니다");
        } else if(randomNum==4) {
	        System.out.println("4번이 나왔습니다");
    	} else if(randomNum==5) {
    		System.out.println("5번이 나왔습니다");
    	} else {
    		System.out.println("6번이 나왔습니다");
    	}	
	}
}
