package ch05;

public class LengthExample {

    // 문자열에서 문자의 개수를 얻고 싶으면 length() 메서드 사용한다.

    public static void main(String[] args) {

        String ssn = "2503241987654";

        int length = ssn.length();

        if (length == 13) {
            System.out.println("주민번호 자릿수가 맞습니다.");
        }else {
            System.out.println("주민번호 자릿수가 틀립니다.");
        }

        // 주민번호 자릿수가 맞습니다.
    }
}
