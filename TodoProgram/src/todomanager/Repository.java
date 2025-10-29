package todomanager;
import java.util.*;
import todo.Todo;

public class Repository {

    private final Map<String, Todo> todoList = new HashMap<>();

    public void addTodo(String title, Todo todo) {
        if(todoList.containsKey(title)) {
            System.out.println("이미 등록된 항목입니다. 데이터가 덮어쓰기 됩니다.");
        }
        this.todoList.put(title, todo);
    }
    public Collection<Todo> findAllTodo() {
        return Collections.unmodifiableCollection(todoList.values());
    }
    public boolean updateCompleteStatus(String title) {
        todoList.containsKey(title);
        return true;
    }
    public Todo findByIsCompleted(boolean isComplete) {
        return todoList.get(isComplete);
    }
    



}
