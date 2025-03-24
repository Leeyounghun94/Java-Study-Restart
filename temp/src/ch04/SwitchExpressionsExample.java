package ch04;

public class SwitchExpressionsExample {

    // JAVA 12 이후 부터는 Switch문에서 Expressions(표현식)을 사용할 수 있다
    // break문 없애는 대신 화살표와 중괄호를 사용하여 가독성이 더 좋다.

    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {

            case 'A', 'a' -> {
                System.out.println("최우수 회원");
            }

            case 'B', 'b' -> {
                System.out.println("우수 회원");
            }

            case 'C', 'c' -> {
                System.out.println("일반 회원");
            }

            default -> {
                System.out.println("손님");
            }
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("최우수 회원 입니다.");
            case 'B', 'b' -> System.out.println("우수 회원 입니다.");
            default -> System.out.println("손님");
            // 중괄호 안에 실행문이 하나만 있을 경우 중괄호를 생략할 수 있다.
        }

        // switch Expression 사용하면 스위치된 값을 변수에 바로 대입할 수 있다.
        // 단일 값일 경우 화살표 오른쪽에 값을 기술하면 되고, 중괄호 사용할 경우는 yield 키워드로 지정하면 된다
        // 단, 이 경우 default가 반드시 존재해야 한다.

        /*
        타입 변수 = switch (grade) {
        case "ex1" -> 변수 값;
        case "ex2" -> {
        ..;
        yield 변수값;
        }
        default -> 변수값;
        }

         */
    }
}
