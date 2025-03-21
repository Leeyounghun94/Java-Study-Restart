package ch04;

public class SumFrom1To100Example {

    public static void main(String[] args) {

        int sum = 0;    // 합계 변수
        int i; // 카운터 변수

        for (i=1; i<=100; i++) {
            sum += i;
        }

        System.out.println("1~" + (i-1) + " 합 : " + sum);
        // 1~100 합 : 5050

        // 변수 sum과 i를 for문 시작하기 전에 선언한 이유는 for문 끝내고 sum과 i를 출력하기 위해서이다.
    }
}
