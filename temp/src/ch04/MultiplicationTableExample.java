package ch04;

public class MultiplicationTableExample {

    /*

    for문은 다른 for문을 내포할 수가 있는데 이것을 중첩된 for문이라고 한다.
    이러한 경우는 바깥 for문이 한번 실행할 때마다 중첩된 for문이 지정횟수 만큼 반복하고 다시 바깥 for문으로 돌아간다.
     */

    public static void main(String[] args) {

        for (int m=2; m<=9; m++) {
            System.out.println("*** " + m + "단 ***");

            for (int n=1; n<=9; n++) {
                System.out.println(m + " x " + n + " = " + (m*n));
            }
            /*
            *** 2단 ***
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            2 x 4 = 8
            2 x 5 = 10
            2 x 6 = 12
            2 x 7 = 14
            2 x 8 = 16
            2 x 9 = 18
            *** 3단 ***
            3 x 1 = 3
            3 x 2 = 6
            3 x 3 = 9
            3 x 4 = 12
            3 x 5 = 15
            3 x 6 = 18
            3 x 7 = 21
            3 x 8 = 24
            3 x 9 = 27
            *
            *
            *
            9 x 7 = 63
            9 x 8 = 72
            9 x 9 = 81
             */
        }
    }
}
