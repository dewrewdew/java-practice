package test1023;
import java.util.*;
public class Controller {

    public void run() {
        welcome();
        while(true) {
            showMenu();
            String command = selectCommand();
            if(isExitCommand(command)) {
                break;
            }
            processCommand(command);
        }
        bye();
    }

    private void welcome() {
        IoManager.print("==========가계부 프로그램==========");
    }

    private void bye() {
        IoManager.print("프로그램이 종료됩니다.");
        IoManager.print("이용해 주셔서 감사합니다.");
    }

    private void showMenu() {
        IoManager.print("[가계부]");
        IoManager.print("1. 거래 등록 (수입/지출)");
        IoManager.print("2. 거래 목록 및 합계");
        IoManager.print("3. 거래 삭제");
        IoManager.print("4. 카테고리별 합계");
        IoManager.print("5. 금액 내림차순 보기");
        IoManager.print("6. 검색(메모 키워드)");
        IoManager.print("7. 종료");
    }

    private String selectCommand() {
        String command = IoManager.input("선택 > ");
        return command;
    }
    
    private boolean isExitCommand(String command) {
        return command.equals("7");
    }

    private void processCommand(String command) {
        if(command.equals("1")) {

        }
    }

}
