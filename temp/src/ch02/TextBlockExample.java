package ch02;

public class TextBlockExample {

    // Java 13 부터는 텍스트 블록 문법을 제공하는데

    /*
    String str = """
    ...
    """;
     */

    // 큰 따옴표 3개로 감싸면 이스케이프, 라인피드할 필요없이 작성된 그대로 문자열로 저장이 된다.

    public static void main(String[] args) {

        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 = """
                {
                "id":"winter",
                "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("--------------------------------------------------");
        System.out.println(str2);
        System.out.println("--------------------------------------------------");

        String str = """
               자바가 좋아요
               좋아서 미치겠어요 아주
               고수가 되는 날 까지. . .        
                """;
        System.out.println(str);

        /*
        {
	"id":"winter",
	"name":"눈송이"
}
--------------------------------------------------
{
"id":"winter",
"name":"눈송이"
}

--------------------------------------------------
자바가 좋아요
좋아서 미치겠어요 아주
고수가 되는 날 까지. . .
         */
    }
}
