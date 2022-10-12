// 음식 추천 AI
package project01;

import java.util.Scanner;
import java.util.Random;

public class Jack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Ai를 부를 때, 해당 문자열로만 반응
		// ex) "시리야" "하이 빅스비" "기가지니" "헤이 카카오" 등등
		final String aiJack = "Hey, Jack";
		
		
		System.out.println("당신의 AI를 불러주세요!");
		
		boolean call_01 = true;
		
		while(call_01) {
			
			String aiCall = sc.nextLine();
			
			// String은 기본자료형이 아니고 String은 객체이다.
			// == 연산자는 String의 주소를 확인하기 때문에 당연히 false로 나온다.
			// 문자열 비교는 String 객체내에 존재하는 .equals()라는 메서드로 한다.
			if(aiCall.equalsIgnoreCase(aiJack)) {
				System.out.println("무엇을 도와드릴까요?");
				
				String order01 = sc.nextLine();
				
				// 특정 키워드 위치 조회
				int keyword01 = order01.indexOf("음식");
				int keyword02 = order01.indexOf("뭐 먹");
				int keyword03 = order01.indexOf("무엇을 먹");
				int keyword04 = order01.indexOf("배고");
				int keyword05 = order01.indexOf("밥");
				
				// 특정 키워드 미포함 문자열 입력시 프로그램 종료
				if(keyword01 != -1 || keyword02 != -1 || keyword03 != -1 || keyword04 != -1 || keyword05 != -1) {
					
					String[] ans01 = {"오늘 기분이 어떠신가요?", "오늘은 어떤 하루인가요?", "어떤 종류의 음식을 원하시나요?", "어떤 음식이 땡기시나요?"};
					// random 함수를 이용하여 여러개의 대답을 랜덤으로 출력
					double Answer01 = Math.floor(Math.random()*(ans01.length));
					System.out.println(ans01[(int)Answer01]);
					
					String a = ans01[(int)Answer01];
					if(a == ans01[0] || a == ans01[1]) {
						String x = sc.nextLine();
						Feeling feel = new Feeling();
						feel.feeling_good(x);
						feel.feeling_bad(x);
						feel.feeling_sad(x);
						
					} else {
						System.out.println("한식, 양식, 일식, 중식, 멕시칸 음식 중에 골라주세요!");
						String y = sc.nextLine();
						Kind kind = new Kind();
						kind.korean_food(y);
						kind.western_food(y);
						kind.japan_food(y);
						kind.china_food(y);
						kind.mexican_food(y);
					} 
				} return;
			} else {
				System.out.println("다시 한번 불러주세요.");
			}
		}
		sc.close();
	}

}
