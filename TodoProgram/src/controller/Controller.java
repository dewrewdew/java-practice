package controller;
import iomanager.*;
import service.*;

public class Controller {
    private Service service = new Service();

    public void run() {
        welcome();
        while(true) {
            showMenu();
            String command = selectCommand();
            if(command.equals("0")) {
                break;
            }
            processMenu(command);
            pause();
        }
        bye();
    }




    private void welcome() {
        IoManager.print("================================");
        IoManager.print("========할 일 관리 프로그램=======");
        IoManager.print("================================");
    }
    private void bye() {
        IoManager.print("프로그램을 종료합니다.");
        IoManager.print("이용해주셔서 감사합니다.");
    }
    private void showMenu() {
        IoManager.print("[메뉴]");
        IoManager.print("1. 할 일 추가");
        IoManager.print("2. 전체 목록 조회");
        IoManager.print("3. 완료 처리");
        IoManager.print("4. 해야할 일 조회");
        IoManager.print("5. 완료된 일만 조회");
        IoManager.print("6. 제목 키워드 검색");
        IoManager.print("7. 내역 삭제");
        IoManager.print("0. 프로그램 종료");
    }
    private String selectCommand() {
        String command = IoManager.input("선택 > ");
        return command;
    }

    private void processMenu(String command) {
        if(command.equals("1")) {
            service.addTodoList();
        } else if (command.equals("2")) {
            service.viewAllTodoList();
        } else if (command.equals("3")) {
        }
    }
    private void pause() {
        IoManager.pause();
    }



}
