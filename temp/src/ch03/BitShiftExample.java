package ch03;

public class BitShiftExample {

    /*
    비트 이동 연산자 : 비트를 좌, 우측으로 밀어서 연산을 수행한다.

    1. a << b
        정수 a의 각 비트를 b만큼 왼쪽으로 이동, 오른쪽 빈자리는 0으로 채운다.

    2. a >> b
        정수 a의 각 비트를 b만큼 오른쪽으로 이동, 왼쪽 빈자리는 최상위 부호 비트와 같은 값으로 채움

    3. a >>> b
        정수 a의 각 비트를 b만큼 오른쪽으로 이동하고 왼쪽 빈자리는 0으로 채운다.
     */

    public static void main(String[] args) {

        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3);
        // Math.pow(2, 3)은 2^3을 연산하고 double값 산출하고 int값으로 얻기 위해 (int)로 캐스팅한다.

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        // result1 : 8
        // result2 : 8

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);

        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
        // result3 : -1
        // result4 : -1

    }
}
