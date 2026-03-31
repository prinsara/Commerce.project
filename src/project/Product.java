package project;

public class Product {

    //설명 : 개별 상품을 관리하는 클래스입니다. 현재는 전자제품만 관리합니다.

    /**
     * 상품명, 가격, 설명, 재고수량 필드 생성
     */

    private String name;
    private int price;
    private String explain;
    private int inventory;

    /**
     *
     * @param name 이름
     * @param price 가격
     * @param explain 설명
     * @param inventory 재고수량
     */
    //생성자
    public Product(String name, int price, String explain, int inventory) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.inventory = inventory;
    }

    //기능
}
