package ch05;

public class IndexOfContainsExample {

    /*
    문자열에서 특정 문자의 위치를 찾고자 할 때에는 indexOf() 메서드를 사용한다
    indexOf() 메서드는 주어진 문자열이 시작되는 인덱스를 리턴한다.

    만약, 주어진 문자열이 포함되지 않으면 메서드에서 -1를 리턴한다.

    단순하게 주어진 문자열이 포함되는지 알아보려면 contains() 메서드를 사용하면 편리하다.
    원하는 문자열이 있으면 contains()메서드에서 true를, 그렇지 않다면 false를 리턴한다.
     */

    public static void main(String[] args) {

        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        String subString = subject.substring(location);
        System.out.println(subString);

        location = subject.indexOf("자바");

        if (location != -1) {
            System.out.println("자바와 관련된 책");
        }else {
            System.out.println("자바와 관련 없습니다.");
        }

        boolean result = subject.contains("자바");

        if (result) {
            System.out.println("자바와 관련 있습니다.");
        } else {
            System.out.println("자바와 아무런 관계 없습니다.");
        }

        //3
        //프로그래밍
        //자바와 관련된 책
        //자바와 관련 있습니다.
    }
}
