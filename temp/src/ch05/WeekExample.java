package ch05;

import java.util.Calendar;

public class WeekExample {

    public static void main(String[] args) {

        // Week Enum 타입 변수 선언
        Week today = null;

        // Calender 얻기
        Calendar cal = Calendar.getInstance();
        // 컴퓨터 날짜, 시간 정보를 가진 Calender 얻고, 변수에 대입

        // 오늘의 요일 얻기
        int week = cal.get(Calendar.DAY_OF_WEEK);
        // 일요일이 1 이라는 점 유의하고 토요일이(7)까지의 숫자을 변수에 대입한다.

        // 숫자를 열거 상수로 변환해서 변수에 대입
        switch (week) {

            case 1:
                today = Week.SUNDAY ;
                break;

            case 2:
                today = Week.MONDAY ;
                break;

            case 3:
                today = Week.TUESDAY ;
                break;

            case 4:
                today = Week.WEDNESDAY;
                break;

            case 5:
                today = Week.THURSDAY ;
                break;

            case 6:
                today = Week.FRIDAY ;
                break;

            case 7:
                today = Week.SATURDAY ;
                break;
        }

        // 열거 타입 변수 써먹기
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구하러 가야지~");
        } else {
            System.out.println("열심히 공부 해야지~");
        }
    }
}
