
// 이너 클래스
package p1;

public class App {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        AAA.BBB bbb = aaa.new BBB();
        // BBB는 보통은 해당 클래스 내에서만 사용!
        // CCC는 static이니 인스턴스생성과 관련없이 사용 가능!
        AAA.CCC ccc = new AAA.CCC();
    }
}

class AAA {

    class BBB {
    // 클래스 내에 클래스 선언 가능
    }
    static class CCC {
    // 자주 사용됨 => static이니 주구장창 사용됨
    // 
    

    }
    public void testA() {
        int a = 10;
        int b = 20;


        class BBB {
        // 메서드 내에서 클래스 선언 가능 => 특정 메서드 내에서만 쓸 클래스를 정의할 수 있다.
            public void testB() {

            }
        }

        BBB bbb = new BBB();
        bbb.testB();        


        System.out.println("ffff");
    }
}
