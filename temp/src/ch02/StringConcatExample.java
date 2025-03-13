package ch02;

public class StringConcatExample {

    // 자바에서는 + 연산자가 두가지 기능을 가지고 있다.
    // 피연산자가 모두 숫자일 경우에는 덧셈 연산을 하고
    // 피연산자가 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산을 수행한다.

    // +연산자가 연속으로 나오면 앞에서부터 순차적으로 + 연산을 수행한다.
    // 먼저, 덧셈연산으로 덧셈 결과를 가지고 그 다음 + 연산을 수행한다.
    // 만약 먼저 수행된 연산이 결합이라면 이후 + 연산은 모두 결합이 된다.

    public static void main(String[] args) {

        // 숫자 연산
        int result1 = 10 + 2 + 8 ;
        System.out.println("result1 : " + result1);

        // 결합 연산
        String result2 = 10 + 2 + "8";
        System.out.println("result2 : " + result2);
        // result2 : 128
        // 숫자끼리 먼저 더하면 12 + 문자열 8 = 128

        String result3 = 10 + "2" + 8 ;
        System.out.println("result3 : " + result3);
        // result3 : 1028
        // 숫자 + 문자 + 숫자 = 10 + 2 + 8 = 1028

        String result4 = "10" + 2 + 8;
        System.out.println("result4 : " + result4);
        // result4 : 1028
        // 문자 + 숫자(10) = 10 + 10 = 1010

        String result5 = "10" + (2 + 8);
        System.out.println("result5 : " + result5);
        // result5 : 1010


    }
}
