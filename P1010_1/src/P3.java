import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String[] firstNames = new String[N];
        String[] secondNames = new String[N];


        for(int i = 0 ; i < N ; i++) {
            String value = scanner.nextLine();
            String[] splitValues = value.split(" ");
            firstNames[i] = splitValues[0];
            secondNames[i] = splitValues[1];
        }




        scanner.close();
    }
}
