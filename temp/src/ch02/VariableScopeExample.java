package ch02;

public class VariableScopeExample {

    // 변수 사용 범위

    // 메인 메서드 블록에는 다양한 블록들이 작성될 수 있는데 조건문에 해당하는 if,
    // 반복문인 for, while문 중괄호에 선언된 변수는 블록 내에서만 사용이 가능하고 밖에는 사용 못한다.

    // 메서드 블럭 전체에서 사용하고 싶다면 메서드 블록 첫머리에 선언하는 것이 좋고, 특정 블록 내부에서 사용하려면
    // 특성 블록 안에서 선언 하는 것이 좋다.

    public static void main(String[] args) {

        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        }

        //int v3 = v1 + 5 + v2;
        // 여기서, v2는 if문 안에 들어가 있는 변수이기 때문에 에러가 발생한다.
    }
}
