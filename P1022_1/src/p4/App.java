package p4;

public class App {
    public static void main(String[] args) {
        // 람다식 - 현재 함수형 프로그래밍 기법 주요 문법
        // 가독성을 높이고, 간결하게 사용하자
        // 사용 조건 : 하나의 추상 메서드가 있는 interface
        // AAA a1 = null; // a1은 참조타입이므로 null 값 대입 가능


        // <1> 람다식 기본 정보 기재 후 시작 => 무조건 단 하나의 추상 메서드만 존재하므로 굳이 메서드명을 기재하지 않음.
        AAA a1 = (x, y) -> {; 
            // <2> 매개변수 서로 다르게 써도 상관 x => 문법적으로 원래 다르게 써도 됨 일반적인게 통일해서 쓰는것일뿐!
            // x, y는 test메서드의 파라미터 그래서 이름 서로 달라도 각각 int a, int b 자리에 들어감!
            System.out.println(x);
            System.out.println(y);
            int result = x + y;
            return result;
            // 이렇게 4줄이나 될 때는 람다식 쓰지 않는게 좋음. => 정석 람다식 사용법 p5에 기재!
        };
        int result = a1.test(10,20);
        System.out.println(result);

    }
}


interface AAA {
    public int test(int a, int b); 
    // 조건 1 : 단 하나의 메서드만 존재
}
// interface가 있으면 상속 받는 class가 있어야 한다 => 불변의 법칙
// 상속 후 메서드를 오버라이딩 한다.
class AAAImpl implements AAA {
    public int test(int a, int b) {
        return a + b;
    }
}
