package ch02;

public class CastingExample {

    // 강제 타입 변환
    // 큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입 변환 할 수 없다. 큰 그릇을 작은 그릇안에 못넣는 의미랑 같다.
    // 다만, 큰 그릇을 작은 그릇 단위로 쪼개서 한 조각만 작은 그릇에 넣는 것은 가능하다.
    // 목적은 원래의 값이 유지되면서 타입만 바꾸는 것. -> 작은 허용 범위 타입에 저장될 수 이는 값 가지고 강제 타입을 변환해야한다.


    // 이걸 강제 타입 변환이라고 하는데 큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개어서 저장하는 것을 말한다.
    // 연산자로는 () 괄호를 사용하는데 괄호 안에 들어가는 타입은 쪼개는 단위이다.

    // 1. int  -> byte
    // int 타입은 byte보다 더 큰 범위를 가지기 때문에 자동변환이 안되며 (byte) 캐스팅해서 byte 타입으로 강제 변환 시킨다.

    // 2. long -> int
    // long 타입도 int보다 큰 범위이기 때문에 자동변환이 안되며 (int) 캐스팅 해야 한다.
    long longValue = 300;
    int intValue = (int) longValue;
    // 300인 long 타입변수는 4바이트로 300 표현할 수 있으며 int타입으로 강제 변환하면 앞의 4바이트는 버려지고 끝의 4바이트만 int 타입 변수에 저장하여 300이 그대로 유지..

    // 3.int -> char
    // int 타입은 char보다 큰 범위 가지며 당연히 (char) 캐스팅해야 한다.주의할 점은 char 타입의 허용 범위의 값만 원래 값 유지한다는 것이다.
    int intValue2 = 77;
    char charValue = (char) intValue2;
    // charValue를 출력해보면 'A'가 나온다.

    // 4. 실수 -> 정수
    // 대상 정수 타입으로 캐스팅해서 강제 변환시킬 경우 소수점 이하 부분은 버려지고 정수 부분만 저장이 된다.
    double doubleValue = 3.145678;
    int intValue3 = (int) doubleValue;
    // 출력해보면 정수 부분인 3만 나오게 된다.

    public static void main(String[] args) {

        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);   // 10

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);   // 300

        int var5 = 69;
        char var6 = (char) var5;
        System.out.println(var6);   // E

        double var7 = 65.57896;
        int var8 = (int) var7;
        System.out.println(var8);   // 65
    }
}
