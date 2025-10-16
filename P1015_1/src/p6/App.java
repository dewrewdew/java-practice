package p6;

public class App {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.a = 10;
        t2.a = 20;

        t1.c = 10;
        t2.c = 20;

        Test.c = 10; // 실질적 static에 접근하기 위해서는 클래스명을 활용
        
        System.out.println(t1.c);
        System.out.println(t2.c);

        //여기부터 별도
        Test t3 = new Test();
        t3.a = 10;


    }
}



class Test { // a,b를 인스턴스 변수라 함. 단, c는 인스턴스 변수가 아님.
    int a; // 인스턴스 변수 = 속성 = 필드 = Test클래스의 멤버
    int b;
    static int c; // 인스턴스 생성, 소멸과 상관없이 그냥 애초에 존재하고 절대 소멸되지 않음.
    //=> 인스턴스 변수 x 클래스 변수 - 인스턴스 생성과 관계 없이 처음부터 존재하고 소멸되지 않음.
    //=> 인스턴스 생성과 상관없이 존재한다?? 그럼 main에서 인스턴스 생성없이 쓸 수 있는 방법이 있는거아냐?
    //=> Test.c = 10; => 클래스명으로 바로 접근 그래서 클래스 변수!! => 별도로 값을 넘겨주지 않아도 다른데서 사용 가능
class Ex {
    void qqqq() {
        System.out.println();
        System.out.println(Test.c);
    }
}
}

// 메모리 영역이 stack, heap, 그리고 static구역 총 3개가 있다고 생각. 따라서 인스턴스생성여부와 상관없이 static에 계속 존재하는 모습을 떠올리면 됨.