package ch05;

public class ArrayReferenceObjectExample {


    //기본타입 배열은 각 항목에 값을 저장하지만, 참조 타입 배열은 각 항목의 객체의 번지를 저장한다.

    public static void main(String[] args) {

        String[] strArray = new String[3];

        strArray[0] = "자바";
        strArray[1] = "자바";
        strArray[2] = new String("자바");

        System.out.println(strArray[0] == strArray[1]);
        // true : 같은 객체 참조

        System.out.println(strArray[0] == strArray[2]);
        // false : 다른 객체 참조

        System.out.println(strArray[0].equals(strArray[2]));
        // true : 문자열 동일
    }

}
