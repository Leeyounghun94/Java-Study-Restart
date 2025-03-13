package ch02;

public class LongExample {

    // Long 타입은 수치가 큰 데이터를 다룰때 사용한다. ex) 은행, 과학 분야 등
    // 다만, 컴파일러는 기본적으로 값을 int로 간주되기 때문에 int 허용범위가 넘어가면 오류가 생긴다.

    // int 타입의 허용범위를 초과하는 리터럴은 뒤에 소문자(l), 대문자(L)를 붙여서 long값을 알려줘야 한다.

    public static void main(String[] args) {

        long var1 = 10;
        long var2 = 50L;
        //long var3 = 100000000000000000000000; // Integer number too large -> int로 간주하기 때문에 초과되면 오류
        long var4 = 1000000000000000000L; // L를 넣넣고 0을 계속 넣어보니 Long number too large 가 나온다.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
//        10
//        50
//        1000000000000000000
    }
}
