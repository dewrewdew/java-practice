package p1;
// 자주 쓰이는 API => 경험에 의해 익숙해지는것이 방법!
public class App {
    public static void main(String[] args) {
        // Wrapper

        int a = 10;
        Integer b = 20;
        // 정석은 int 편의상 integer를 쓰는 것
        Integer.parseInt("333");
        // Integer 클래스 안에 있는 parseInt라는 메서드
        System.out.println(Integer.toBinaryString(10000));
        System.out.println(Integer.toHexString(10000));

        // String result = 10 + "";
        String result = String.valueOf(10); // 요걸 더 선호
    }
}
