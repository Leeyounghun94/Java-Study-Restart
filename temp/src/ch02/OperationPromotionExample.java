package ch02;

public class OperationPromotionExample {

    // 연산식에서도 자동 타입 변환이 가능하다.

    public static void main(String[] args) {

        byte result1 = 10 + 20;
        System.out.println("result1 : " + result1);
        // 30

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2 : " + result2);
        // int 변환 후 연산 : 30

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3 : " + result3);
        // 3, 4, 5 점점 범위가 크고 있으므로 long타입 변환 후 : 1110

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4 : " + result4);
        System.out.println("result4 : " + (char)result4);
        // 한개는 int 변환해서 65 + 1 = 66
        // 한개는 (char) 로 강제 타입하였으니 B(66) 가 나옴

        int v8 = 10;
        int result5 = v8 / 4 ;
        System.out.println("result5 : " + result5);
        // 10을 4로 나누면 2.5가 나와야하는데 왜 2가 출력이 됐을까?
        // 그건 자바에서 정수 연산의 결과는 항상 정수가 되기 때문에 소수점이 아닌 정수만 표시 된다.

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6 : " + result6);
        // 2.5가 나올려면 10 / 4 이 부분을 int가 아닌 double 타입으로 변경해야 출력값이 2.5가 나오는 것이다.

        int v10 =  1;
        int v11 = 2;
        double result7 = (double) v10 / v11;
        System.out.println("result7 : " + result7);
        // 1을 2로 나누면 0.5가 나오는데 (double)로 변환하면서 출력값이 0.5가 나온다.

    }
}
