package project;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    //속성
    private List<Category> categoryList;
    private Scanner sc;


    //생성자

    /**
     * @param sc Scanner / 입력
     */

    public CommerceSystem(List<Category> categoryList, Scanner sc) {
        this.categoryList = categoryList;
        this.sc = sc;
    }


    //기능

    public void start() {

        //반복
        while (true) {

            //목록 버튼
            int categoryButton = 1;

            // 1. 카테고리 목록 보여주기
            System.out.println("[ 실시간 커머스 플랫폼 메인 ] ");

            // 1-1 하나씩 꺼내기
            for (Category category : categoryList) {
                System.out.println(categoryButton + ". " + category.getCategoryName());
                categoryButton++;
            }

            // 2. 카테고리 번호 입력 값 받기
            System.out.println("0. 종료    |  프로그램 종료");
            int categoryInput = sc.nextInt();
            if (categoryInput == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }

            // 3. 카테고리 내 맞는 카테고리 상품 보여주기
            Category selectedCategory = categoryList.get(categoryInput - 1);

            int productButton = 1;

            List<Product> productList = selectedCategory.getProductList();

            System.out.println("[ " + selectedCategory.getCategoryName() + " 카테고리 ]");
            for (Product product : productList) {
                System.out.println(productButton + ". " + product.getName() + " | "
                        + String.format("%,d원", product.getPrice()) + " | "
                        + product.getExplain());
                productButton++;
            }


            System.out.println("0. 뒤로가기");
            int productInput = sc.nextInt();
            if (productInput == 0) {
                continue;
            }

        }
    }
}
