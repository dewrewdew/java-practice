package p8;

public class App {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a = 10;
        // t1.d = 10; => 접근 제한자. 따라서 쓸 수 x
    }
}


// 접근 제한자 - 캡슐화, 정보의 은닉
class Test {
    public int a; // 중요 => 너도 쓸 수 있다. <다른데서 class통해서 접근해서 쓸 수 있다> => api로 쓰겠다!
    protected int b;
    int c;
    private int d; // 중요 => 나만 쓸 수 있다. <선언한 클래스 내부>

    public void qqqq() { // => 메서드도 public/private 설정가능
        // 대신 메소드를 private 설정하면 main에서도 쓸 수 x 왜냐 이 클래스를 벗어나면 private에 접근할 수 없게되므로!
        a = 10;
        d = 10;
    }

}
