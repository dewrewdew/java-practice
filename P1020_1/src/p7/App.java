package p7;

public class App {
    public static void main(String[] args) {
        BBB b1 = new BBB();
        System.out.println(b1.a1);
        b1.testB();
    }
}


class AAA {
    int a1 = 10;
    int a2 = 20;
    AAA() {
        System.out.println("AAA 생성자 호출됨!! a1과 a2를 초기화하는 중요한 코드");
        // class BBB로 접근해도 AAA의 생성자가 실행됨.
    }
    AAA(int a1) {
        System.out.println("AAA 두번째 생성자가 생성됨");
    }
}
// class AAA를 다른 클래스가 더이상 상속받기를 원치 않는다면 맨 앞에 final을 붙여서 제한시킨다!
// final class AAA로 선언하게되면 아래 코드는 문법 오류가 됨.

class BBB extends AAA {
    int a1 = 30;
    int b1 = 40;
    int b2 = 50;
    BBB() {
        super(1);
        System.out.println("BBB 생성자 호출됨!! b1과 b2를 초기화하는 중요한 코드");
    }
    // 생성자 내에서 super(); 로 class AAA의 특정 생성자를 지정하여 실행 가능하다. => class AAA의 생성자가 많이 있는 경우 사용

    void testB() {
        System.out.println(a1);
        // 사실 a1은 this.a1임
        System.out.println(super.a1);
        // 클래스 AAA의 a1 참조 => 그러나 사용은 지양한다.(위험함)
    }
}
// 이 시점 변수는 5개! a1이 아예 덮어씌워진다는건 아님!
// 그러나 b1.a1으로 접근해서 class AAA에서 선언한 a1 = 10; 여기로 접근하는건 불가능!



// private은 자기 자식도 접근 못하고 super로도 접근 못함!!
// protected는 다른 패키지에서 super로 접근 가능!