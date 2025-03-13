package ch02;

public class FloatDoubleExample {

    // 실수 타입에는 float과 double이 있다.
    // 실수 리터럴은 기본적으로  double 타입으로 해석이 되기 때문에
    // float 타입을 대입하려면 리터럴 뒤에 소문자(f), 대문자(F)를 붙여서 float타입임을 알려줘야 한다.

    public static void main(String[] args) {

        // 정밀도 확인하기.
        float var1 = 0.123123123123f;
        double var2 = 0.123456789;
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
//        var1 : 0.123123124
//        var2 : 0.123456789

        // 10 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
//        var3 : 3000000.0
//        var4 : 3000000.0
//        var5 : 0.002
    }
}
