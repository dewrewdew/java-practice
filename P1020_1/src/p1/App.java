package p1;

public class App {
    public static void main(String[] args) throws Exception {
        new Test2().qqqq();
    }
}

class Test1 {
    public void qqqq() throws Exception {
        Thread.sleep(50);
        // 실행 시간을 좀 늦추는 api
        System.out.println("qqqqq 시작");

        yyyy();
        // 같은 class 내의 메서드(멤버) 실행 가능 => main에서 qqqq실행 => yyyy 실행
        System.out.println("qqqqq 끝");

        qqqq();
        // 자기 자신을 실행하는 것도 가능 => 재귀 메서드! (실행 순서 : main qqqq->yyyy->qqqq->무한 반복 => return 설정 필수)
        // 단, for문처럼 반복으로 생각하지 말고 stack에 qqqq가 계속 쌓이는걸로 생각하기!

    }

    public void yyyy() {

    }
}

class Test2 {

    private int count = 0;

    public void qqqq() throws Exception {
        Thread.sleep(50);
        count++;
        if(count > 10) return;

        int currentCount = count;

        System.out.println("qqqqq 시작" + currentCount);

        qqqq();

        System.out.println("qqqqq 끝" + currentCount);
        
    }

    public void yyyy() {

    }
}
// Test2 실행 순서
// qqqqq 시작1
// qqqqq 시작2
// qqqqq 시작3
// qqqqq 시작4
// qqqqq 시작5
// qqqqq 시작6
// qqqqq 시작7
// qqqqq 시작8
// qqqqq 시작9
// qqqqq 시작10
// qqqqq 끝10
// qqqqq 끝9
// qqqqq 끝8
// qqqqq 끝7
// qqqqq 끝6
// qqqqq 끝5
// qqqqq 끝4
// qqqqq 끝3
// qqqqq 끝2
// qqqqq 끝1