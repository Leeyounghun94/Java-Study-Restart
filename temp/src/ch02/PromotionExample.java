package ch02;

public class PromotionExample {

    // 자동 타입 변환은 말 그대로 자동으로 타입이 변환이 일어나는 것을 말한다.
    // 값의 허용범위가 작은 타입이 범위가 큰 타입으로 대입될 때 발생한다.

    // 허용 범위 순으로 나열하자면
    // byte < short, char < int < long < float < double

    // int 타입이 byte보다 크기 때문에 자동 타입이 되는 코드를 보자.
    byte byteValue = 10;
    int intValue = byteValue;
    // byte타입은 1바이트, int는 4바이트 이기 때문에 메모리에서 값이 복사되어 변환이 된다.

    long longValue = 5000l;
    float floatValue = longValue;
    double doubleValue = longValue;
    // 실수 타입은 정수타입보다 범위가 더 크기 때문에 무조건 자동 타입이 된다.

    char charValue = 'A';
    int intValue2 = charValue;
    // char 타입인 경우는 int 타입으로 자동 변환할 경우 유니코드 값이 int 타입에 대입된다. 즉, 65가 저장

//    byte byteValue2 = 10;
//    char charValue2 = byteValue;
    // 이 코드는 컴파일 에러가 발생하게 되는데 이유는 char 타입보다 허용범위가 작은 byte 타입은 char 타입으로 변환할수가 없다. 왜냐하면
    // char 타입의 허용범위는 음수를 표함되지 않는데 byte는 음수가 포함되어 있기 때문

    public static void main(String[] args) {

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue);

        int intValue2 = 500;
        long longValue = intValue2;
        System.out.println("longValue : " + longValue);

        char charValue = '가';
        int intValue3 = charValue;
        System.out.println("'가'의 유니코드 값 : " + intValue3);

        longValue = 350;
        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue : " + doubleValue);

        /*
        intValue : 10
        longValue : 500
        '가'의 유니코드 값 : 44032
        floatValue : 350.0
        doubleValue : 100.5
         */
    }
}
