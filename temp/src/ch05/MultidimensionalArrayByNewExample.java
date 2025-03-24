package ch05;

public class MultidimensionalArrayByNewExample {

    /*
    new 연산자로도 다차원 배열을 생성할 수 있는데
    배열 변수 선언 시 타입 뒤 대괄호[]를 차원의 수 만큼 붙이고, new 타입 뒤에도 차원의 수 만큼 대괄호[] 작성하면 된다.

    타입[][] 변수 = new 타입[1차원 수][2차원 수];
     */

    public static void main(String[] args) {

        //각 반의 학생 수가 3명으로 동일할 경우 점수 저장위해 2차원 배열 생성
        int[][] mathScores = new int[2][3];

        //배열 항목 초기값 출력
        for (int i=0; i< mathScores.length; i ++) {
            // 반의 수만큼 반복

            for (int k=0; k< mathScores.length; k ++) {
                // 해당 반의 학생 수 만큼 반복

                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }

        System.out.println();

        // 배열 항목 값 변경
        mathScores[0][0] = 90;
        mathScores[0][1] = 55;
        mathScores[0][2] = 24;

        mathScores[1][0] = 74;
        mathScores[1][1] = 69;
        mathScores[1][2] = 37;

        //전체 학생의 수학 평균
        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i =0; i < mathScores.length; i ++) {
            totalStudent += mathScores[i].length;

            for (int k=0; k < mathScores[i].length; k++) {
                // 반 학생 수 만큼 반복

                totalMathSum += mathScores[i][k];   // 학생 점수 합산
            }
        }

        double totalMathAvg = (double) totalMathSum / totalStudent;

        System.out.println("전체 학생 수학 평균 점수 : " + totalMathAvg);
        //mathScores[0][0]: 0
        //mathScores[0][1]: 0
        //mathScores[1][0]: 0
        //mathScores[1][1]: 0

        //전체 학생 수학 평균 점수 : 58.166666666666664

        System.out.println();

        //각 반의 학생 수가 다를 경우 점수 저장하기 위해 2차원 배열 생성
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        //배열 항목 초기값 출력
        for (int i=0; i< englishScores.length; i ++) {
            // 반의 수만큼 반복

            for (int k=0; k< englishScores.length; k ++) {
                // 해당 반의 학생 수 만큼 반복

                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }

        System.out.println();

        // 배열 항목 값 변경
        englishScores[0][0] = 71;
        englishScores[0][1] = 72;

        englishScores[1][0] = 73;
        englishScores[1][1] = 74;
        englishScores[1][2] = 75;


        totalStudent = 0;
        int totalEnglishSum = 0;

        for (int i=0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;

            for (int k=0; k<englishScores[i].length; k++) {

                totalEnglishSum += englishScores[i][k];
            }
        }

        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;

        System.out.println("전체 학생 영어 평균 점수 : " + totalEnglishAvg);
        //englishScores[0][0]: 0
        //englishScores[0][1]: 0
        //englishScores[1][0]: 0
        //englishScores[1][1]: 0

        //전체 학생 영어 평균 점수 : 73.0
    }
}
