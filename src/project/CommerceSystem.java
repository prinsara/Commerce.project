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

            //입력 범위, 종료
            if (0 > categoryInput || categoryInput > categoryList.size()) {
                System.out.println("범위 내에서만 선택 가능합니다. 다시 입력해주세요.");
                continue;
            } else if (categoryInput == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }

            // 3. 카테고리 입력 값에 해당하는 카테고리 번호 찾기
            Category findCategoryList = categoryList.get(categoryInput - 1);

            // 4. 해당 카테고리 내에 있는 List 가져오기
            List<Product> productList = findCategoryList.getProductList();


            while (true) {
                // 5. List를 사용자에게 보여주기
                int productButton = 1;

                for (Product product : productList) {
                    System.out.println(productButton + ". " + product.getName() + " | "
                            + String.format("%,d원", product.getPrice()) + " | "
                            + product.getExplain());
                    productButton++;
                }

                // 6. 입력 버튼
                System.out.println("0. 뒤로가기");
                int productInput = sc.nextInt();

                // 7. 범위
                if (productInput == 0) {
                    break;
                }
                if (0 < productInput && productInput <= productList.size()) {
                    //찾기
                    Product selectedProduct = productList.get(productInput - 1);

                    System.out.println("선택한 상품: " + selectedProduct.getName() + " | "
                            + selectedProduct.getPrice() + " | "
                            + selectedProduct.getExplain() + " | "
                            + selectedProduct.getInventory() + "개\n");
                } else {
                    System.out.println("범위 내에서만 선택 가능합니다. 다시 입력해주세요.");
                }
            }
        }
    }
}
