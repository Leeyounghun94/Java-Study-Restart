package ch04;

public class SwitchNoBreakCaseExample {

    public static void main(String[] args) {

        int time = (int) (Math.random()*4) + 8;
        System.out.println("현재 시간 : " + time + "시");

        switch (time) {

            case 8:
                System.out.println("출근");
                break;

            case 9:
                System.out.println("업무 시작");
                break;

            case 12:
                System.out.println("점심 식사");
                break;

            default:
                System.out.println("외근 갑니다.");
        }
    }
}
