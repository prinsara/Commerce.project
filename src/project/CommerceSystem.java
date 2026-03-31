package project;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    //설명 : Product 클래스를 관리하는 클래스입니다.
    //전자제품, 의류, 식품 등 각 카테고리 내에 여러 Product를 만들어 줍니다. (완료)
    //main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.
    //List<Product> products 는 CommerceSystem 클래스 생성자를 통해 값을 할당합니다.
    //CommerceSystem 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다.

    //반복문을 활용해 products를 탐색하면서 하나씩 접근합니다.

    //속성
    private List<Product> productList;
    private Scanner sc;


    //생성자

    /**
     *
     * @param productList Main에서 쓰는 ProductList 가져오기
     * @param sc Scanner / 입력
     */

    public CommerceSystem(List<Product> productList, Scanner sc) {
        this.productList = productList;
        this.sc = sc;
    }


    //기능

    public void start() {
        while (true) {
            int productButton = 1;

            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

            for(Product product : productList) {
                System.out.println(productButton + ". "
                        + product.getName() + " | "
                        + String.format("%,d원", product.getPrice()) + " | "
                        + product.getExplain());
                productButton++;
            }

            //종료 구현
            System.out.println("0. 종료         | 프로그램 종료 ");

            int exit = sc.nextInt();
            if (exit == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }
        }
    }


}
