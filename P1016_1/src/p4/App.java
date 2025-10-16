package p4;

public class App {
    public static void main(String[] args) {
        // SomeComponent sc = new SomeComponent(); => 불가

        // sc.func(); => 불가
    }
}


// 싱글톤
// Component : 기능 위주의 클래스 => 대부분의 경우 한번만 생성 후 재활용
// Dto, Vo = 데이터 구조의 클래스, 많이 자주 생성됨.

class SomeComponent{
    // 싱글톤 패턴 코드 => 시작
    private static SomeComponent instance = null; // static이니 자기자신이 없어도 사용 가능

    public static SomeComponent getInstance() {
        if(instance == null) { // 처음 생성할때는 null이니까 통과! 그 다음부터는? null이아니니까 그냥 원래있던거 꺼냄
            instance = new SomeComponent();
        }
        return instance;
    }

    private SomeComponent() {} // 생성자를 private으로?! => 인스턴스 생성을 막아버림!! ex) static의 경우 인스턴스와 상관없이 작동되므로 쓸데없이 새로 만드는걸 막기위해 private 으로 막아버림
    // 싱글톤 패턴 코드 => 끝

    // 실제 기능
    public void func() {
        System.out.println("기능이 실행됩니다.");
    }

}
// 아래는 별도 내용
class Person {
    BBB b = new BBB(); // 멤버변수 => AAA 와 BBB가 일심동체느낌 라이프사이클이 동일 즉, AAA가 무너지면 BBB도 같이 다 무너지는 느낌
    // BBB가 AAA에 완벽하게 종속
    // AAA : Person BBB : eye 대입 완벽 종속 관계 AAA가 있어야 BBB가 비로소 존재
    Car c;
    public void aaa() {
        BBB b = new BBB(); // 지역변수 => aaa메서드가 실행될때만 살짝 쓰고 끝나는케이스 (위에있는 멤버변수에 비해 사용하기 가벼움)
    Car car;
    // DI = 의존 주입 코드 (생성자 주입)
    // Person(Car car) {
     //    this.car = car;
    }
    // }
}

class BBB {

}

class Car {

}
