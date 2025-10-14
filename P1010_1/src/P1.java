import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        //char aaa = s.charAt(3); 3번째 char값 반환
        // for(int i = 0 ; i < s.length() ; i++) {
        // }

        int sum = 45;
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.println((int)arr[i]);
            sum -= arr[i] - '0';
        }

        System.out.println(sum);

    }
}
