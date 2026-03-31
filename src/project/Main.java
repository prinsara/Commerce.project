package project;

public class Main {

    public static void main(String[] args) {

        //main 함수에서 Product 클래스를 생성하여 상품 목록을 추가합니다.
        //Product 객체 생성을 통해 상품명, 가격, 설명, 재고수량을 세팅합니다.
        //키워드: new

        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 100);
        Product iPhone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10000);
        Product macBook = new Product("MacBook Pro", 2400000,"M3 칩셋이 탑재된 노트북", 5959);
        Product airPods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 1004);


    }
}
