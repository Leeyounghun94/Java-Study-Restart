package ch05;

public class SubStringExample {

    /*
    문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶다면 subString() 메서드를 사용한다.

    subString(int beginIndex) : beginIndex에서 끝까지 잘라내기
    subString(int beginIndex, int endIndex) : begin ~ end 앞 까지 잘라내기
     */

    public static void main(String[] args) {

        String ssn = "250324-1987654";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);
        //250324

        String lastNum = ssn.substring(7);
        System.out.println(lastNum);
        //1987654
    }
}
