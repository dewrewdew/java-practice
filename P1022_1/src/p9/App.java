package p9;

public class App {
    public static void main(String[] args) {
        new Some().test(() -> {
            System.out.println("사용자의 알고리즘!!");
        });

        
    }
}
interface Consumer{

    public void qqqqq();
}

class Some {
    public void test(Consumer aaaa) {
    
        System.out.println("test 시작 알고리즘");

        // 여기 알고리즘은 내가 짤 수 없다.
        aaaa.qqqqq();

        System.out.println("test 마무리 알고리즘");
    }
}

