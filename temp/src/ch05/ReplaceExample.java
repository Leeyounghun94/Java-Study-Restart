package ch05;

public class ReplaceExample {

    /*
    문자열에서 특정 문자열을 다른 문자열로 대체하고 싶다면 replace() 메서드를 사용하면 된다.
    replace()메서드는 기존 문자열 그대로 두고, 대체한 새로운 문자열을 리턴한다.

    String 객체의 문자열은 변경 불가한 특성을 갖기 때문에 replace() 메서드가 리턴하는 문자열은
    원래 문자열의 수정본이 아닌 완전히 새로운 문자열이다.
     */

    public static void main(String[] args) {

        String oldStr = "자바 문자열은 불변, 자바 문자열은 String";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);

        //자바 문자열은 불변, 자바 문자열은 String
        //JAVA 문자열은 불변, JAVA 문자열은 String

    }
}
