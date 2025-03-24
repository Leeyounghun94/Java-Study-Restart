package ch04;

public class IfNestedExample {

    /*
    if문 블록 내부에 또 다른 if문을 사용할 수 있는데 이것을 중첩 if문이라 부른다. 중첩의 단계는 제한 없다.
     */

    public static void main(String[] args) {

        int score = (int)(Math.random()*20) + 81;
        System.out.println("점수 : " + score);

        String grade;

        if (score >= 90) {

            if (score >= 95) {
                grade = "A+";

            }else {
                grade = "A";
            }

        }else {

            if (score >= 85) {
                grade = "B+";

            }else {
                grade = "B";
            }
        }

        System.out.println("학점 : " + grade);
        //점수 : 88
        //학점 : B+

        //점수 : 100
        //학점 : A+
    }
}
