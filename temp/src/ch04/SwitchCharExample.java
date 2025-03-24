package ch04;

public class SwitchCharExample {

    /*
    Switch문 괄호에는 정수타입(바이트, 차, 인트, 롱)과 문자열 타입(스트링) 변수를 사용할 수 있다.
     */

    public static void main(String[] args) {

        char grade = 'z';

        switch (grade) {

            case 'A' :
            case 'a' :
                System.out.println("최우수 회원");
                break;

            case 'B' :
            case 'b' :
                System.out.println("우수 회원");
                break;

            case 'C' :
            case 'c' :
                System.out.println("일반 회원");
                break;

            default:
                System.out.println("손님");
        }
        // 우수 회원
        // 손님

    }
}
