import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int remainingAmout;
        int i = 0;
        label: for(i = 0 ; true ; i++) {
            switch(i % 3) {
                case 1:
                remainingAmout = v - (i / 3) * (a + b + c) - a;
                if(remainingAmout <= 0) {
                    System.out.println("F");
                    break label;
                } break;
                

                case 2:
                remainingAmout = v - (i / 3) * (a + b + c) - (a + b);
                if(remainingAmout <= 0) {
                    System.out.println("M");
                    break label;
                } break;
                

                case 0:
                remainingAmout = v - (i / 3) * (a + b + c);
                if(remainingAmout <= 0) {
                    System.out.println("T");
                    break label;
                } break;
                

            }
        }

    }
}
