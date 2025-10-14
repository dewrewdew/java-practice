import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {

        // 기본적으로 "="는 대입연산자! 따라서 = 기준 왼쪽은 무조건 변수라고 생각해도 무방함!
        // API
        // 출력
        System.out.println("안녕하세요!"); // ln이 붙으면 값을 출력하고 줄 바꿈 실행
        System.out.println("안녕하세요!");
        System.out.print("안녕하세요!"); // ln이 없어서 한 줄에 이어서 작성됨
        System.out.print("안녕하세요!");


        
        //입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 테스트!!");
        System.out.print("나이 입력 > ");
        String inputValue = scanner.nextLine(); // 입력 API 문자 반환
        System.out.println("입력하신 값은 [" + inputValue + "] 입니다.");

        int age = Integer.parseInt(inputValue); // 중요한 API 문자 -> 숫자로 변환(단, 변경 불가능한 문자에 사용 시 Exception 발생)

        if(age < 20) {
            System.out.println("성인이 아닙니다. 돌아가세요.");
        } else {
            System.out.println("성인입니다. 수업을 들을 수 있습니다.");

        }


        System.out.println("프로그램 종료!!!");


    }
}
