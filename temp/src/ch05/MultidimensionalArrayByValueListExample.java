package ch05;

public class MultidimensionalArrayByValueListExample {

    /*
    값 목록으로 다차원 배열 생성하려면 배열 변수 선언 시 타입 뒤에 대괄호[]를 차원의 수 만큼 붙이고
    값 목록도 마찬가지로 차원의 수 만큼 중괄호 중첩시킨다.
     */

    public static void main(String[] args) {

        //2차원 배열 생성
        int[][] scores = {
                {99, 88 , 77},
                {22, 45, 64}
        };

        //배열의 길이
        System.out.println("1차원 배열 길이(반의 수) : " + scores.length);
        System.out.println("2차원 배열 길이(첫 반의 학생 수) : " + scores[0].length);
        System.out.println("1차원 배열 길이(2 반의 학생 수) : " + scores[1].length);
        //1차원 배열 길이(반의 수) : 2
        //2차원 배열 길이(첫 반의 학생 수) : 3
        //1차원 배열 길이(2 반의 학생 수) : 3

        // 첫반의 세번째 학생 점수 읽기
        System.out.println("scores[0][2] : " + scores[0][2]);
        //scores[0][2] : 77

        // 2반의 2번째 학생 점수 읽기
        System.out.println("scores[1][1] : " + scores[1][1]);
        //scores[1][1] : 45

        // 첫 반의 반 평균 점수
        int class1Sum = 0;

        for (int i = 0; i<scores[0].length; i++) {
            class1Sum += scores[0][i];
        }

        double class1Avg = (double) class1Sum / scores[0].length;

        System.out.println("첫 반 평균 점수 : " + class1Avg);
        // 첫 반 평균 점수 : 88.0

        // 2반의 반 평균 점수
        int class2Sum = 0;

        for (int i = 0; i<scores[1].length; i++) {
            class2Sum += scores[1][i];
        }

        double class2Avg = (double) class2Sum / scores[1].length;

        System.out.println("2반 평균 점수 : " + class2Avg);
        //2 반 평균 점수 : 43.666666666666664

        // 전체 학생 평균 점수 구하기
        int totalStudent = 0;
        int totalSum = 0;

        for (int i = 0; i<scores.length; i++) {
            // 반 수 만큼 반복

            totalStudent += scores[i].length;   // 반의 학생 수 합산

            for (int k=0; k<scores[i].length; k++) {
                // 해당 반 학생 수만큼 반복

                totalSum += scores[i][k];   // 학생 점수 합산
            }
        }

        double totalAvg = (double) totalSum / totalStudent;

        System.out.println("전체 학생의 평균 점수 : " + totalAvg);
        //전체 학생의 평균 점수 : 65.83333333333333
    }
}
