package p2;
import java.util.*;
public class App {
    public static void main(String[] args) {
        // String API => 리턴타입이 String인것들은 객체가 불변객체이므로 API가 원본을 바꿔두지x
        // 예를 들면 toUpper 의 경우 적용 후 출력해도 그대로 소문자다 왜 ? return 타입이 void니까!
        // 따라서 이걸 적용한걸 변수에 한번 더 담아 그걸 String으로 리턴해줘야함!
        String str1 = "aaa, bbb, ccc";
    }
}


