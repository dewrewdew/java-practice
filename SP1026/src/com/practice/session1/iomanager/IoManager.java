package com.practice.session1.iomanager;
import java.util.Scanner;

public class IoManager {
    private static Scanner scanner = new Scanner(System.in);

    public static String input(String text) {
        System.out.print(text);
        return scanner.nextLine();
    }
    public static void print(String text) {
        System.out.print(text);
    }
    public static String pause() {
        System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
        return scanner.nextLine();
    }
}
