package p5;
// 람다식 사용 예시 1
public class App {
    public static void main(String[] args) {
        AAA a1 = (c, d) -> c + d;
        // 단 한줄일 경우 이렇게 줄여 쓸 수 있는데 return도 생략 가능
        int result = a1.test(10,20);
        System.out.println(result);
    }
}


interface AAA {
    public int test(int a, int b);
}

class AAAImpl implements AAA {
        public int test(int a, int b) {
        return a + b;
    }
}
