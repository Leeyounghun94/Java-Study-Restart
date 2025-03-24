package ch05;

public class EmptyStringExample {

    // String 변수에 빈 문자열(" ") 대입할 수 있다. 빈 문자열도 String 객체로 생성 되기 때문에 변수가 빈 문자열을 참조하는지 알기 위해서 equals() 사용한다

    public static void main(String[] args) {

        String hobby = "";

        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
            //hobby 변수가 참조하는 String 객체는 빈 문자열
        }
    }
}
