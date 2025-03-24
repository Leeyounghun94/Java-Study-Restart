package ch04;

public class IfExample {

    /*
    4장 조건문과 반복문
    먼저, 자바에서는 main() 의 시작 { 에서  끝 } 까지 위에서 아래로 실행하는 흐름을 가지고 있다.
    이 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 하는 것이 흐름 제어문

    1.조건문
    if, switch
    -> 정상 흐름으로 돌아온다.

    2.반복문
    for, while, do-while
    -> 제어문 처음으로 다시 되돌아가서 반복 실행

    이것을 루핑이라고 한다.
     */

    public static void main(String[] args) {

        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90 보다 큽니다.");
            System.out.println("A등급");
        }

        if (score < 90)
            System.out.println("점수가 90 보다 작아요.");
            System.out.println("B등급");// if문과 상관없는 실행문

            // 점수가 90 보다 큽니다.
            //A등급

            //B등급

        //if문은 else 블록과 함께 사용되어 조건식의 결과에 따라 실행블록을 선택할 수 있다.
        //if문의 조건식이 true이면 if문이 실행되고, false이면 else 블록이 실행된다.
    }
}
