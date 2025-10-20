package p5;

public class APp {
    public static void main(String[] args) {
        // 상속 - 다형성 - 오버라이딩 => 세개를 다 알아야 비로소 상속을 안다! 대표 개념은 다형성!
        // 문법 의도 : 결합도를 낮춘다 => 컴포넌트를 조립식으로 표현하자(결합된걸 뜯어내서 느슨하게 결합 응집도는 높이고 결합도는 낮춘다)
        // 상속 + 다형성 + 오버라이딩 => 인터페이스(자바의 꽃)

//         AAA ref1 = new AAA();
//         ref1.a1 = 10;

//         BBB ref2 = new BBB();
//         ref2.b1 = 10;
//     }
// }


// class AAA {
//     int a1;
//     int a2;

// }

// class BBB {
//     int b1;
//     int b2;
// }

// // 현재 상태에서 클래스 AAA와 BBB는 서로 전혀 관련이 x

    AAA aaa = new CCC();
    // 위 코드는 다형성에 해당되는 내용!


    AAA ref1 = new AAA();
    ref1.a1 = 10;

    BBB ref2 = new BBB();
    ref2.b1 = 30;
    ref2.testA();
    
    
    CCC ref3 = new CCC();
    ref3.a1 = 10;
    ref3.c1 = 10;

    DDD ref4 = new DDD();
    ref4.a1 = 10;
    // DDD가 BBB를 상속, BBB가 AAA를 상속받았으므로 연쇄적으로 전부 사용 가능.

    }
}

class AAA {
    int a1;
    int a2;
    void testA() {

    }
}

class BBB extends AAA {
    int b1;
    int b2;
}
// BBB클래스는 AAA를 확장해서 선언 => 즉, BBB는 AAA에다가 추가로 b1, b2를 선언한 것.
// BBB클래스의 int 변수는 총 4개!
// AAA는 BBB의 부모, BBB는 AAA의 자식
// BBB는 AAA를 상속받았다. (특성, 메서드 및 메모리도 전부 상속됨)
// 부모는 항상 1개만 존재! (A와 B로부터 동시에 확장할 수 x)

class CCC extends AAA {
    int c1;
    int c2;
}

class DDD extends BBB {
    int d1;
    int d2;
}