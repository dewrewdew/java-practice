package p6;
// 람다식 사용 예시 2 => 리턴값이 void인 경우
public class p7 {
    public static void main(String[] args) {
        BBB bbb = System.out::println;
            // 코드가 줄어드는 과정을 익혀야 함!!
            // bbb는 메서드를 재정의하면서 인스턴스까지 생성해서 넣어주는것
            // 한줄짜리 코드라 {}도 생략 가능 세미콜론도 생략 가능
            // 정확하게 뭘 의미하는지 알고 쓰는게 이상적!
            // 이렇게 확실하게 한줄로 줄일 수 있을때 사용!
            // 파라미터가 한개인경우 BBB bbb = (a) 에서 () 도 생략 가능
            // 메서드 실행만 하는경우 더 줄이기 가능 =>System.out::println;으로!
            // BBB bbb = a -> System.out.println(a); 에서 더 줄이기 가능 System.out::println;(메서드 참조 문법) 왼쪽은 BBB bbb = 만 남김
        bbb.test(3);
        bbb.test(5);
        bbb.test(7);
            // 줄이는 과정을 알아야 하는 이유 : 어떤 단계까지 줄여서 쓸 수 있는지 상황마다 다름. 그래서 다 알고 있어야 함!
            // 물론 여러줄 쓸땐 람다식 잘 안씀
    }
}


interface BBB {
    public void test(int a);
}

class Some implements BBB {
    public void test(int a) {
        System.out.println(a);
    }
}