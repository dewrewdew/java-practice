package p1;

public class App {
    public static void main(String[] args) {
        // 상속 - 다형성 - 오버라이딩 => 인터페이스

        Walkable walker = new Person();

        walker.walk();
        // walker.fly(); => 실행 불가
        // Person class 에서 Walkble은 구현되어있지 않음
        System.out.println("fff"); 
        // => API로 부르는 이유 => 이것도 하나의 interface였다!!
        // public은 interface로 정의되지만 private은 나만쓰기위해 정의하는것으로, interface라 하지 x
    }
}


interface Flyable {
    public void fly();
}
// interface에서 제공되는 메서드는 무조건 public(생략 가능), abstract도 생략되어 있음

interface Walkable {
    public void walk();
}

class Person implements Walkable {
    public void walk() {
        System.out.println("사람의 로직으로 걷습니다.");
    }
}
// 의미 : 사람은 walk를 구현하는 단계다 (상속과 의미는 유사)
// 사실상 상속과 오버라이딩을 진행한 것!
// 자바는 다중상속(부모여러개)을 지원하지 않음 => interface에서만 가능!!

// 자바 interface 다중상속 코드
// 다른 언어들은 전부 다중상속 가능 => 자바에서는 implements라는 단어를 사용해서 다중상속되는것을 명확하게 구분하겠다는 의도!
class Duck implements Flyable, Walkable {
    public void walk() {
        System.out.println("우리의 로직으로 걷습니다.");
    }
    public void fly() {
        System.out.println("우리의 로직으로 날아갑니다.");
    }
}
// 인터페이스 => 사람과 자동차가 있다고 치고 이해. 개념 이해 못하면 다 무너진다!!!
// 사람은 자동차를 이용하기 위해서 자동차는 사람을 위해 인터페이스를 제공해야 합니다.
// 자동차가 제공하는 인터페이스 : 핸들, 악셀 등등
// 즉 사람-인터페이스-자동차
// 자동차의 동작 요소(시스템 공학) 등등을 알 필요 x 자동차가 제공해주는 인터페이스만 이용하면 됨.
// 인터페이스의 표준을 제공하여 다른 자동차들도 쉽게 운전할 수 있게 함 => 자바 인터페이스의 가장 중요한 정의!
// 사람과 tv의 인터페이스는 리모콘 -> 추상화 레벨 낮춰서 리모콘과 사람의 인터페이스는 버튼


