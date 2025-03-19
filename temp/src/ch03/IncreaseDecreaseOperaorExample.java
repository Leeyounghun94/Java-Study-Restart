package ch03;

public class IncreaseDecreaseOperaorExample {

    // 증감 연산자( ++, --)는 변수의 값을 증가시키거나 감소시키는 연산자이다.
    /*
    1. ++ 피연산자 : 값을 1 증가 시킨다.
    2. -- 피연산자 : 값을 1 감소 시킨다.

    3. 피연산자 ++ : 연산 수행 후 값 1 증가
    4. 피연산자 -- : 연산 수행 후 값 1 감소

    변수가 단독으로 증감 연산자를 사용할 경우 변수의 앞, 뒤 어디든 붙어도 결과는 동일
    ex) ++i, i ++ : i = i + 1

    단, 여러 개의 연산자가 포함되어 있는 경우 증감 연산자의 위치에 따라 결과가 달라진다.
    증감연산자가 앞에 있으면 우선 변수를 1 증가(감소) 후 다른 연산 수행 하고
    증감연산자가 뒤에 있으면 모든 연산 끝난 후 변수를 1 증가(감소)한다.
     */

    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x : " + x);// x : 12
        // 단독으로 증감 연산자 쓰니 값은 동일
        System.out.println("-----------------------------------------");

        y--;
        --y;
        System.out.println("y : " + y);// y : 8
        // 단독으로 증감 연산자 쓰니 값은 동일
        System.out.println("-----------------------------------------");

        z = x++;
        System.out.println("z : " + z);// z : 12
        System.out.println("x : " + x);// x : 13
        System.out.println("-----------------------------------------");

        z = ++x;
        System.out.println("z : " + z);// z : 14
        // 위에서 z가 12로 저장되어 있으니 ++(12) = 14

        System.out.println("x : " + x);// x : 14
        System.out.println("-----------------------------------------");

        z = ++x + y++;
        System.out.println("z : " + z);// z : 23
        System.out.println("y : " + y);// y : 9
        System.out.println("x : " + x);// x : 15
        System.out.println("-----------------------------------------");
    }

}
