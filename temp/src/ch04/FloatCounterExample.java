package ch04;

public class FloatCounterExample {

    // for문 작성할 때 주의할 점은 초기화식에서 부동 소수점을 쓰는 float 타입을 사용하지 말아야 한다.

    public static void main(String[] args) {

        for (float x= 0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
        //0.1
        //0.2
        //0.3
        //0.4
        //0.5
        //0.6
        //0.70000005
        //0.8000001
        //0.9000001

        // float 타입은 연산 과정에서 정확하게 0.1를 표현하지 못하기 때문에 증감식에서 x에 더해지는
        // 실제 값은 0.1보다 약간 클 수 있으며 최종 반복 횟수가 9번이다.
    }
}
