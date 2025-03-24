package ch04;

public class PrintFrom1To10Example2 {

    /*
    While문
     조건식이 true일 경우 계속해서 반복하고, false가 되면 반복을 멈추고 while문을 종료한다.

     while(1.조건식) {
        2.실행문

     while문이 처음 실행할때는 1.조건식이 평가되며 true이면 2.실행문을 실핸다.
     2.실행문이 모두 실행되면 조건식으로 되돌아가서 1.조건식을 다시 평가하고 반복하다가
     조건식이 false 되면 while문 종료한다.
     */
    public static void main(String[] args) {

        int i = 1;
        while (i<=10) {

            System.out.println(i + " ");
            i++;
        }
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10
    }
}
