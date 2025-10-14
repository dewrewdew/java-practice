import java.util.*;
public class P1013_review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        while(true) {
        System.out.println("[유효성 검사 - 숫자만 입력]");
        System.out.print("값을 입력하세요 > ");
        String checkNum = scanner.nextLine();
        char[] arr = checkNum.toCharArray();
        boolean isNum = true;
        

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > 'A') {
            System.out.println((i + 1) + "번째 입력값은 숫자가 아닙니다.");
            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
            isNum = false;
            break;
            }
        }

        if(isNum == false) {
            continue;
        }

        age = Integer.parseInt(checkNum);
        System.out.println("입력된 값은 " + age + "입니다.");
        break;
        }
    }
}


