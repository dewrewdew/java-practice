package p12;

public class App {
    public static void main(String[] args) {
        final int a = 10; // 한번만 초기화 하고 그 이후로는 절대 값을 못 바꾸게 하겠다.
        final String databaseIp = "211.222.111.222";
        // a = 20; 변경 불가


        System.out.println(Math.PI); // PI값처럼 고정되어있는 값에 사용! PI는 메서드가 아님. 상수!
    }
}



// final
class Test {
    public static final String STUDENT_NAME = "ddd"; // => static final, final static 순서 상관 x 대신 얘는 무조건 public!!
}
