
// <1> controller 작성


package com.joogang.stm.controller;
import com.joogang.stm.service.Service;
import com.joogang.stm.util.IoManager;

// 컴포넌트 - 로직 위주
// 현재 : 전체 흐름을 담당한다.
// 나중에 스프링에서는 사용자 입출력 담당 (최전방)

// [공부 방법]
// 1. 문법을 이해하려고 노력!!!
// 2. 충분한 반복 (코드에 익숙해진다 - 자연스럽게 이해되도록 타이핑을 멈추지 마라)
// 3. 반복 이후에 남은 어려운 부분들을 다시 공부
// 4. 복기 가능 - 삭제, 배열 크기 늘리는 부분은 제외해도 됨
// 5. 응용 - 고도화, 추가 기능 구현 / 이것을 이용해서 자신이 만들고 싶은 것을 만든다.
// 6. 암기는 금지 익숙해지게 만들것! 로직의 흐름을 익숙하게 만들자
// 7. 관계도 이해가 필수!!!
// <결론> 타이핑을 멈추지 말 것

public class Controller {
    // if문 안에 <5>에서 작성한 service class의 add, insert 등등의 기능을 사용하고 싶음
    // => 기능들이 static이 아니므로 반드시 인스턴스 생성해서 사용해야 함
    // => if문안에 생성문을 넣으면 매번 새로 생성됨 => 그럴때 필요한게 위로 올려서 멤버변수로 만들어버리기!!
    private Service service = new Service();

    // <4> welcome 작성 후 기재 => showMenu, selectCommand, isExitCommand, processCommand, iomanagerpause
    // while도 묶어서 welcome -> process -> bye 의 3단계로 간추릴 수 있음(이상적! 한 개의 메소드는 3줄이 넘지 않는게 좋다)
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



// <3> <2>의 IoManager 작성 후 기재
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
            service.statistize();
        } else {
            System.out.println("잘못된 값을 입력하셨습니다.");
            System.out.println("다시 입력해주세요.");
        }
    }


    private void pause() {
        IoManager.pause();
        // 다 그냥 명령어들인데 본문에 iomanager가 남아있는게 불편해서 정리해버리는용도!
    }

}

