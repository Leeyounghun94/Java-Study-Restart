package ch02;

public class VariableChangeExample {
    // 변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사 할 수 있다.

    public static void main(String[] args) {

        int x = 4;
        int y = 7;
        System.out.println("x : " + x + " y : " + y);
        // x : 4 y : 7

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x : " + x + " y : " + y);
        // x : 7 y : 4

        //즉, 변수X값을 temp 대입 -> 변수 y값 7를 x에 대입
        // 그럼 temp가 4 이지요? -> 그걸 y에 대입
        // 결국, x = 7, y = 4 가 나온다.
    }
}
