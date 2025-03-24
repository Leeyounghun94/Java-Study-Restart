package ch05;

public class NullPointerExceptionExample {

    /*
    참조 타입 변수는 아직 번지를 저장하고 있지 않다는 뜻으로 null을 가질 수 있다.
    null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.

    자바에서 프로그램 실행 도중 발생하는 오류를 예외(Exception)이라고 하는데 참조 타입 사용하면서 가장 많이 발생하는 예외가
    NullpointerException 이다. 변수가 NULL 상태에서 객체의 데이터, 메서드를 사용할 때 발생한다.
     */

    public static void main(String[] args) {

        int[] intArray = null;
        //intArray[0] = 10;
        // Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "intArray" is null

        String str = null;

        System.out.println("총 문자 수 : " + str.length());
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null

        // NullPointerException이 발생하면 예외가 발생한 곳에서 null인 상태의 참조 변수가 사용되고 있음을 알아야 한다.
        // 해결하려면 참조 변수가 객체를 정확하게 참조하도록 번지를 대입해야 한다.
    }
}
