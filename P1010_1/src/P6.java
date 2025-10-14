import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;

        char[] arr = str.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        String newValue = new String(arr);

        System.out.println(newValue);

    }
}
