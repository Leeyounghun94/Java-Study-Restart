package ch03;

public class AccuracyExample1 {

    // 산술연산을 정확하게 계산하고 싶다면 실수타입을 사용하지 않고 정수 연산으로 하는 것이 좋다.

    public static void main(String[] args) {

        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit ;

        System.out.println("사과 1개에서 남은 양은 ? : " + result);
        // 사과 1개에서 남은 양은 ? : 0.29999999999999993
        // 출력 값을 보면 정확한 0.3이 되지 않는다. -> 부동 소수점 방식을 사용하는 실수타입에서 흔히 발생, 정확한 값 계산하려면 정수 연산으로 변경!
    }
}
