package ch02;

import java.util.Scanner;

public class ScannerExample {

    /*
    키보드로부터 데이터 읽고 변수에 저장하는 방법중 가장 쉬운 것은 Scanner 사용하는 것.

    Scanner scanner = new Scanner();
    scanner 변수 선언 = scanner 객체 생성

    String inputData = scanner.nextLine();
    scanner.nextLine(); -> 엔터 키 누르기 전까진 대기(블로킹)상태가 되고 엔터 누르면 지금까지 입력된 모든 내용을 문자열로 읽는다.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력 : ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력 : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y ;
        System.out.println("x + y : " + result);
        System.out.println();

        while (true) {
            System.out.print(" 입력 문자열 : ");
            String data = scanner.nextLine();// 입력 문자열 대기중

            if (data.equals("q")) {
                // 입력 데이터에서 q라는 글자가 입력되면 ? break(while end)
                // 자바에서는 기본 타입(바이트, 쇼트, 인트, 롱, 플롯, 더블, 불리언) 값이 동일한지 비교하려면 == 사용하지만
                // String 값이 동일한지 비교하려면 equals()를 사용한다.
                break;
            }
            System.out.println("출력 문자열 : " + data);
            System.out.println();
        }

        System.out.println("시스템 종료");
    }

    /*
    x 값 입력 : 99
y 값 입력 : 88
x + y : 187

 입력 문자열 : t
출력 문자열 : t

 입력 문자열 : qe
출력 문자열 : qe

 입력 문자열 : q
시스템 종료
     */
}
