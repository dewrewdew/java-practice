package p5;

public class App {
    public static void main(String[] args) {
        try {
        String str = null;
        str = str.substring(3);
        // null point exception
        int a = 3 / 0;
        // number format exception
        int[] arr = new int[5];
        arr[7] = 30;
        // index out of bound exception

    } catch (Exception e) {
        // catch에서 ()안에있는 값은 메서드에서의 파라미터와 역할이 비슷! 딱 한개만 넣을 수 있음!
        // jvm에서는 Exception이라는 클래스가 존재함!
        e.printStackTrace(); // 익셉션 정보 출력!
        // e는 결국 Exception이라는 클래스의 인스턴스이므로 메서드 사용 가능
        // 그 중 가장 많이쓰이는 메서드!
        }

        System.out.println("프로그램 종료");
        // try catch문은 코드의 가독성이 떨어져서 실무에서는 거의 안씀! 다른 방식 사용
        // 만약 익셉션이 여러군데서 발생할 때 구문별로 catch문을 작성하고 싶다면? 각각의 익셉션이 어떤건지 정확한 명칭을 알아야 함!
        // catch(NullPointerException e) {} 이런식으로 else if처럼 사용 가능하다!! => Exception class를 상속받은 것!
        // catch(ArithmeticException e) {} 이렇게 이어서 작성 가능!
        // 어떤 예외가 나올 지 예측을 못하면 의미가 없음!
        // 그래서 그냥 일반 클래스의 오브젝트에 해당하는 Exception 클래스의 오브젝트 Exeption 클래스를 그냥 적어버림
        // => 로그 출력용! 그게 바로 e.printStackTrace();
    }
}
