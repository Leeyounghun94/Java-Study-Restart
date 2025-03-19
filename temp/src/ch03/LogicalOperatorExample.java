package ch03;

public class LogicalOperatorExample {

    /*
    논리 연산자
    논리 연산자는 논리곱(&&), 논리합(||), 배타적 논리합(^), 논리부정(!) 연산 수행
    주로 조건문, 반복문 등 주로 이용한다.

    1. AND(논리곱(&&, &))
        true && true = true
        true && false = false
        false && true = false
        false && false = false
        -> 피연산자 모두 true일 경우에만 true

    2. OR(논리합(||, |))
        true || true = true
        true || false = true
        false || true = true
        false || false = false
        -> 피연산자 하나만 true일 경우에만 true

    3. XOR(배타적 논리합(^))
        true ^ true = false
        true ^ false = true
        false ^ true = true
        false ^ false = false
        -> 피연산자 모두 true, false이면 결과도 true, false
        -> 하나는 true이고 다른 하나가 false일 경우에는 true

    &&, &는 산출결과는 같으나 연산 과정이 조금 다르다.
    &&는 앞의 피연산자가 false라면 뒤 피연산자 평가하지않고 false 산출하지만 &는 두 피연산자 모두 평가해서 산출 결과를 낸다
    따라서 &&가 더 효율적으로 동작한다.(||, | 마찬가지)
     */

    public static void main(String[] args) {

        //int charCode = 'A';
        //int charCode = 'a';
        int charCode = '5';

        if ((65<=charCode) & (charCode<=90)) {
            System.out.println("대문자 입니다.");
        }

        if ((97<=charCode) & (charCode<=122)) {
            System.out.println("소문자 입니다.");
        }

        if ((48<=charCode) & (charCode<=57)) {
            System.out.println("0 ~ 9 숫자이군요.");
        }

        /*
        int charCode = 'A'; -> 대문자 입니다.
        int charCode = 'a'; -> 소문자 입니다.
        int charCode = '5'; -> 0 ~ 9 숫자이군요.
         */

        System.out.println("=======================================================");

        int value = 6;
        //int value = 7;

        if ( (value%2 == 0) | (value%3 == 0) ) {
            System.out.println("2 또는 3의 배수이군요.");
            // int value = 6; -> 2 또는 3의 배수이군요.
        }

        boolean result = (value%2 == 0) || (value%3 == 0);
        if ( !result ) {
            System.out.println("2 또는 3의 배수가 아닙니다!");
            // int value = 7; -> 2 또는 3의 배수가 아닙니다!
        }
    }
}
