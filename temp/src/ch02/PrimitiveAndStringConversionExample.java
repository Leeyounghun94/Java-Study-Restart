package ch02;

public class PrimitiveAndStringConversionExample {

    // 문자열을 기본 타입으로 변환하기
    // 프로그램에서 문자열을 숫자 타입으로 변환하는 경우가 많은데 '12' , '3.5'를 정수, 실수 타입으로 변환하는 경우
    // String.valueOf() 메서드를 이용해서 기본 타입의 값을 문자열로 변경할 수 있다.

    public static void main(String[] args) {

        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.141582");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);
        // value1 : 10
        // value2 : 3.141582
        // value3 : true

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.141582);
        String str3 = String.valueOf(true);

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        // str1 : 10
        // str2 : 3.141582
        // str3 : true
    }
}
