package p3;

public class App {
    public static void main(String[] args) {
        // 예외 처리 : 사실상 가장 중요한 문법!!! (프로그램 안정성 확보)
        // 기능이 구현 가능한 상태(실력)에서 그 다음으로 가장 중요한 것!
        

        //런타임 에러 (문법 에러 아님)

        System.out.println("프로그램 시작");

        int a = 10;
        int b = 0;
        // b 값을 바꿔가며 문제 있/없에 따라 결과가 try/catch문에서 어떻게 달라지는지 확인해보기

        try {
            System.out.println("로직 1");
            System.out.println(a/b);
            System.out.println("로직 2");
            // exception 여부를 확인할 문장
            // 위에 적은 문장이 실행될 때 프로그램이 다운되지 않고 바로 catch 실행
            // try문은 무조건 실행 됨
            // 문제있는 문장 포함 그 다음문장부터는 출력하지x => 바로 catch 실행하러 감!
        } catch (Exception e) {
            System.out.println("에러가 났어요. 그래도 프로그램이 뻗어버리지는 않습니다.");
            // 핸들링 할 exception 문장
            // 개발자의 실력 판단 기준 => catch문을 얼마나 잘 다루는가
            // 쉬운 케이스 : 사용자에게 알려준다.
            // 복잡한 케이스 : 에러를 복구하는 코드
        }


        System.out.println("프로그램 끝");
        // 실행은 되지만(프로그램 시작까지는 출력이 됨) 실행 시 익셉션 발생 => 프로그램이 언제든 종료될 수 있다.
        // 런타임 에러를 확인하기위해 사용하는게 try catch
        // 예외는 발생하지만 프로그램이 꺼지지는 않는다는게 이 구문의 효과!
    }
}
