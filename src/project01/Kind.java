package project01;

import java.util.Scanner;
import java.util.Random;

public class Kind {
	
	public boolean Korean_Food(String kind) {
		if(kind.contains("한식")) {
			return true;
		}
		return false;
	}
	
	public void korean_food(String str) {
		if(Korean_Food(str)) {
			recommend_korean();
		}
	}
	
	public void recommend_korean() {
		 String[] ans_kor = {"그럼 어떤 맛을 원하시나요?", "다음 음식들을 추천해드릴게요!"};
		 double Answer_kor = Math.floor(Math.random()*(ans_kor.length));
		 System.out.println(ans_kor[(int)Answer_kor]);
		 System.out.println("--------------");
		 System.out.println("1. 매운 음식\n" + "2. 국밥\n" + "3. 고기 및 해산물\n" + "4. 한정식");
		 System.out.println("--------------");
		 
		 Scanner sc = new Scanner(System.in);
		 String choice_kor = sc.nextLine();
		 
		 boolean a_kor = true;
		 while(a_kor) {
			 // 매운 음식
			 if(choice_kor.contains("매운")) {
				 String[] spicy_kor = {"떡볶이", "불닭발", "쭈꾸미 볶음", "낙지 볶음", "불족발", "불닭볶음면", "찜닭", "라면",
						 "고추장 돼지고기 짜글이", "오돌뼈", "골뱅이 소면"};
				 double Recommend_spicy_kor = Math.floor(Math.random()*(spicy_kor.length));
				 System.out.println(spicy_kor[(int)Recommend_spicy_kor] + "를 추천드립니다.");
				 
				 String choice_spicy_kor = sc.nextLine();
				 
				 if(choice_spicy_kor.contains("좋") || choice_spicy_kor.contains("완벽")) {
					 System.out.println("매운 거 먹을 때는 소주와 함께 아시죠?");
					 break;
				 } else if(choice_spicy_kor.contains("다른") || choice_spicy_kor.contains("별로") || choice_spicy_kor.contains("안 땡겨")) {
					 continue;
				 } else {
					 break;
				 }
			// 국밥	 
			 } else if(choice_kor.contains("국") || choice_kor.contains("탕") || choice_kor.contains("찌개")) {
				 String[] soup_kor = {"순대국밥", "곰탕", "선지국", "내장탕", "감자탕", "뼈해장국", "콩나물국밥", "매운탕",
						 "알탕", "육개장", "순두부 찌개", "술국", "닭도리탕", "백숙", "죽", "우거지해장국", "물냉면", "비빔냉면", "낙곱새",
						 "부대찌개", "김치찌개", "설렁탕", "갈비탕", "돼지국밥", "장어탕"};
				 double Recommend_soup_kor = Math.floor(Math.random()*(soup_kor.length));
				 System.out.println(soup_kor[(int)Recommend_soup_kor] + "를 추천드립니다.");
				 
				 String choice_soup_kor = sc.nextLine();
				 
				 if(choice_soup_kor.contains("좋") || choice_soup_kor.contains("완벽")) {
					 System.out.println("국물 요리 먹을 때는 반주가 국룰인거 아시죠? 꼭 반주하세요!");
					 break;
				 } else if(choice_soup_kor.contains("다른") || choice_soup_kor.contains("별로") || choice_soup_kor.contains("안 땡겨")) {
					 continue;
				 } else {
					 break;
				 }
			 // 고기 및 해산물
			 } else if (choice_kor.contains("고기") || choice_kor.contains("해산물")) {
				 String[] meat_kor = {"삼겹살", "소고기", "차돌박이", "갈비", "목살구이", "곱창", "대창", "막창",
						 "조개구이", "대하", "대방어회", "전어회", "광어회", "장어", "오리고기", "양고기", "고등어 구이", "조기 구이", "삼치 구이",
						 "골뱅이", "번데기", "치킨", "돼지 껍데기", "보쌈", "수육", "족발", "찜닭", "닭갈비"};
				 double Recommend_meat_kor = Math.floor(Math.random()*(meat_kor.length));
				 System.out.println(meat_kor[(int)Recommend_meat_kor] + "를 추천드립니다.");
				 
				 String choice_meat_kor = sc.nextLine();
				 
				 if(choice_meat_kor.contains("좋") || choice_meat_kor.contains("완벽")) {
					 System.out.println("고기와 해산물엔 어떤 술이라도 다 잘어울려요!! 고민하지 마세요!!");
					 break;
				 } else if(choice_meat_kor.contains("다른") || choice_meat_kor.contains("별로") || choice_meat_kor.contains("안 좋")) {
					 continue;
				 } else {
					 break;
				 }
			 // 한정식
			 } else if (choice_kor.contains("한정식")) {
				 String[] k_food_kor = {"불고기 백반", "미역국", "북어국", "볶음밥", "새싹 비빔밥", "소고기 무국", "간장 계란 밥", "된장찌개",
						 "청국장", "된장국", "꼬막 비빔밥", "떡국", "만두국", "수제비", "쌈밥", "김밥", "사골국", "3분 카레", "3분 짜장",
						 "간장게장", "양념게장", "떡갈비", "순대", "간", "잡채밥", "전"};
				 double Recommend_k_food_kor = Math.floor(Math.random()*(k_food_kor.length));
				 System.out.println(k_food_kor[(int)Recommend_k_food_kor] + "를 추천드립니다.");
				 
				 String choice_k_food_kor = sc.nextLine();
				 
				 if(choice_k_food_kor.contains("좋") || choice_k_food_kor.contains("완벽")) {
					 System.out.println("한정식엔 한국스럽게 막걸리와 함께 드세요!");
					 break;
				 } else if(choice_k_food_kor.contains("다른") || choice_k_food_kor.contains("별로") || choice_k_food_kor.contains("안 좋")) {
					 continue;
				 } else {
					 break;
				 }
			 } else {
				 break;
			 }
		 }
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean Western_Food(String kind) {
		if(kind.contains("양식")) {
			return true;
		}
		return false;
	}
	
	public void western_food(String str) {
		if(Western_Food(str)) {
			recommend_western();
		}
	}
	
	public void recommend_western() {
		 String[] ans_wes = {"기가 막힌 양식 메뉴를 알고 있어요!", "양식메뉴를 추천해 드릴게요!"};
		 double Answer_wes = Math.floor(Math.random()*(ans_wes.length));
		 System.out.println(ans_wes[(int)Answer_wes]);
		 
		 Scanner sc = new Scanner(System.in);
		 String choice_wes = sc.nextLine();
		 
		 boolean a_wes = true;
		 while(a_wes) {
			 // 양식
			 if(choice_wes.contains("뭔데") || choice_wes.contains("알겠어") || choice_wes.contains("알려줘") || choice_wes.contains("뭐")) {
				 String[] allFood_wes = {"크림 파스타", "피자", "햄버거", "스테이크", "수프", "토마토 파스타", "라자냐", "버팔로 윙",
						 "맥엔치즈", "빠네 파스타", "리조또", "치폴레", "필라프", "오믈렛", "Poutine"};
				 double Recommend_allFood_wes = Math.floor(Math.random()*(allFood_wes.length));
				 System.out.println(allFood_wes[(int)Recommend_allFood_wes] + "를 추천드립니다.");
				 
				 String choice_allFood_wes = sc.nextLine();
				 
				 if(choice_allFood_wes.contains("좋") || choice_allFood_wes.contains("완벽")) {
					 System.out.println("서양음식은 탄산음료나 맥주 그리고 양주와 함께하세요!!");
					 break;
				 } else if(choice_allFood_wes.contains("다른") || choice_allFood_wes.contains("별로") || choice_allFood_wes.contains("안 땡겨")) {
					 continue;
				 } else {
					 break;
				 }
			 } else {
				 break;
			 }
		 }
	}
				 
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean Japan_Food(String kind) {
		if(kind.contains("일식")) {
			return true;
		}
		return false;
	}
	
	public void japan_food(String str) {
		if(Japan_Food(str)) {
			recommend_japan();
		}
	}
	
	public void recommend_japan() {
		 String[] ans_jap = {"일식 메뉴 추천해 드릴게요!", "인기 있는 일식이에요!"};
		 double Answer_jap = Math.floor(Math.random()*(ans_jap.length));
		 System.out.println(ans_jap[(int)Answer_jap]);
		 
		 Scanner sc = new Scanner(System.in);
		 String choice_jap = sc.nextLine();
		 
		 boolean a_jap = true;
		 while(a_jap) {
			 // 일식
			 if(choice_jap.contains("뭔데") || choice_jap.contains("알겠어") || choice_jap.contains("알려줘") || choice_jap.contains("뭐")) {
				 String[] allFood_jap = {"초밥", "돈까스", "라멘", "나베", "나가사키 짬뽕", "돈부리", "텐동", "사케동",
						 "쇼가야키", "차슈", "스키야키", "치폴레", "우동", "규동"};
				 double Recommend_allFood_jap = Math.floor(Math.random()*(allFood_jap.length));
				 System.out.println(allFood_jap[(int)Recommend_allFood_jap] + "를 추천드립니다.");
				 
				 String choice_allFood_jap = sc.nextLine();
				 
				 if(choice_allFood_jap.contains("좋") || choice_allFood_jap.contains("완벽")) {
					 System.out.println("따뜻하게 사케 한잔 하면서 드시면 훨씬 좋답니다!");
					 break;
				 } else if(choice_allFood_jap.contains("다른") || choice_allFood_jap.contains("별로") || choice_allFood_jap.contains("안 땡겨")) {
					 continue;
				 } else {
					 break;
				 }
			 } else {
				 break;
			 }
		 }
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public boolean China_Food(String kind) {
		if(kind.contains("중식")) {
			return true;
		}
		return false;
	}
	
	public void china_food(String str) {
		if(China_Food(str)) {
			recommend_china();
		}
	}
	
	public void recommend_china() {
		 String[] ans_ch = {"중식 메뉴 추천드립니다!", "인기 있는 중식이에요!"};
		 double Answer_ch = Math.floor(Math.random()*(ans_ch.length));
		 System.out.println(ans_ch[(int)Answer_ch]);
		 
		 Scanner sc = new Scanner(System.in);
		 String choice_ch = sc.nextLine();
		 
		 boolean a_ch = true;
		 while(a_ch) {
			 // 일식
			 if(choice_ch.contains("뭔데") || choice_ch.contains("알겠어") || choice_ch.contains("알려줘") || choice_ch.contains("뭐")) {
				 String[] allFood_ch = {"짜장면", "탕수육", "짬뽕", "팔보채", "유산슬", "북경오리", "마라탕", "훠궈",
						 "딤섬", "마라샹궈", "마라룽샤"};
				 double Recommend_allFood_ch = Math.floor(Math.random()*(allFood_ch.length));
				 System.out.println(allFood_ch[(int)Recommend_allFood_ch] + "를 추천드립니다.");
				 
				 String choice_allFood_ch = sc.nextLine();
				 
				 if(choice_allFood_ch.contains("좋") || choice_allFood_ch.contains("완벽")) {
					 System.out.println("연태 고량주와 맛나는 식사를 즐기시길~!");
					 break;
				 } else if(choice_allFood_ch.contains("다른") || choice_allFood_ch.contains("별로") || choice_allFood_ch.contains("안 땡겨")) {
					 continue;
				 } else {
					 break;
				 }
			 } else {
				 break;
			 }
		 }
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public boolean Mexican_Food(String kind) {
		if(kind.contains("멕시칸")) {
			return true;
		}
		return false;
	}
	
	public void mexican_food(String str) {
		if(Mexican_Food(str)) {
			recommend_mexican();
		}
	}
	
	public void recommend_mexican() {
		 String[] ans_mex = {"멕시칸 음식 정말 맛있습니다. 추천드릴까요?", "인기 있는 멕시칸 음식이에요!"};
		 double Answer_mex = Math.floor(Math.random()*(ans_mex.length));
		 System.out.println(ans_mex[(int)Answer_mex]);
		 
		 Scanner sc = new Scanner(System.in);
		 String choice_mex = sc.nextLine();
		 
		 boolean a_mex = true;
		 while(a_mex) {
			 // 일식
			 if(choice_mex.contains("뭔데") || choice_mex.contains("알겠어") || choice_mex.contains("알려줘") || choice_mex.contains("뭐")) {
				 String[] allFood_mex = {"타코", "부리또", "파히타", "퀘사디야", "엔칠라다", "케밥", "토르티야", "나초",
						 "플라우타", "타키토", "치미창가", "아로스 로호", "카르네 아사다"};
				 double Recommend_allFood_mex = Math.floor(Math.random()*(allFood_mex.length));
				 System.out.println(allFood_mex[(int)Recommend_allFood_mex] + "를 추천드립니다.");
				 
				 String choice_allFood_mex = sc.nextLine();
				 
				 if(choice_allFood_mex.contains("좋") || choice_allFood_mex.contains("완벽")) {
					 System.out.println("¡hola! 코로나 맥주 또는 데낄라와 함께 드세요!!");
					 break;
				 } else if(choice_allFood_mex.contains("다른") || choice_allFood_mex.contains("별로") || choice_allFood_mex.contains("안 땡겨")) {
					 continue;
				 } else {
					 break;
				 }
			 } else {
				 break;
			 }
		 }
	}
}
