package ch03;

public class InfinityAndNaNCheckExample {
    /*
    나눗셈 또는 나머지 연산에서 좌측 피연산자가 정수, 우측 피연산자가 0일 경우 예외가 발생한다.
    무한대의 값을 정수로 표현할 수 없기 때문 (5 / 0 -> 0으로 나눌수 없음)

    하지만, 좌측 피연산자가 실수이거나 우측 피연산자가 0.0, 0.0f 이면 예외 발생하지 않고 결과는 infinity, NaN(Not a Number)가 된다.
    infinity, NaN 상태에서는 계속해서 연산 수행하면 안되며 연산 하더라도 계속 infinity, NaN이 되므로 데이터가 엉망이 된다.

    그래서, infinity, NaN인지 먼저 확인한 후 연산을 수행하는것이 좋다!
    확인하기 위해서는 Double.isInfinite(), Double.isNaN() 사용한다.
    infinity, NaN이면 true, 아니면 false
     */

    public static void main(String[] args) {

        int x = 5 ;
        double y = 0.0;
        //double z = x / y ;
        double z = x % y ;

        System.out.println("z = x / y : " + z + 2);
        // z = x / y : Infinity2

        System.out.println("z = x % y : " + z + 2);
        // z = x % y : NaN2

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            // Double.isInfinite(z) || Double.isNaN(z) 둘 중에 하나가 true 되면 전체 조건식이 true
            // 즉, 변수 z가 infinity, NaN이 되면(true) "값 산출 불가"가 표시가 되고
            System.out.println("값 산출 불가");

        } else {
            System.out.println(z + 2);
            // 변수 z가 infinity, NaN이 아니면(false) 연산한다.
        }
    }
    // if 조건식에서 infinity, NaN (true)이기 때문에 값 산출 불가 가 출력이 된다.
}
