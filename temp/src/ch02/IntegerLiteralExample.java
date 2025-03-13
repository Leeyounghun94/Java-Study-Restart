package ch02;

public class IntegerLiteralExample {

    // 변수는 어느 타입에 따라 저장할 수 있는 값의 종류와 범위가 달라진다.
    // 자바에서는 정수, 실수, 논리값을 저장하는 기본타입 8개를 제공한다.

    // 필수로 알아야 할 것 (기본 타입 & 크기)
    //    byte	1바이트 (8비트)
    //    short	2바이트 (16비트)
    //    int	4바이트 (32비트)
    //    long	8바이트 (64비트)
    //    float	4바이트 (32비트)
    //    double	8바이트 (64비트)
    //    char	2바이트 (16비트)
    //    boolean	JVM에 따라 다름 (보통 1바이트 이상)

//    ✔ 정수형 크기 순서: byte(1) < short(2) < int(4) < long(8)
//    ✔ 실수형 크기: float(4) < double(8)
//    ✔ char는 2바이트 (유니코드 저장)
//    ✔ boolean의 크기는 JVM마다 다를 수 있음

    public static void main(String[] args) {

        // 코드에서 사용자가 직접 입력한 값을 리터럴 이라고 한다.

        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 364;
        int var4 = 0xB3;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);

//        var1 : 11 -> 2진수
//        var2 : 134 -> 8진수
//        var3 : 364 -> 10진수
//        var4 : 179 -> 16진수

    }
}
