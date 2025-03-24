package ch05;

public class AdvancedForExample {

    /* 자바는 배열, 컬렉션을 좀 더 쉽게 처리할 목적으로 향상된 for문도 제공한다.
     카운터 변수와 증감식을 사용하지 않고, 항목 개수만큼 반복 후 자동으로 for문 빠져나간다.

     for( 2.타입변수 : 1.배열) {
          3.실행문;
      }

      ->  실행되면 1.배열에서 가져올 항목 있을 경우 2.타입변수에 저장하고 3. 실행문으로 간다.
            다시 반복해서 1.배열에서 가져올 다음 항목이 있으면 2 -> 3 -> 1 으로 진행하고 없으면 for문 종료한다.
     */

    public static void main(String[] args) {

        // 배열 변수 선언, 배열 생성
        int[] scores = {95, 34, 69, 44, 74};

        // 배열 항목 전체 합
        int sum = 0;

        for (int score : scores) {
            sum = sum + score;
        }// 5개 항목이 한번씩 score변수에 저장하고 sum에 누적된다.

        System.out.println("점수 총 합 : " + sum);

        // 배열 항목 전체 평균 구하기
        double avg = (double) sum / scores.length;

        System.out.println("점수 평균 : " + avg);
        //점수 총 합 : 316
        //점수 평균 : 63.2
    }
}
