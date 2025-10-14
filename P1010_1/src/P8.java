import java.util.Scanner;
public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        
        boolean hasUppercase = false;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                hasUppercase = true;
                break;
            }
        }
        boolean hasLowercase = false;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z') {
                hasLowercase = true;
                break;
            }
        }

        boolean isDuplicated = false;
        for(int x = 0 ; x < arr.length; x++) {
            for(int y = x + 1 ; y < arr.length -1 ; y++) {
                if(arr[x] == arr[y]) {
                    isDuplicated = true;
                    break;
                }
            }
            break;
        }
        if(hasLowercase && hasUppercase && !isDuplicated) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
        
        
}
}