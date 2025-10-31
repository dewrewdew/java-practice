package p1;

public class App {
    // thread
    // 프로세스 간 메모리를 공유하지 않는다.
    // 하나의 프로세스안에 여러개의 프로세스 생성 가능
    public static void main(String[] args) {
        // new Test1().run();
        // new Test2().run();

        // System.out.println("프로그램 종료!!");
        // Test1의 run이 끝나야 Test2의 run 실행 가능
        // 기존에 진행했던 위와같은 코드들이 동기식 프로그램 기법 => 99%는 동기식 코드!

        new Test1().start();
        new Test2().start();
        
        new Thread(new Test3()).start();

        System.out.println("프로그램 종료");
        // 이게 비동기식 프로그래밍 기법 => Javascript에서 매우 중요
        // 메인쓰레드가 종료되어야 프로그램이 끝난거!
        // start() 메서드를 실행해야 스레드가 실행됨 run()은 그냥 호출만 함
        // 비동기식 프로그램은 실행 결과를 예측할 수가 없음. 불가능함. Operating System역할

        // for(int i = 0 ; i < 100 ; i++) {
        //     System.out.println("야호!!" + i);
        // }

        // for(int i = 0 ; i < 100 ; i++) {
        //     System.out.println("으아아!!" + i);
        // }

    // 원래는 for문 각각 다 실행하고나서 그 다음걸 실행했는데 동시에 실행하는것처럼 보이게 할 수가 있다.(Round Robin)

    }
}

class Test1 extends Thread {
    @Override
    // Anotation => thread라는 클래스에 qwer이라는 메서드가 존재하지 않으면 컴파일 오류를 일으킴(습관들이기)
    public void run() {
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println("야호!!" + i);
        }
    }
}

class Test2 extends Thread {
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println("으아아!!" + i);
        }
    }
}

// 인터페이스 구현 방법
class Test3 implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println("야호!!" + i);
        }
    }
}
// 인터페이스다 -> abstract가 한개다 -> 100% 람다식이다.