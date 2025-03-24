package ch05;

public class ArrayCreateByValueListExample2 {

    /*
    배열에서 중괄호{}로 감싼 값의 목록을 배열변수에 대입할 때 주의할 점이 있는데
    배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다.

    배열변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면 다음과 같이 new []을 중괄호 앞에 붙인다.
    타입은 배열 변수 선언할 때 사용한 타입과 동일하게 주면 된다.
     */

    public static void main(String[] args) {

        // 배열 변수 선언
        int[] socre;

        // 배열 변수에 배열 대입
        socre = new int[] {77, 66, 88};

        // 배열 항목의 총합 구하고 출력
        int sum1 = 0;

        for (int i = 0; i<3; i++) {
            sum1 += socre[i];
        }
        System.out.println("총 합 : " + sum1);

        // 배열을 매개값을 주고, printItem() 메서드 호출
        printItem(new int[] {77, 66, 88});
    }

    private static void printItem(int[] scores) {
        // printItem 메서드 선언

        // 매개변수가 참조하는 배열의 항목을 출력
        for (int i=0; i<3; i++) {
            System.out.println("score[" + i + "] : " + scores[i]);
        }
    }

    //총 합 : 231
    //score[0] : 77
    //score[1] : 66
    //score[2] : 88
}
