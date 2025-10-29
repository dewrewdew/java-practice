package service;
import java.util.*;
import todomanager.*;
import iomanager.IoManager;
import todo.*;
import java.time.*;

public class Service {
    private Repository repository = new Repository();

    public void addTodoList() {
        IoManager.print("==================== 할 일 추가 ====================");
        String inputTitle = IoManager.input("할 일의 제목 > ");
        Todo newtodo = new Todo(inputTitle);
        repository.addTodo(inputTitle, newtodo);
        IoManager.print("'" + inputTitle + "' 할 일이 성공적으로 등록되었습니다.");
        IoManager.print("===================================================");
    }
    public void viewAllTodoList() {
        IoManager.print("=================== 할 일 리스트 ====================");
        int index = 1 ;
        Collection <Todo> todoList = repository.findAllTodo();
        for(Todo todo : todoList) {
            String title = todo.getTitle();
            LocalDate regDate = todo.getRegisterDate();
            boolean isComplete = todo.getIsComplete();
            LocalDate compDate = todo.getCompletionDate();
            String comment = todo.getComment();
            IoManager.print("===========================");
            IoManager.print("순번 : " + index);
            IoManager.print("제목 : " + title);
            IoManager.print("등록일 : " + regDate);
            IoManager.print("완료 여부 " + (isComplete? "O" : "X"));
            if(isComplete) {
                IoManager.print("완료일 : " + compDate);
                IoManager.print("후기 : " + comment);
            }
            index ++;
        }
        IoManager.print("조회된 내역은 총 " + (index - 1) + "건 입니다.");
        IoManager.print("===================================================");        
    }
    public void markAsCompleted(Todo todo) {
        IoManager.print("==================== 완료 처리 =====================");
        String task = IoManager.input("완료된 할 일 제목> ");
    }
    public void viewUncompleted() {
        IoManager.print("=================== 남은 할 일 ======================");
        IoManager.print("===================================================");        
    }
    public void viewCompleted() {
        IoManager.print("================== 완료된 할 일 ======================");
        IoManager.print("===================================================");
    }
    public void searchTodo() {
        IoManager.print("================= 할 일 키워드 검색 ===================");
        IoManager.print("===================================================");        
    }
    public void removeTodo() {
        IoManager.print("=================== 할 일 삭제 =====================");
        IoManager.print("===================================================");  
    }
}