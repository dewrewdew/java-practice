package p5;

public class App {
    public static void main(String[] args) {
        // api
        double r1 = Math.abs(1.0); // 해당 메서드의 return값의 타입을 확인해서 맞는 타입의 변수에 저장해야 함.
        // 해당 api의 리턴 타입을 보고 내가 원하는 값이 반환되는지 확인 후 사용!
        
        String str = "안녕하세요"; // '=' 기준 좌 우는 같은 타입! 그러니 대입 가능 => str 참조변수 그럼 "안녕하세요"는? 당연히 참조변수!
        str.equals("asdf"); // str은 참조 변수라 .메서드 사용 가능 그럼 문자에.붙이는건? 당연히 가능 str이랑 타입이 같으니까!

        "반갑".equals(str);

        "asdf".toUpperCase().toLowerCase(); // "asdf".toUpperCase()의 리턴값 : String 그럼 한번 더 .메서드 사용 가능
        // 계산 순서 : to UpperCase 계산결과 반환해서 toLoserCase()에 넣어서 최종값 반환

        "dddd.j".substring(4).length();

        "aaaa.jpg".substring("aaaa.jpg.indexOf(.".length());


    }
}
