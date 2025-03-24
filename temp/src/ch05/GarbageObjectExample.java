package ch05;

public class GarbageObjectExample {

    /*
    어떤 변수에서도 객체를 참조하지 않으면 해당 객체는 사용할 수 없는 객체가 된다.
    힙 메모리에는 있지만, 위치 정보를 모르기 때문에 사용할 수 없게 된다.
    자바에서는 이런 객체를 쓰레기로 취급하게 되고 Garbage Collector를 실행시켜 제거한다.

    사실, 자바에서는 코드로 이용해서 객체를 직접 제거하는 방법은 제공하지 않는다. 제거하는 유일한 방법은
    객체의 모든 참조를 없애는 것이다.
     */
    public static void main(String[] args) {

        String hobby = "여행";
        hobby = null;
        // 여행이라는 string객체를 쓰레기로 만들기

        String kind1 = "자동차";
        String kind2 = kind1;   // kind1 변수에 저장되어있는 번지를 kind2에 대입

        kind1 = null; // 자동차 해당하는 string 객체는 쓰레기가 아님

        System.out.println("kind2 : " + kind2);
        //kind2 : 자동차

        // kind1에다가 null 대입했는데도 자동차 해당하는 string 객체가 쓰레기가 되지 않는다 그 이유는 kind2 변수가 여전히 참조하고 있기 때문.
    }
}
