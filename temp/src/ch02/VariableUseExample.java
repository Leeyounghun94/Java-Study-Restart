package ch02;

public class VariableUseExample {

    public static void main(String[] args) {

        int hour = 5;
        int minute = 30;

        System.out.println(hour + "시간" + minute + "분");
        // 5시간30분

        int totalMinute = (hour*60) + minute ;
        System.out.println("총 " + totalMinute  + "분");
        // 총 330분
    }
}
