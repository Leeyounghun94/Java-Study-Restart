package ch03;

public class ArithmeticOperatorExample {

    // 산술 연산자는 더하기, 빼기, 곱하기, 나누기 그리고 %(나머지)가 있다.

    /* 산술 연산의 특징
    1. 피연산자가 정수타입(인트, 바이트 등) 이면 연산의 결과는 int
    2. 피연산자가 정수타입인데 그 중 하나가 long이면 연산 결과는 long
    3. 피연산자 중 하나가 실수타입 이면 연산의 결과도 실수 타입
     */

    public static void main(String[] args) {

        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1 : " + result1);
        // result1 : 14 -> 피연산자가 byte 정수 타입이니 연산의 결과는 int 자동 변환 후 연산

        long result2 = v1 + v2 - v4;
        System.out.println("result2 : " + result2);
        // result2 : 4 -> 바이트 + 바이트 - 롱 = long으로 자동 변환 후 연산

        double result3 = (double) v1 / v2 ;
        System.out.println("result3 : " + result3);
        // result3 : 2.5 -> double 로 강제 변환 후 연산

        int result4 = v1 % v2;
        System.out.println("result4 : " + result4);
    }

}
