package ch02;

public class PrintfExample {

    // 콘솔로 변수값 출력해보기.

    /*
    println(); -> 괄호 내용 출력하고 행 바꾸기
    print(); -> 내용 출력
    printf(); ->  형식 문자열 맞춰 뒤의 값 출력

    printf("형식문자열", 값1, 값2...);
    형식문자열에서 %는 형식문자열 시작 뜻하고  conversion이 있는데 값 타입에 따라 d(정수), f(실수), s(문자열)이 있다.
     */

    public static void main(String[] args) {

        int value = 123;
        System.out.printf("상품의 가격 : %d원\n", value);
        System.out.printf("상품의 가격 : %6d원\n", value);
        System.out.printf("상품의 가격 : %-6d원\n", value);
        System.out.printf("상품의 가격 : %06d원\n", value);
//        상품의 가격 : 123원
//        상품의 가격 :    123원
//        상품의 가격 : 123   원
//        상품의 가격 : 000123원

        double area = 3.141597 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
        //반지름이 10인 원의 넓이 :     314.16

        String name = "취준생";
        String job = "마법사";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
        //     1 | 취준생        |        마법사
    }
}
