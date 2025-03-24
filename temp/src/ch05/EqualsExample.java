package ch05;

public class EqualsExample {

    /*
    자바의 문자열은 string 객체로 생성 된다.

    new 연산자로 직접 string 객체를 생성하고 대입할 수 있다. new 연산자는 새로운 객체를 만드는 연산자로 객체 생성 연산자 라고 한다.

    동일한 string 객체이든 다른 string 객체든 상관없이 내부 문자열만 비교할 경우 string객체의 equals() 메서드를 사용한다.
     */

    public static void main(String[] args) {

        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strV1과 strV2는 참조가 같다.");
        }else {
            System.out.println("strV1과 strV2는 참조가 다르다!");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strV1과 strV2는 문자열이 같다.");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strV3과 strV4는 참조가 같다.");
        }else {
            System.out.println("strV3과 strV4는 참조가 다르다!");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strV3과 strV4는 문자열이 같다.");
        }

        //strV1과 strV2는 참조가 같다.
        //strV1과 strV2는 문자열이 같다.
        //strV3과 strV4는 참조가 다르다!
        //strV3과 strV4는 문자열이 같다.
    }
}
