package ch05;

public class ArrayCopyExample {

    // 배열 복사에서 for문 말고 더 간단한 방법이 있는데 System의 arraycopy() 메서드를 이용하면 배열 복사 할 수 있다.

    // System.arraycopy(원본배열, 원복배열 복사 시작인덱스, 새 배열, 새배열 복사 시작인덱스, 복사항목 수);

    public static void main(String[] args) {

        //길이 3인 배열
        String[] oldIntArray = {"JAVA", "Array", "Spring"};

        //길이 5인 배열 새로 생성
        String[] newIntArray = new String[5];

        //배열 항목 복사
        System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);

        // 배열 항목 출력
        for (int i=0; i<newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }

        // JAVA, Array, Spring, null, null,
    }
}
