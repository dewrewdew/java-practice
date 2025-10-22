package p3;

public class App {
    public static void main(String[] args) {
        // SOLID 원칙
        // 클래스 설계를 위한 5가지 원칙

        // SRP : 단일 책임 원칙
        // OCP : 개방 폐쇄 원칙
        // LSP : 리스코프 치환 원칙 => 주입 클래스가 바뀌어도 동작(즉, 클래스가 기대하는 결괏값)은 같아야한다. 그냥 원래 기능이 그대로 잘 작동돼야한다는 뜻
        // ISP : 인터페이스 분리 원칙 => 거대한 인터페이스 만들지 말고 잘 쪼개자
        // DIP : 의존 역전 원칙 => 제어의 역행 a가 바로 b를 생성하지 말고 b가 컨테이너 통해 별도로 생성해서 제어하자

    }
}
// <ISP> 적용 전
// interface Movable {
//     public void fly();
//     public void walk();
//     public void run();

// }

// <ISP> 적용 후

interface Flyable {
    public void fly();
}

interface Runable {
    public void run();
    public void walk();
}
