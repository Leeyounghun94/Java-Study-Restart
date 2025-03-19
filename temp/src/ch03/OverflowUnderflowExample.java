package ch03;

public class OverflowUnderflowExample {

    /*
    오버플로우 란?
        타입이 허용되는 최대값을 벗어나는 것을 말하며 반댓말은 언더플로우이며 최소값을 벗어나는것을 말한다.
        발생되면 에러 발생은 하지 않지만 해당 정수 타입의 최소, 최대값으로 되돌아간다.
     */

    public static void main(String[] args) {

        byte var1 = 125;

        for (int i=0; i<5; i++) {
            // for문으로 5번 반복 실행을 한다.

            var1++;// ++ 연산은 var1 값을 1 증가
            System.out.println("var1 : " + var1);
        }
        /*
        var1 : 126
        var1 : 127
        var1 : -128
        var1 : -127
        var1 : -126
         */

        System.out.println("=======================================");

        byte var2 = -125;

        for (int i=0; i<5; i++) {
            // for문으로 5번 반복 실행을 한다.

            var2--;// ++ 연산은 var1 값을 1 증가
            System.out.println("var2 : " + var2);
        }
        /*
        var2 : -126
        var2 : -127
        var2 : -128
        var2 : 127
        var2 : 126
         */
    }

    // 연산과정에서 오버, 언더플로우가 발생하면 기대하는 값이 아니기 때문에 항상 범위 내에서 연산이 수행되도록 신경 써야 한다.
    // 만약, int 타입에서 범위가 너무 크다 싶으면 long으로 연산 하도록 해야 한다.
}
