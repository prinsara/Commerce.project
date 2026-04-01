package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //전자제품 목록 객체
        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 100);
        Product iPhone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10000);
        Product macBook = new Product("MacBook Pro", 2400000,"M3 칩셋이 탑재된 노트북", 5959);
        Product airPods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 1004);

        //의류 목록 객체
        Product dior = new Product("빤짝이 디올 상의", 500000000, "사라 디자이너가 한땀한땀 만든 상의", 112);
        Product adidas = new Product("훔쳐온 짝퉁 아디다스 양말", 99999999, "사라 디자이너가 훔친 짝퉁 아디다스 양말", 1);
        Product chanel = new Product("무지개 샤넬 장갑", 1010101010, "사라 디자이너가 하늘로 올라가 직접 만든 무지개 장갑", 5252);
        Product celine = new Product("오징어 먹물 셀린느 하의", 58391823, "사라 디자이너와 그녀의 친구 김오징어씨의 합작 하의", 119);

        //음식 목록 객체
        Product candy = new Product("휴지맛 캔디", 999999, "사라의 최애 간!식!", 1);
        Product onion = new Product("나무에서 자란 양파", 1, "사라가 직접 나무에서 발견한 양파다!! 초희귀!", 9999);
        Product apple = new Product("화성에서 가져온 사과", 99999999, "사라가 직접 화성에서 발견한 사과다. 아주 희귀", 99999999);
        Product tylenol = new Product("약이 아닌 식품 타이레놀", 10, "두통에 직빵이다. 맛은 없다.", 119);

        //각 카테고리 별로 묶어둔 리스트
        List<Product> eletronicList = new ArrayList<>(List.of(galaxy, iPhone, macBook, airPods));
        List<Product> clothingList = new ArrayList<>(List.of(dior, adidas, chanel, celine));
        List<Product> foodList = new ArrayList<>(List.of(candy, onion, apple, tylenol));

        //각 카테고리 내에 리스트 연결하기
        Category eletronic = new Category(eletronicList, "전자제품");
        Category clothing = new Category(clothingList, "의류");
        Category food = new Category(foodList, "식품");

        //카테고리 묶기
        List<Category> categoryList = new ArrayList<>(List.of(eletronic, clothing, food));

        //커머스 시스템에 카테고리 리스트 넣어주기
        CommerceSystem commerceSystem = new CommerceSystem(categoryList, sc);
        commerceSystem.start();


    }
}

//[ 실시간 커머스 플랫폼 메인 ]
//1. 전자제품
//2. 의류
//3. 식품
//0. 종료      | 프로그램 종료
//1 <- // 1을 입력
//
//[ 전자제품 카테고리 ]
//1. Galaxy S24     | 1,200,000원 | 최신 안드로이드 스마트폰
//2. iPhone 15      | 1,350,000원 | Apple의 최신 스마트폰
//3. MacBook Pro    | 2,400,000원 | M3 칩셋이 탑재된 노트북
//4. AirPods Pro    |   350,000원 | 노이즈 캔슬링 무선 이어폰
//0. 뒤로가기
//2 <- // 2를 입력
//선택한 상품: iPhone 15 | 1,350,000원 | Apple의 최신 스마트폰 | 재고: 30개
//
//[ 실시간 커머스 플랫폼 메인 ]
//1. 전자제품
//2. 의류
//3. 식품
//0. 종료      | 프로그램 종료
//0 <- // 0을 입력
//커머스 플랫폼을 종료합니다.
