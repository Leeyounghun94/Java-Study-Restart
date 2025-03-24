package ch04;

public class ContinueExample {

    /*
    continue문은 for, while, do-while문에서만 사용되는데 블록 내부에서 continue 실행 되면 for문의 증감식, while문,
    do-while문의 조건식으로 바로 이동한다.

    continue문은 반복문 종료하지 않고 계속 반복 수행한다는 점이 break문과 다르다.
    break문과 마찬가지로 if문과 같이 사용되는데 특정 조건이 만족하면 continue문 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어 간다.
     */

    public static void main(String[] args) {

        for (int i =1; i<=10; i++) {
            if (i%2 != 0) {
                // 2로 나눈 나머지가 0이 아니면? 즉, 홀수 이면??
                continue;
            }
            System.out.println(i + " ");
            /*
            2
            4
            6
            8
            10
             */
        }
    }
}
