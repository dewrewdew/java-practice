package p4;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력 > ");
        try {
        int score = Integer.parseInt(scanner.nextLine());
        System.out.println("score : " + score);
        // 이부분에서 사용자가 String을 입력 시 오류남
        // Exception in thread "main" java.lang.NumberFormatException: For input string: ""??????""
        // Exception 명칭 익혀둘 것! 자주 등장하는 익셉션들이 있음!
        // 이럴 때 사용하는게 try catch
        } catch (Exception e) {
            System.out.println("숫자를 입력하셔야 합니다.");
        }
        System.out.println("프로그램 종료");
    }
}