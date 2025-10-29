package com.joogang.stm.controller;
import com.joogang.stm.service.*;
import com.joogang.stm.util.*;

public class Controller {
    private Service service = new Service();

    public void run() {
        IoManager.print("=== 학생 정보 관리 프로그램 v3 ===");
        while(true) {
        showMenu();
        String command = IoManager.input("메뉴 입력 > ");
        if(command.equals("0")) break;
        processControl(command);
        }
        IoManager.print("프로그램을 종료합니다.");
        
    }










    public void showMenu() {
        IoManager.print("===== 메뉴 =====");
        IoManager.print("1. 등록");
        IoManager.print("2. 목록");
        IoManager.print("3. 검색");
        IoManager.print("4. 삭제");
        IoManager.print("0. 종료");
        
    }

    public void processControl(String command) {
        if(command.equals("1")) {
            service.addStudent();
        } else if(command.equals("2")) {
            service.listStudent();
        } else if(command.equals("3")) {
            service.searchStudent();
        } else if(command.equals("4")) {
            service.removeStudent();
        } else {
            IoManager.print("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
        }
    }

}
