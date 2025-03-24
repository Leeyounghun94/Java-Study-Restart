package ch05;

public class ArrayCreateByValueListExample1 {

    /*

    배열
    변수는 하나의 값만 저장할 수 잇으며 저장해야할 값의 수가 많아지면 그 만큼 많은 변수가 필요하다.
    많은 양의 값을 다루는 효율적인 방법이 배열이다.
    배열은 연속된 공간에 값을 나열시키고, 각 값에 인덱스를 부여해 놓은 자료구조이다,
    인덱스는 [] 대괄호 와 함께 사용하여 각 항목의 값을 읽거나, 저장하는데 사용한다.

    배열의 특징으로는
    1. 배열은 같은 타입의 값만 관리한다.
    2. 배열의 길이는 늘리거나 줄일 수 없다.

    즉, int 배열은 int 타입의 값만 관리하고 String 배열은 문자열만 관리한다
        배열 생성과 동시에 길이가 결정되며 한번 결정된 배열의 길이는 줄이거나 늘릴 수 없다.

    배열을 사용하기 위해서는 배열 변수를 선언해야 한다.
    배열 번수 선언은 두 가지 형태로 작성할 수 있지만 타입[] 변수;  이렇게 사용하는 것이 관례적이다.
    타입은 배열에 저장될 값의 타입을 말한다.

    배열 변수는 참조 변수이다. 배열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 배열 주소를 저장한다.
    참조할 배열이 없다면 배열 변수도 null로 초기화할 수 있다.
    만약, 배열 변수가 null을 가진 상태에서 변수[인덱스]로 값을 읽거나 저장하게 되면 NullPointerException이 발생한다.
     */

    public static void main(String[] args) {

        //배열 변수 선언과 배열 생성하기
        String[] season = { "Spring", "SpringBoot", "JAVA", "JSP"};

        //배열의 항목 값 읽기
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);
        //season[0] : Spring
        //season[1] : SpringBoot
        //season[2] : JAVA
        //season[3] : JSP

        //인덱스 1번 항목 값 변경하기
        season[1] = "부트부트";
        System.out.println("season[1] : " + season[1]);
        System.out.println();
        //season[1] : 부트부트

        //배열 변수 선언과 배열 생성하기2
        int[] scores = {45, 88, 77};

        //총합과 평균 구하기
        int sum = 0;

        for (int i=0; i<3; i++) {
            sum+= scores[1];
        }

        System.out.println("총 합 : " + sum);

        double avg = (double) sum / 3;  // 평균은 소수점으로 표기되니 타입을 double로 지정

        System.out.println("평균 : " + avg);
        //총 합 : 264
        //평균 : 88.0
    }
}
