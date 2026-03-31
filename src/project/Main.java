package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner 선언
        Scanner sc = new Scanner(System.in);

        //전자제품 목록 객체
        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 100);
        Product iPhone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10000);
        Product macBook = new Product("MacBook Pro", 2400000,"M3 칩셋이 탑재된 노트북", 5959);
        Product airPods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 1004);


        List<Product> productList = new ArrayList<>(List.of(galaxy, iPhone, macBook, airPods));

        //반복문을 활용해 products를 탐색하면서 하나씩 접근합니다.

        while (true) {
            int productButton = 1;

            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

            for(Product product : productList) {
                System.out.println(productButton + ". " + product.getName() + " | " + product.getPrice() + " | " + product.getExplain());
                productButton++;
            }

            //종료 구현
            System.out.println("0. 종료      | 프로그램 종료 ");

            int exit = sc.nextInt();
            if (exit == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }
        }
    }
}
