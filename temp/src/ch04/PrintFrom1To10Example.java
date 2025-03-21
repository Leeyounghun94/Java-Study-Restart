package ch04;

public class PrintFrom1To10Example {

    /*
    for문 : 똑같은 실행문을 여러번 반복적으로 실행해주기 때문에 코드가 간결해진다.

    for(1.초기화식; 2.조건식; 4.증감식) {
            3.실행문

     1. 처음 실행될 때 초기화식이 제일 먼저 실행된다.
     2. 그 다음 조건식을 평가해서 true이면 3.실행문으로 실행하고 false이면 for문 종료하고 블록을 건너뛴다.
     3. 조건식이 true가 되어 3.실행문이 실행하게 되면 4.증감식이 실행이 된다.
     4. 그리고 다시 2.조건식을 평가하게 되고 다시 true이면 3 -> 4 -> 2로 진행하고 false이면 for문 종료한다.

    초기화식은 조건식과 실행문, 증감식에서 사용할 변수를 초기화하는 역할을 한다.
    초기화식이 둘 이상이거나, 증감식도 둘 이상일때는 쉼표로 구분해서 작성한다.
     */

    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            // 가장 기본적인 for문의 형태로 1~10까지 출력한다.

            System.out.println("for문 i 값 : " + i);
        }
        //for문 i 값 : 1
        //for문 i 값 : 2
        //for문 i 값 : 3
        //for문 i 값 : 4
        //for문 i 값 : 5
        //for문 i 값 : 6
        //for문 i 값 : 7
        //for문 i 값 : 8
        //for문 i 값 : 9
        //for문 i 값 : 10
    }
}
