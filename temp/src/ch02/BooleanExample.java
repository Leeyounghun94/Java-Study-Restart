package ch02;

public class BooleanExample {

    // 참과 거짓을 의미하는 논리 리터럴은 true, false이다.
    // 주로 두 가지 상태 값을 저장할 필요가 있을 경우 사용되며 조건문과 제어문의 실행 흐름을 변경하는데 사용한다.

    public static void main(String[] args) {

        boolean stop = true;

        if (stop) {
            System.out.println("중지");
        }else {
            System.out.println("시~작");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
//        중지
//        result1 : false
//        result2 : true

    }
}
