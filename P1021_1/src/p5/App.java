package p5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 하루 일과 프로그램
        new Controller().run();
    }
}

class Controller {
    private ServiceContainer serviceContainer = new ServiceContainer();
    public void run() {
        System.out.println("하루 일과를 시작합니다.");
        for(Service service : serviceContainer.getServiceList()) {
            service.process();
        }
        // service.wakeUp();
        // service.eat();
    }
}

// class Service {
//     public void wakeUp() {
//         System.out.println("일어납니다.");
//     }
//     public void eat() {
//         System.out.println("밥을 먹습니다.");
//     }

// }

interface Service {
    public void process();
}
class WakeUpService implements Service{
    public void process() {
        System.out.println("일어납니다.");
    }
}
class EatService implements Service {
    public void process() {
        System.out.println("밥을 먹습니다.");
    }
}


class ServiceContainer {
    private List<Service> list = new ArrayList<>();
    // 이것도 다형성! 왼쪽은 list<> 오른쪽은 arraylist<> => 오히려 다형성이 적용되어있지 않은 경우가 더 이상해서 확인해봐야 함!
    public ServiceContainer() {
    list.add(new WakeUpService());
    list.add(new EatService());
    }
    public List<Service> getServiceList() {
        return list;
    }

}




