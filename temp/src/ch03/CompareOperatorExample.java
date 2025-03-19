package ch03;

public class CompareOperatorExample {

    /*
     비교 연산자
     비교 연산자는 동등(==, !=), 크기(>, <, <=, >=) 평가해서 boolean 타입인 true,false 산출한다.
     주로 if, for, while에서 실행 흐름 제어할 때 주로 사용한다.
     타입이 다를 경우 비교 연산 하기전에 타입을 일치 시킨다. ex) A == 65 이면 A를 INT 변환되어 65 == 65로 비교한다.

     단, 예외가 있는데 0.1f == 0.1 에서 0.1f가 double 변환되면 0.1 == 0.1이 되서 true가 되어야하나 false가 나온다.
     그 이유는 부동 소수점 방식을 사용하는 실수 타입은 0.1를 정확히 표현할 수 없을 뿐만 아니라 float, double 타입의 정밀도 차이 때문
     피연산자를 float 타입으로 강제 타입 변환 후 비교 연산 해야 한다.

     문자열 비교할때는 ==, !=보다는 equals(), !equals() 사용한다.
     */

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1 : " + result1); // result1 : true
        System.out.println("result2 : " + result2); // result2 : false
        System.out.println("result3 : " + result3); // result3 : true

        char char1 = 'A';
        char char2 = 'B';

        Boolean result4 = (char1 < char2);
        System.out.println("result4 : " + result4);
        // 유니코드 변환하면 A = 65, B = 66 이니 65 < 66 -> result4 : true

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5 : " + result5);// result5 : true

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float) num6);
        System.out.println("result6 : " + result6);// result6 : false
        System.out.println("result7 : " + result7);// result7 : true

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));
        System.out.println("result8 : " + result8);// result8 : false
        System.out.println("result9 : " + result9);// result9 : true
    }
}
