package ch05;

public class CharAtExample {

    // 문자열에서 특정 위치 문자를 얻고 싶으면 chatAt() 이용할 수 있다.
    // chatAt()는 매개값으로 주어진 인덱스의 문자를 리턴한다.
    // 인덱스는 0부터 문자열의 길이 -1 까지의 번호를 말한다.

    public static void main(String[] args) {

        String ssn = "2503244979799";

        char sex = ssn.charAt(6);

        switch (sex) {

            case '1':
            case '3':
                System.out.println("남자");
                break;

            case '2':
            case '4':
                System.out.println("여자");
                break;
        }
        // String ssn = "2503243979799";
        // 남자

        // String ssn = "2503244979799";
        // 여자

    }
}
