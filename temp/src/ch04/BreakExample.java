package ch04;

public class BreakExample {

    /*
    break문은 반복문인 for, while, do-while문을 실행 중지하거나 조건문인 switch문을 종료할 때 사용한다.
    if문과 같이 사용되어 조건식에 따라 for문과 while문을 종료한다.
     */

    public static void main(String[] args) throws Exception {

        while (true) {
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);

            if (num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");

        /*
        1
        3
        1
        1
        5
        4
        3
        3
        3
        3
        2
        5
        5
        3
        3
        3
        5
        4
        2
        5
        4
        1
        2
        1
        3
        5
        1
        3
        2
        3
        5
        4
        3
        5
        4
        6
        프로그램 종료
         */
        // 랜덤으로 숫자를 계속 반복적으로 나오다가 숫자 6이 나오면 break를 통해서 멈추고 출력한다.
    }
}
