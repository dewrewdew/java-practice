package p4;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ServiceContainer serviceContainer = new ServiceContainer();
        
        // 학생 관리 프로그램
        System.out.println("반갑습니다.");

        while(true) {
            System.out.println("메뉴");
            System.out.println("1. ...");
            System.out.println("2. ...");
            System.out.println("3. ...");
            System.out.println("4. ...");
            System.out.println("5. ...");

            String command = "0";

            if(command.equals("0")) break;

            // if(command.equals("1")) {}
            // else if (command.equals("2")) {}
            // else if (command.equals("3")) {} // 이 코드 대신 아래와 같이 작성
            // 이렇게 되면 코드 추가될때마다 일일이 추가해줘야함.

            Service service = serviceContainer.getService(command);
            service.run();
            // command에 따라 service가 뽑아다주는거 run으로 실행만 함!
            // 즉, if문으로 구현할거 이렇게 구현한거!
        }
    }
}

interface Service {
    public void run();
}

class StudentAddService implements Service {
    public void run() {
        // 학생 등록 로직
    }
}

class StudentRemoveService implements Service {
    public void run() {
        // 학생 삭제 로직
    }
}


class ServiceContainer {
    private Map<String, Service> map = new HashMap<>();

    public ServiceContainer() {
        map.put("1", new StudentAddService()); // 1이라는 글자로 studentaddservice를 담겠다는 뜻)
        map.put("3", new StudentRemoveService());
    }
    public Service getService(String command) {
        return map.get(command);
    }
}
