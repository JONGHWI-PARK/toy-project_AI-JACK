package project01;

import java.util.Scanner;
import java.util.Random;


public class Feeling {
	
	public boolean good(String feel) {
		String[] feelingGood = {"행복", "사랑", "기뻐", "기쁘", "기쁜", "기쁨", "설레", "설렘", "설렜",
							"좋", "멜랑꼴리", "두근", "날아", "새로", "완벽", "멋", "인상", "재미",
							"재밌", "웃긴", "웃겼", "째져", "신나", "신났", "뿌듯", "벅", "즐겁", "즐거운", "즐거웠"};
		for(int i = 0; i<feelingGood.length; i++) {
			if(feel.contains(feelingGood[i])) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public void feeling_good(String str) {
		if(good(str)) {
			recommend_food01();
		}
	}
	
	public void recommend_food01() {
		 String[] ans02 = {"지금 기분이 좋으시군요! 그럼 다음 맛들을 추천해드릴게요!", "행복한 하루를 보내시는군요! 그럼 다음 맛들은 어떠신가요?", 
         "또 하나의 설레는 추억이 생기셨네요! 그럼 다음 맛들을 추천해드릴게요!"};
		 double Answer02 = Math.floor(Math.random()*(ans02.length));
		 System.out.println(ans02[(int)Answer02]);
		 System.out.println("--------------");
		 System.out.println("1. 기름진 음식\n" + "2. 달달한 음식\n" + "3. 구수한 음식");
		 System.out.println("--------------");
		 
		 System.out.println("어떤 음식을 원하시나요?");
		 
		 Scanner sc = new Scanner(System.in);
		 String choice01 = sc.nextLine();
		 
		 boolean call_02 = true;
		 while(call_02) {
			 	// 1. 기름진 음식
			 if(choice01.contains("기름")) {
				 String[] oily = {"삼겹살", "곱창", "스테이크", "치킨", "피자", "생선구이", "조개구이", "라면", "갈비", "햄버거", "짜장면", "전", "탕수육",
						 "불고기", "수육", "보쌈", "족발", "깐풍기"};
				 double Recommend_oily = Math.floor(Math.random()*(oily.length));
				 System.out.println(oily[(int)Recommend_oily] + "를 추천드립니다.");
				 
				 String choice02 = sc.nextLine();
				 
				 if(choice02.contains("좋")) {
					 System.out.println("소주와 함께라면 기분도 두배!! 맛있는 식사 하세요! :) ");
					 break;
				 } else if(choice02.contains("다른") || choice02.contains("별로") || choice02.contains("안 땡겨")) {
					 continue;
				 }
				 
				// 2. 달달한 음식 
			 } else if(choice01.contains("달달") || choice01.contains("달콤")) {
				 String[] sweet = {"와플", "티라미수", "브라우니", "고구마", "고구마 맛탕", "탕후루", "당고",
						 "달고나", "홍시", "곶감", "초콜릿", "아이스크림", "연유", "크림 파스타", "새콤달콤 탕수육", "피카츄 돈까스",
						 "소떡소떡", "마카롱", "김피탕"};
				 double Recommend_sweet = Math.floor(Math.random()*(sweet.length));
				 System.out.println(sweet[(int)Recommend_sweet] + "를 추천드립니다.");
				 
				 String choice03 = sc.nextLine();
				 
				 if(choice03.contains("좋")) {
					 System.out.println("와인으로 멋진 분위기를 만들어보세요! :) ");
					 break;
				 } else if(choice03.contains("다른") || choice03.contains("별로") || choice03.contains("안 땡겨")) { 
					 continue;
				 }
				 
				// 3. 구수한 음식 
			 } else if(choice01.contains("구수") || choice01.contains("시원")) {
				 String[] traditional = {"청국장", "순대국밥", "된장국", "내장탕", "감자탕", "뼈해장국", "냉면",
						 "선지국", "설렁탕", "곰탕", "된장 보리밥", "새싹 비빔밥", "미역국", "냉이 된장 무침과 흰 쌀밥", "콩국수", "콩 비지 찌개",
						 "할머니께서 해주신 음식", "꽃게탕", "애호박찌개", "소고기 무국"};
				 double Recommend_traditional = Math.floor(Math.random()*(traditional.length));
				 System.out.println(traditional[(int)Recommend_traditional] + "를 추천드립니다.");
				 
				 String choice04 = sc.nextLine();
				 
				 if(choice04.contains("좋")) {
					 System.out.println("막걸리랑 같이 마셔유~ 그러면 정말 맛있을거유~ :) ");
					 break;
				 } else if(choice04.contains("다른") || choice04.contains("별로") || choice04.contains("안 땡겨")) { 
					 continue;
			 	}
			 } else {
				 break;
			 }
		 }
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean bad(String feel) {
		String[] feelingBad = {"나빠", "나뻤", "나빴", "나쁘", "나쁨", "나쁜", "화", "킹받",
							"빡", "야마", "엿", "긴장", "스트레스", "상사", "부장", "팀장", "회사",
							"죽인", "죽이", "열", "짜증", "면접", "시발", "멍청", "이해"};
		for(int i = 0; i<feelingBad.length; i++) {
			if(feel.contains(feelingBad[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void feeling_bad(String str) {
		if(bad(str)) {
			recommend_food02();
		}
	}
	
	public void recommend_food02() {
		 String[] ans03 = {"화가 많이 나셨나보네요! 그럼 매운 음식으로 털어버리는건 어떠실까요?", "힘내세요! 매운거 드시고 다 털어 버리세요!", 
         "스트레스 받을 땐 매운 음식이 짱이죠!", "제가 미친듯이 매운 음식을 추천해드릴게요!", "화날 땐 소주죠! 소주와 함께 먹을 안주를 추천해드릴게요!"};
		 double Answer03 = Math.floor(Math.random()*(ans03.length));
		 System.out.println(ans03[(int)Answer03]);
		 
		 Scanner sc = new Scanner(System.in);
		 String me01 = sc.nextLine();
		 
		 boolean call_03 = true;
		 while(call_03) {
			 	// 매운 음식
			 if(me01.contains("해줘") || me01.contains("추천") || me01.contains("뭔데") || me01.contains("해봐") || me01.contains("응")) {
				 String[] oily = {"불닭발", "디진다 돈까스", "불닭 볶음면", "쭈구미 볶음", "낙지 볶음", "떡볶이", "매운 짬뽕", "라면", "마라탕", "매운 나가사끼 짬뽕",
						 "순두부 찌개", "오돌뼈", "불족발", "수제비", "청양고추가 들어간 칼국수", "고추장 돼지 김치 짜글이"};
				 double Recommend_oily = Math.floor(Math.random()*(oily.length));
				 System.out.println(oily[(int)Recommend_oily] + "를 추천드립니다.");
				 
				 String choice05 = sc.nextLine();
				 
				 if(choice05.contains("좋")) {
					 System.out.println("소주로 액땜합시다! 매운거에 소주가 딱이지 않습니까?");
					 break;
				 } else if(choice05.contains("다른") || choice05.contains("별로") || choice05.contains("안 땡겨")) {
					 continue;
				 }
			 } else {
				 break;
			 }
		 }
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean sad(String feel) {
		String[] feelingSad = {"슬퍼", "슬픔", "슬펐", "우울", "깨졌", "헤어", "죽고", "눈물",
							"가슴", "보고", "싫다", "두려", "두렵", "미칠", "제발", "울고", "울었"};
		for(int i = 0; i<feelingSad.length; i++) {
			if(feel.contains(feelingSad[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void feeling_sad(String str) {
		if(sad(str)) {
			recommend_food03();
		}
	}
	
	public void recommend_food03() {
		 String[] ans04 = {"울고 싶으면 울어도 돼요.. 우리 울고나서 같이 달달한거 먹어요..! ", "달콤한 거 먹으면 기분이 조금 나아질거에요!", 
         "따뜻한 차에 단거 먹으면 안정될거에요..!", "이거.. 드셔보세요.. 안좋은 마음이 진정될거에요.. 제가 항상 옆에 있을게요.", "달달한거 먹고 모든 걱정과 근심 떨쳐보아요!",
         "당신은 잘하고 있어요! 한번.. 드셔볼래요? 그러면 기분이 한결 나아질거에요"};
		 double Answer04 = Math.floor(Math.random()*(ans04.length));
		 System.out.println(ans04[(int)Answer04]);
		 
		 Scanner sc = new Scanner(System.in);
		 String me02 = sc.nextLine();
		 
		 boolean call_04 = true;
		 while(call_04) {
			 	// 단 음식
			 if(me02.contains("알겠") || me02.contains("고마워") || me02.contains("좋") || me02.contains("알았") || me02.contains("응")) {
				 String[] sweet02 = {"티라미슈", "브라우니", "피카츄 돈까스", "초콜렛", "사탕", "마이쮸", "젤리", "빙수", "당고", "꿀물",
						 "탕후루", "따뜻한 코코아", "초코바나나 쉐이크", "케잌", "생크림", "마카롱"};
				 double Recommend_sweet02 = Math.floor(Math.random()*(sweet02.length));
				 System.out.println(sweet02[(int)Recommend_sweet02] + "를 추천드립니다!");
				 
				 String choice06 = sc.nextLine();
				 
				 if(choice06.contains("좋") || choice06.contains("고마워") || choice06.contains("땡큐") || choice06.contains("덕분에")) {
					 System.out.println("우리 같이 힘내봐요!");
					 break;
				 } else if(choice06.contains("잘래") || choice06.contains("자고")) {
					 System.out.println("그냥 그 사람이, 그 상황이 잘못했네요.. 당신은 아무 잘못 없어요.. 잘하고 있어요.. 항상 당신 옆에 있을게요");
					 break;
				 } else if(choice06.contains("싫") || choice06.contains("별로") || choice06.contains("아니")) {
					 continue;
				 }
			 } else {
				 break;
			 }
		 }
	}
	

}
