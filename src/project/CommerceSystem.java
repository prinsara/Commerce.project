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
            int exit = sc.nextInt();
            if (exit == 0 ) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }


        }
    }
}
