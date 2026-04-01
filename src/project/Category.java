package project;

import java.util.List;

public class Category {

    //속성

    private List<Product> productList;
    private String categoryName;

    //생성자
    //카테고리 객체 내 각 카테고리 제품 List 담겨져 있음
    /**
     * @param productList Product List (제품 리스트)
     * @param categoryName 카테고리 이름
     */

    public Category(List<Product> productList, String categoryName) {
        this.productList = productList;
        this.categoryName = categoryName;
    }


    //기능
    /**
     * @return 카테고리 이름 반환 메서드
     */
    public String getCategoryName(){
        return categoryName;
    }

}
