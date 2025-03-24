package ch04;

public class BreakOutterExample {

    /*
    만약, 반복문이 중첩이 될 경우 break문 가장 가까운 반복문만 종료하고 바깥 반복분은 종료 시키지 않는다.
    바깥쪽 반복문까지 종료 시키려면 바깥 반복문에 이름을 붙이고 break 이름; 을 사용하면 된다
     */

    public static void main(String[] args) throws Exception {

        Outter: for (char upper='A'; upper<= 'Z'; upper ++) {

        for (char lower='a'; lower<='z'; lower ++) {
            System.out.println(upper + "-" + lower);

            if (lower == 'g') {
                break Outter;
            }
        }
        }
        System.out.println("프로그램 종료");
        // 여기서 바깥쪽 for문은 A ~ Z까지 반복, 중첩FOR문은 a~z까지 반복하는데
        // 중첩 for문에서 lower 변수가 g를 갖게 되면 바깥쪽 for문까지 빠져나오도록 바깥쪽 for문에 Outter라는 라벨을 붙였다.

        /*
        A-a
        A-b
        A-c
        A-d
        A-e
        A-f
        A-g
        프로그램 종료
         */
    }
}
