package p4;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Stack에서는 주로 push, pop 사용! => stack은 배열로 구성되어 있음!
        stack.push("햄버거");
        stack.push("치킨");
        stack.push("피자");
    }
}
