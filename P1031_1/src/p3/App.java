package p3;

public class App {
    public static void main(String[] args) {
        // 비동기 코드(퍼포먼스의 향상=>여러 프로세스 동시실행/cpu를 동시에 사용) 작성 시 주의 사항
        // 상당수는 데이터를 공유하지 않음 => 편하게 비동기 코드 작성해도 됨.
        // 여러 쓰레드(비동기 코드가) 메모리를 공유하면 많이 힘들어짐. 동기화 필수
        // 쓰레드는 개념이 제일 중요!!!

        // for(int i = 0 ; i < 100 ; i++) {
        //     Data.increaseCount();
        // }
        // for(int i = 0 ; i < 100 ; i++) {
        //     Data.increaseCount();
        // }
        Test t1 = new Test();
        t1.start();
        Test t2 = new Test();
        t2.start();

        t1.join(); // join 동기화 메서드 - t1 쓰레드가 끝날때까지 기다림
        t2.join(); // join 동기화 메서드 - t2 쓰레드가 끝날때까지 기다림
        
        System.out.println(Data.count);
    }
}

class Test extends Thread {
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++) {
            Data.increaseCount();
        }
    }
}

class Data {
    public static int count = 0;
    public synchronized static void increaseCount() {
        int temp = count;
        System.out.println("어떤 코드"); // 일부러 오버헤드 발생 시킬 목적
        temp++;
        count = temp;
    }
}
