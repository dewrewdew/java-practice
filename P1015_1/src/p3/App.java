package p3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        IoManager ioManager = new IoManager();
        Calculator calculator1 = new Calculator();
        // app을 완성하기 위해서는 iomanager, calculator class 를 의지한다는 뜻!!
        String value = ioManager.input("값 입력 > ");
        ioManager.output("입력한 값 : " + value);
        // 기존의 System.out.println(value); => output 메서드를 정의함으로서 위 코드로 정리가 됨.
        

        // 1부터 10까지의 합
        // int sum = 0;
        // for(int i = 1; i <= 10 ; i++) {
        //     sum += i;
        // }
        // System.out.println(sum);
        // 위 코드를 여러번 실행해야 한다? 일일이 작성해야함 => 메서드로 해결!
        Calculator calculator2 = new Calculator();
        int result = calculator2.sum(1, 10);
        System.out.println(result);

        int inputStart = 77;
        int inputEnd = 1500;
        result = calculator2.sum(inputStart, inputEnd); // 실제로는 이렇게 실행!
        System.out.println(result);
        // 가독성을 높이기 위해 비슷한 로직을 메서드로 묶어 활용!! 가독성 높이기!


    }
}

// 일반화 되지 않은 class
// class Calculator{
    // void sumOneToTenAndPrintResult() { 
        // 메서드를 로직에서 일일이 확인하지 않으려면 명칭을 정확히 기록해줘야함. sum이런식으로 쓰면 정확히 무슨 값을 리턴하는지 알 수 없음
        // 1부터 10까지의 합
        // int sum = 0;
        // for(int i = 1; i <= 10; i++) {
        //     sum += i;
        // }
        // System.out.println(sum);

        // 1부터 10까지의 합은 너무 특수한 상황 => 일반화필요!
    //}
//}
class IoManager {
    // 속성 => 해당 클래스의 인스턴스를 생성하면 여기가 참조됨!!(속성이 생성됨)
    Scanner scanner = new Scanner(System.in);

    // 기능
    // 이제는 입출력도 클래스를 만들어서 해결하고 싶어!
    String input(String text) {
        // Scanner scanner = new Scanner(System.in); 이렇게 선언하면 메서드 선언할 때마다 scanner가 생성됨 => 불필요
        // class 속성으로 등록해버리자!! (불필요한 과정 최소화)
        String inputValue = scanner.nextLine();
        return inputValue;
    } // 입력 받아서 내어주겠다 이거여

    void output(String text) {
        System.out.println(text);
    }
}


class Calculator{
    // void sumPrintResult(int start, int end) { => "내 역할은 여기까지야"의 의미로 return값을 받기 위해 아래와 같이 선언!
    int sum = 0;
    int sum(int start, int end) {
        // start부터 end까지의 합
        // int sum = 0; // 지금 이 sum은 외부에 의존하지 x 여기 내에서만 사용됨 => 그래서 밖으로 꺼내서 멤버변수로 활용!
        for(int i = start ; i <= end ; i++) {
            accumulate(i);// 오른쪽과 같이 작성하면 accumulate method의 sum 변수와 연결이 안됨    sum += i; => 그래서 왼쪽과같이 작성
        }
        return sum;
        // System.out.println(sum);
        // 사용자 UI 코드와 API 코드의 역할 분담을 확실하게 해야함. 그런 의미에서 PRINT를 여기서 해버리는게 문제가 됨 => API 사용자의 역할임 출력은!
        // => 그래서!!! return으로 넘겨줌! "내 역할은 여기까지야 이제 이걸 활용해서 네가 이어서 해" 의 의미!!
        }
        // 주의!!!!!!!!!!!! void accumulate에 있는 sum과 다른 메서드에있는 sum은 메모리가 서로 다름.
        // 따라서 아래와 같이 작성하고 끝나면 sum이 생성은 되지만 그냥 여기서 소멸됨. 따라서 해당 sum값을 넘겨줄 장치가 필요
        // 메모리가 제일 중요!! 흐름 따라가볼것
    // void accumulate(int sum, int i) { // 여기부터는 나를 위한 코드!! 그래서 숨겨야함(은닉)
    //     sum += i;
    // } 그래서 여기에 return sum;을 선언해서 그 값을 다른 메서드로 넘겨줌
    void accumulate(int i) {
        sum += i;
    }
}

