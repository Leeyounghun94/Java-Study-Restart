package ch04;

public class SwitchExample {

    /*
    Switch문 변수의 값에 따라서 실행문이 결정할 수 있기 때문에 if문 보다 더 간결하게 할 수 있다.
    Switch문은 괄호 안에 변수값에 따라 해당 case로 가서 실행문을 실행 시킨다.
    만약, 변수값과 동일한 case가 없다면 default를 실행 시킨다.
     */

    public static void main(String[] args) {

        int num = (int) (Math.random()*6 +1);   // 주사위 번호 한 개 뽑기

        switch (num) {

            case 1:
                System.out.println("1번 등장");
                break;

            case 2:
                System.out.println("2번 등장");
                break;

            case 3:
                System.out.println("3번 등장");
                break;

            case 4:
                System.out.println("4번 등장");
                break;

            case 5:
                System.out.println("5번 등장");
                break;

            default:;
            System.out.println("6번 등장");
        }
        // 2번 등장
        // 3번 등장

        // case 끝에 break는 다음 case를 실행하지 않고 switch문을 빠져나가기 위해 필요하다.
        // break가 없으면 case가 연달아 실행되는데 이때는 case의 값과는 상관 없이 실행 된다.
    }
}
