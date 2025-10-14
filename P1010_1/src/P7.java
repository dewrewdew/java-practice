import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        int a = arr[0] - '0';
        int b = arr[2] - '0';
        int result = a * b;
        System.out.println(result);

    }
}
