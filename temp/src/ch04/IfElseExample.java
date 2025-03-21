package ch04;

public class IfElseExample {

    /*
    조건문이 여러 개인 if문도 있다.
    else if는 상위 조건식이 false일 경우 평가 되고 else if가 true이면 블록이 실행된다.
    else if의 수는 제한이 없으며 여러 조건식 중 true가 되는 else if블록만 실행되고 전체 if문 벗어난다.
    마지막에 else 추가할 수 있는데 모든 조건식이 false일 경우 else 블록 실행하고 if문 벗어나게 된다.
     */

    public static void main(String[] args) {

        int score = 44;

        if (score >= 90) {
            // 점수가 90보다 크다면 ?
            System.out.println("점수가 90 ~ 100점 입니다.");
            System.out.println("A 등급");

        } else if (score >= 80) {
            // 점수가 80 ~ 90 사이에 있다면?
            System.out.println("점수가 80 ~ 90점 입니다.");
            System.out.println("B 등급");

        } else if (score >= 70) {
            // 점수가 70 ~ 80 사이에 있다면?
            System.out.println("점수가 70 ~ 80점 입니다.");
            System.out.println("C 등급");

        } else {
            // 그것도 아닌 점수라면?
            System.out.println("점수가 70점 미만 입니다.");
            System.out.println("D 등급");
        }

        // score = 75
        // 점수가 70 ~ 80점 입니다.
        // C 등급

        // score = 44
        // 점수가 70점 미만 입니다.
        // D 등급
    }
}
