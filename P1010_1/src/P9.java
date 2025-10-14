import java.util.Scanner;
public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        String[] firstNames = new String[number];
        String[] secondNames = new String[number];

        for(int i = 0 ; i< number ; i++) {
            String input = scanner.nextLine();
            String[] splitValues = input.split(" ");
            firstNames[i] = splitValues[0];
            secondNames[i] = splitValues[1];
            }
        
        
        for(int x = 0 ; x < number ; x++) {
            for(int y = 0 ; y < number ; y++) {
                if((firstNames[x].equals(firstNames[y]) || firstNames[x].equals(secondNames[y]) ||
                    secondNames[x].equals(firstNames[y]) || secondNames[x].equals(secondNames[y]))) {
                    // x의 이름이 다른 사람의 성 혹은 이름과 중복 되는 경우 혹은 x의 성이 다른 사람의 성 혹은 이름과 중복 되는 경우
                } {
                    
                }
            }

        }

    }
