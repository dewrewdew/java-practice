package iomanager;
import java.util.*;

public class IoManager {

    private static Scanner scanner = new Scanner(System.in);

    private IoManager() {}

    public static String input(String text) {
        System.out.print(text);
        return scanner.nextLine();
    }
    public static void print(String text) {
        System.out.println(text);
    }
    public static String pause() {
        System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
        return scanner.nextLine();
    }
    
}
