package p3;
// 이너클래스 중 "익명 클래스"
public class App {
    public static void main(String[] args) {
        AAA aaa = new Some();
        aaa.test();
        // aaa는 인터페이스를 상속받는 클래스의 인스턴스를 받을 수 있다!

        // AAA aaa2 = new AAA(); => interface는 인스턴스 절대 생성 불가!!
        AAA aaa2 = new AAA() { // 익명 클래스 정의 (new AAA는 불가 => 인터페이스는 인스턴스 생성 불가)
            // 원래 순서는 인터페이스를 정의하는 실제 구현된 class를 선언하고 그 인스턴스를 생성한 후에 변수로 지정
            // 이 과정을 한 줄로 단축시킴 => 익명 클래스를 생성 한 후 new로 인스턴스를 생성하면서 test를 오버라이딩해서 바로 사용
            // 인스턴스를 생성하는데 클래스까지 정의해야하는 번거로움으로 인해 문법을 단축시킴
            // 익명클래스는 잘 안씀
            public void test() { // 메서드 오버라이딩!
                System.out.println("하이");
            }
        }; // 실행문이니까 ";" 잊지말자!
        aaa2.test();

        AAA aaa3 = () -> System.out.println("헬로!!!"); // 람다식 => 익명 클래스보다 더 단축된 문법!! => 요즘 가장 많이쓰이는 기법
        aaa.test();
    }
}

// 익명 객제 - 사실상 람다식으로 대체된 문법
interface AAA {
    public void test();
}

class Some implements AAA {
    public void test() {
        System.out.println("야호!!");
    } // 인터페이스를 정의하는 클래스 (반드시 존재해야 함)
}