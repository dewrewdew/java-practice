package polymorphism;
// <2> user 설정 => 아래 코드가 완성 코드(완성된 흐름)라는 전제하에 작성!
public class App {
    public static void main(String[] args) {
        // 상속 - 다형성 - 오버라이딩 = 인터페이스
        // 표준을 정의하고 조립식으로 만들자!
        // DI(Dependency Injection), IoC(제어의 역행), Container(Factory)
        
        BeansContainer beansContainer = new BeansContainer();
        User user = beansContainer.getUser();
        user.watchTv();
    }
}
