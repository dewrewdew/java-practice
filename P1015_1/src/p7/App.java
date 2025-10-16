package p7;

public class App {
    public static void main(String[] args) {
        Test.a = 10;
        Test.b = 30;
        Test.qqqq();
    }
}


class Test {
    int c;
    static int a;
    static int b;
    static void qqqq() { // method에도 static을 붙일 수 있다!!
        // a, b는 당연히 사용 가능
        // c는 인스턴스 변수(인스턴스 생성/소멸과 관련) => qqqq에서는 사용 불가(인스턴스 생성/소멸과 관련x)


        System.out.println("qqqq");
        // static 붙어있으면 static만 쓸 수 있다고 생각하기!
        // 그래서 보통은 전부 static이거나 아님 아예 아무것도static이 아니거나
        // 전부 static => 뭐 아무데서나 다 쓸 수 있다는 뜻!!!
        // 그래서 전부 static으로 선언하면 편하지만 결국은 또 메모리문제로 다 쓰지는 않음. => 얘도 필요할때만 쓰는게 좋음
        // static을 안쓰는 습관을 들일 것 !!!! 아예 안쓰고 코드 쓰는 버릇!!!!
    }

}