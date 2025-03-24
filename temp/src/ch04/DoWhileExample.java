package ch04;

import java.util.Scanner;

public class DoWhileExample {

    /*
    do-while문
    조건식에 의해 반복실행한다는 점은 while문과 비슷하다.
    while문은 시작할 때부터 조건식 평가하여 내부를 실행할지 결정하지만, 경우에 따라 블록 내부를 먼저 실행시키고
    실행결과에 따라 반복 실행을 계속 할지 결정하는 경우도 있는데 이때, do-while문을 사용한다.

    do {
        1. 실행문;
        } while (2.조건식;);

        작성할 때 주의할 점은 while() 뒤 반드시 세미콜론(;)을 붙여야 한다.
        처음 실행될 때 1. 실행문 우선 실행되고, 2.조건식을 평가하는데 true이면 1 -> 2 같이 반복 실행하고 false이면 do-while문 종료한다.
     */

    public static void main(String[] args) {

        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        String inputString;

        do {
            System.out.println(">>>>>>>>>>>>>");

            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (! inputString.equals("q"));    // 입력받은 값이 q가 아니면 계속 반복

        System.out.println();
        System.out.println("시스템 종료합니다.");

        /*
        메세지를 입력하세요.
        프로그램 종료하려면 q를 입력하세요.
        >>>>>>>>>>>>>
        ㅎㅇㅎㅇ
        ㅎㅇㅎㅇ
        >>>>>>>>>>>>>
        봄봄봄 봄이 오네요~
        봄봄봄 봄이 오네요~
        >>>>>>>>>>>>>
        ㅂ
        ㅂ
        >>>>>>>>>>>>>
        q
        q

        시스템 종료합니다.
         */

    }
}
