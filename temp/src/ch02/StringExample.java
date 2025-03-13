package ch02;

public class StringExample {

    // 작음따옴표('')로 감싼 한개의 문자는 char 타입이지만, 큰따옴표("")로 감싼 문자는 유니코드로 변환 되지 않는다.
    // 큰 따옴표("")로 감싼 문자들은 문자열 이라고 하는데, 문자열을 변수에 저장하고 싶으면 String 타입을 사용해야 한다.

    // 문자열 내부에 \ 를 붙일수가 있는데 이것을 이스케이프 문자라고 한다.
    /*

    \" -> " 문자 포함
    \' -> ' 문자 포함
    \\ -> / 문자 포함
    \t -> 출력 시 탭 만큼 띄움
    \n -> 출력 시 줄바꿈
    \r -> 출력시 캐리지 리턴

     */
    public static void main(String[] args) {

        String name = "홍길동";
        String job = "취업준비생";
        System.out.println(name);
        System.out.println(job);
//        홍길동
//        취업준비생

        String str = "나는 \"자바\"가 좋아요";
        System.out.println(str);
        // 나는 "자바"가 좋아요

        str = "번호\t이름\t직업";
        System.out.println(str);
        // 번호	이름	직업

        System.out.println("나는\n");
        System.out.println("자바가\n");
        System.out.println("좋아요..");
//        나는
//
//        자바가
//
//        좋아요..
    }

}
