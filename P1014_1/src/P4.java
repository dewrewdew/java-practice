import java.util.Scanner;
public class P4 {
    public static void main(String[] args) { // 프로그램 실행이라 함은 main{}내에있는게 전부!!! main밖에 있는 건 그때그떄 필요할때 참조할 뿐
        // 그래서 "프로그램 종료"문 보다 class에 있는 메서드가 먼저 실행되는 것!
        Worker w1 = new Worker("철수");
        Worker w2 = new Worker("영희");
        System.out.println("프로그램 종료");

        w1.test1(); // 메서드 호출 문법
        w2.test1();
        w1.test2(5, 7); // 메서드 test2 실행 후 int 값 리턴
        int aaa = w1.test2(5,7); // 위와같이 리턴값이 int이므로 저장되는 변수 타입도 int여야 함!
    }
}


class Worker { // => 의미 : Worker에 대해 정의한다!
    // 속성
    String name;
    int money;
    // 생성자
    Worker(String name) {
        this.name = name;
    }

    // 기능 - 메서드 (일반적으로 변수명은 동사)
    void test1() { // 메서드 정의 문법 (정의만! 실행은 main문에서 따로 지시 해야됨)
        //실행될 코드, 논리코드, 알고리즘
        System.out.println("test1 호출됨");

    }
    int test2(int a, int b) { // void는 리턴값의 형태 => void가 아닌 경우 무조건 return값의 형태가 정의 되어야 함.
        // 실행될 코드.. 논리 코드.. 알고리즘
        if(a < 0 || b < 0) {
            System.out.println("음수는 허용되지 않습니다.");
            return -1; // 메서드에서는 return이 break 역할 대신 return은 어떤 값을 반환하면서 끝낼 뿐! 여기서는 -1 반환하고 if문 끝냄
            // 차이점은 return은 반복문 후에 무슨 조건이 있던 밑에 반복문이 몇개가 더 있던 상관없이 그 시점에 아예 끝내버림
            // return은 무조건 존재해야 함!
        }
        System.out.println("test2 호출됨");

        return a + b;
    }
    
    void test3(String text) {
        if(text.contains("바보")) {
            System.out.println("비속어는 사용이 불가합니다.");
            return;
        } // 메서드의 파라미터가 다르면 서로 다른 메서드니 새로 생성 가능! => 메서드도 오버로딩 가능


        System.out.println(text);
    }
}