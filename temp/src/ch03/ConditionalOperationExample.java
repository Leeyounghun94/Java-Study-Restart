package ch03;

public class ConditionalOperationExample {

    /*
    삼항(조건) 연산자

    삼항 연산자( 피연산자 ? 피연산자 : 피연산자)는 총 3개의 피연산자를 가진다.
    ? 앞의 피연산자는 boolean 변수, 조건식이 오므로 조건 연산자 라고도 한다.
    값이 true이면 콜론(:) 앞의 피 연산자가 선택이 되고 false이면 콜론 뒤의 피연산자가 선택이 된다.

     */

    public static void main(String[] args) {

        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );

        System.out.println(score + "점은 " + grade + "등급 입니다.");
        // 85점은 B등급 입니다.
    }
}
