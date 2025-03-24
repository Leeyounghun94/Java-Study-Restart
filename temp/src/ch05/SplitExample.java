package ch05;

public class SplitExample {

    /*
    문자열이 구분자 사용하여 여러 개의 문자열로 구성되어 있을 경우 따로 분리해서 얻고 싶으면 split() 사용한다.
    split() 메서드 호출할 때 쉼표를 제공하면 분리된 문자열로 구성된 배열을 얻을 수 있다.
     */

    public static void main(String[] args) {

        String board = " 1. 자바 학습, 2.Spring 학습, 3.홍길동, 4.ArrayIndexOutOfBoundsException";

        // 문자열 분리
        String[] tokens = board.split(",");

        // 인덱스별로 읽기
        System.out.println("번호 : " + tokens[0]);
        System.out.println("제목 : " + tokens[1]);
        System.out.println("내용 : " + tokens[2]);
        System.out.println("댓글 : " + tokens[3]);
        System.out.println();

        // for 문 이용해서 읽기
        for (int i = 0; i<tokens.length; i++) {
            System.out.println(tokens[i]);
        }

        // 번호 :  1. 자바 학습
        // 제목 :  2.Spring 학습
        // 내용 :  3.홍길동
        // 댓글 :  4.ArrayIndexOutOfBoundsException

        // 1. 자바 학습
        // 2.Spring 학습
        // 3.홍길동
        // 4.ArrayIndexOutOfBoundsException

        // 여기서, ArrayIndexOutOfBoundsException 이란?
        // 정해진 배열의 크기보다 크거나 음수 index에 대한 요청이 있으면 ArrayIndexOutOfBoundsException이 발생한다.
        // 배열 범위에 맞게 값을 넣어야 한다.
    }
}
