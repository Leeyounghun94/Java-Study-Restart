package ch05;

public class MainStringArrayArgument {

    public static void main(String[] args) {

        if (args.length != 2) {
            // 입력한 데이터 개수가 2개가 아닐 경우

            System.out.println("입력값이 부족합니다.");
            System.exit(0);// 강제 종료
        }

        String strNum1 = args[0];
        String strNum2 = args[1];
        // 첫번째, 두번째 데이터 얻기

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        // Integer.parseInt(); -> 문자열을 정수로 변환

        int result = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + result);
        //입력값이 부족합니다.
        // 입력값을 주지 않아서 args는 길이 0dls string배열을 참조하게 된다.
        // 그래서 if에 true가 실행이 된다.


    }
}
