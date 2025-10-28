package p9;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
    // Hash => 암호화, 탐색에 많이 사용됨
    // Hash를 사용하기 위해 만족해야하는 조건이 있음.
    // 1) y = f(x) x에 대해 y의 값이 하나로 정해져야됨.
    // 2) f(x)의 공식을 알아도 복호화가 불가능해야 함.(불가능까지는 아니더라도 충돌이 적어야 함)
    // ex) 1234 => 각 자릿수 뜯어내서 각각 더함=> 1+ 2+ 3+ 4 => 10 그럼 y가 만약 22면? 정확히 입력값을 확신할 수 x 즉, x값을 추측할 수 없어야 함.
    // LSH(국내에서 만든 암호화 기술) => 몇몇의 값을 뜯어내서 계산하고 또 다른값이랑 계산하고 그런 느낌
public class App {
    public static void main(String[] args) throws Exception {
        String text = "안녕하세요!";
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digest = md.digest(text.getBytes(StandardCharsets.UTF_8));
        // 그 어떠한 길이의 값이 들어와도 고정된 값으로 출력됨

        // 보기쉽게 문자열로 변환
        StringBuilder stringBuilder = new StringBuilder();
        for(byte b : digest) {
            stringBuilder.append(String.format("%02x", b));
             
        }
        System.out.println(stringBuilder.toString());
        // 출력된 값이 "안녕하세요"의 해싱값!
        // 여러번 실행해도 같은 값이 나올까? 당연! 해시가 성립되기위한 조건!!
        // 만약여기서 숫자든 뭐든 다른값이 단 하나라도 들어간다 => 무조건 "완전히" 다른값이 나와야함 그게 암호화의 원리!(유추할 수 없어야 함)
        // 실행 결과는 무조건 같은 크기의 결과값(SHA-1은 128bit) => 아무리 입력값이 커도 무조건 128bit로 출력되어야 함!!!
    }
}
