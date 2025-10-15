package p2;

public class App {
    public static void main(String[] args) {
        // App class 내에서 Test class 사용하기 위해서는 Test의 인스턴스를 생성해서 접근해야 함.
        Test t1 = new Test(); // 의미 : test 클래스에 인스턴스를 생성한다.
        t1.plus(0, 0);
        t1.plus(0, 0);
        t1.plus(0, 0);
        // 위 값들의 결과값은 plus 메서드의 결과값 즉 int! 따라서 아래와 같이 int 변수에 담을 수 있음.
        int r1 = t1.plus(0, 0);
    }
}


class Test {
    int a;
    int b;

    int plus(int c, int d) {
    // () 안에있는 int c,d 는 파라미터 (생략 가능)
        if(a < 0) return -1; // return 만나자마자 종료. 아래 내용 실행하지 않고 리턴값 반환하고 끝냄
        int result = a + b + c + d;
        // 사실 this.a + this.b라는거 주의!!!(c, d는 외부 값 받아오는 변수 a, b는 내가 가진값 변환하는 변수)
        return result;
    // test라는 클래스에서 plus라는 기능(메서드)를 정의
    // 생성자는 리턴타입 없지만 메서드는 리턴타입 명시해야 함. (리턴타입 없으면 void로 명시 => 이 땐 return 안써도 됨! 리턴값이 없으니)
    }
}