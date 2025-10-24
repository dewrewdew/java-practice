package com.review.stm.controller;
import com.review.stm.service.*;
import com.review.stm.ioManager.*;


public class Controller {

    private Service service = new Service();

    public void run() {
        welcome();
        while(true) {
            showMenu();
            String command = selectCommand();
            if(isExitCommand(command)) {
                break;
            }
            processCommand(command);
            pause();
        }
        bye();
    }

     private void processCommand(String command) {
        if(command.equals("1")) {
            service.addStudent();
        } else if(command.equals("2")) {
            service.listStudent(); // <8> 작성한 list 불러오는 메서드!
        } else if(command.equals("3")) {
            service.searchStudent();
        } else if(command.equals("4")) { // <11> 이제 여기 짜보자!
            service.removeStudent();
        } else if(command.equals("5")) {

        } else if(command.equals("6")) {
        
        } else {
            System.out.println("잘못된 값을 입력하셨습니다.");
            System.out.println("다시 입력해주세요.");
        }
    }


    private void welcome() {
        IoManager.print("*******************************************");
        IoManager.print("             학생 관리 프로그램              ");
        IoManager.print("                  version2                 ");
        IoManager.print("                 2025.10.17                ");
        IoManager.print("*******************************************");
    // 가독성을 위해 welcome의 출력값을 메서드로 작성하고 실제 실행시에는 메서드만 호출
    }

    private void bye() {
        IoManager.print("프로그램이 종료됩니다.");
        IoManager.print("이용해주셔서 감사합니다.");
    }

    private void showMenu() {
        IoManager.print("[ 메뉴 ]");
        IoManager.print("1. 학생 정보 등록");
        IoManager.print("2. 학생 정보 목록");
        IoManager.print("3. 학생 정보 검색");
        IoManager.print("4. 학생 정보 삭제");
        IoManager.print("5. 학생 정보 수정");
        IoManager.print("6. 학생 정보 통계");
        IoManager.print("0. 프로그램 종료");
    }

    private String selectCommand() {
        String command = IoManager.input("선택 > ");
        return command;
    // 보통 return값을 뭘로 할지 먼저 결정 후 기능 구현. 코드 작성 시 코드명은 aaa로 일단 기재 후 영문은 따로 검색해서 채워넣기!
    }

    private boolean isExitCommand(String command) {
        return command.equals("0"); // 0 = 종료
    }
    private void pause() {
        IoManager.pause();
        // 다 그냥 명령어들인데 본문에 iomanager가 남아있는게 불편해서 정리해버리는용도!
    }

}
