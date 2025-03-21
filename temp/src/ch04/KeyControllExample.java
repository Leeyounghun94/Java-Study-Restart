package ch04;

import java.util.Scanner;

public class KeyControllExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 너무 오랜만이다 ㅠㅠ

        boolean run = true; // while문의 조건식을 위한 변수 선언

        int speed = 0;

        while (run) { // -> 여기 조건식의 run 변수 값에 따라 while문 반복 여부가 결정 된다.
            System.out.println("--------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("--------------------------");
            System.out.println("선택하세요 : ");

            String strNum = scanner.nextLine();// 키보드에 입력한 내용을 읽는다.

            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);

            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);

            } else if (strNum.equals("3")) {
                run = false;// 3을 입력하게 되면 run 값이 false가 되고 while문 조건식이 false가 되어 while문 종료
            }
        }

        System.out.println("시스템 종료");

        /*
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        1
        현재 속도 = 1
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        1
        현재 속도 = 2
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        1
        현재 속도 = 3
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        1
        현재 속도 = 4
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        2
        현재 속도 = 3
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        2
        현재 속도 = 2
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        1
        현재 속도 = 3
        --------------------------
        1. 증속 | 2. 감속 | 3. 중지
        --------------------------
        선택하세요 :
        3
        시스템 종료
         */
    }
}
