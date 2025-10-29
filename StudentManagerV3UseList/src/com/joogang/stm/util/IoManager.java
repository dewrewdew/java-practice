
// <2> 중요한 부분은 아님! static을 쓰기 위해 만들어 봄.


package com.joogang.stm.util;

import java.util.*;

public class IoManager {
    private static Scanner scanner = new Scanner(System.in);
    // static의 장점 : 처음부터 끝까지 계속 쓸 수 있다. 단점 : 메모리도 계속 소멸되지 않는다.

    private IoManager() {}
    // 생성자를 private으로 막아버림 => 새로운 인스턴스 생성 막아버리기

    public static String input(String text) {
        System.out.print(text);
        return scanner.nextLine();
    // nextLine()으로 scanner로 받아서 변수에 넣고 원래는 return aaa; 이런식으로 작성했으나 이제 바로 넣자!
    // scanner.nextLine(); 결과값도 String이고 리턴값도 String => 문제 x
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void pause() {
        System.out.println("계속 진행하시려면 enter를 입력하세요.");
        scanner.nextLine();
        // 안내창 띄우고 입력 기다리기
    }
    
    
}
