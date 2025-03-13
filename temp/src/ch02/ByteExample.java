package ch02;

public class ByteExample {

    public static void main(String[] args) {

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        // byte var6 = 128; // java: incompatible types: possible lossy conversion from int to byte
        // byte 타입 변수에 범위가 초과한 값을 대입했기 때문에 오류가 생긴다.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

//        -128
//        -30
//        0
//        30
//        127
    }
}
