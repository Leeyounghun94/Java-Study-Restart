package ch04;

public class SumFrom1To100Example2 {

    public static void main(String[] args) {

        int sum = 0;    // 합계 변수
        int i = 1; // 카운터 변수

        // int = i; 이렇게 해놨더니 초기화가 되지 않았다고 오류 떴다.

        while (i<=100) {
            sum += i;
            i++;
        }

        System.out.println("1 ~" + (i-1) + " 합 : " + sum);

        // 1 부터 100까지 합을 구하기 위해서 while문 사용한다.
        // while문 내에서 계속 누적되는 값을 갖는 sum변수는 while문 시작 전에 미리 선언해 놓아야 한다.

        //1 ~100 합 : 5050
    }

}
