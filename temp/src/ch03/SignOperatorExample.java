package ch03;

public class SignOperatorExample {

    // part3. 연산자

    /*
    부호/증감 연산자
    부호 연산자는 변수의 부호를 유지, 변경한다.
    + 부호 유자
    - 부호 변경

    주의할점은 부호 변경 후의 타입.
     */

    public static void main(String[] args) {

        int x = 200;
        x = -x;
        System.out.println(" x : " + x);
        // x = -200

        byte b = 100;
        int y = -b;
        System.out.println(" y : " + y);
        // y = -100

        // 정수 타입(byte, short, int) 연산 결과는 int  -> 부호 변경도 연산이기 때문에 int 타입에 대입해야 한다.
    }
}
