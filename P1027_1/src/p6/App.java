package p6;

public class App {
    public static void main(String[] args) {
        
    }
}

class Controller {
    public void controllerMethod() {
        new Controller();
    }
}

class Service {
    public void serviceMethod() {
        try {
            new Repository().repositoryMethod();
        } catch (Exception e) {
            System.out.println("에러 처리");
            return;
        } finally {
            // 그 어떠한 경우에도 실행됨.
            // 사실상 다른 용도로는 잘 안쓰고 자원반납용도
            // scanner.close();
            System.out.println("finally에서 실행됨");
        }
    }
}
class Repository {
    public void repositoryMethod() {

        new Repository();
    }
}