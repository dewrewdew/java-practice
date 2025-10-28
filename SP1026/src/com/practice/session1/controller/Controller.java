package com.practice.session1.controller;
import com.practice.session1.iomanager.*;

public class Controller {
    
    public void welcome() {
        IoManager.print("================================");
        IoManager.print("=========학생 관리 프로그램========");
        IoManager.print("================================");
    }

    public void bye() {
        IoManager.print("프로그램을 종료합니다.");
        IoManager.print("이용해주셔서 감사합니다.");
    }

    public void showMenu() {
        IoManager.print("[메뉴]");
        IoManager.print("1. 학생 정보 등록");
        IoManager.print("2. 학생 정보 목록 조회");
        IoManager.print("3. 학생 정보 검색");
        IoManager.print("4. 학생 정보 업데이트");
        IoManager.print("5. 학생 정보 삭제");
        IoManager.print("6. 학생 정보 통계");
        IoManager.print("0. 프로그램 종료");
    }

    public boolean isExitCommand(String command) {
        return command.equals("0");
    }
}
