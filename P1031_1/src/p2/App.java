package p2;

public class App {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.setPriority(0);
        t1.start();
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
