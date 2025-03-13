package ch02;

public class CharExample {

    // 하나의 문자를 작은따옴표('')로 감싼 것을 문자 리터럴이라고 한다.
    // 문자 리터럴은 유니코드로 변환되어 저장되며, 유니코드는 세계 각국의 문자를 0 ~ 65535 숫자로 매핑한 국제 표준 규약
    // 자바는 이러한 유니코드를 저장할 수 있도록 char 타입 제공

    // 아스키코드, 유니코드 표 - https://velog.io/@irever1029/Java-%EC%95%84%EC%8A%A4%ED%82%A4%EC%BD%94%EB%93%9C-%EC%9C%A0%EB%8B%88%EC%BD%94%EB%93%9C-%ED%91%9C

    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 65;
        char c3 = '가';
        char c4 = 44032;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

//        A 문자 저장
//        A 유니코드 A(65) 저장
//        가 문자 저장
//        가 유니코드 가(44032) 저장

    }
}
