package todo;
import java.time.*;

public class Todo {
    private String title;
    private LocalDate registerDate;
    private LocalDate completionDate;
    private Boolean isComplete;
    private String comment;

    public Todo(String title) {
        this.title = title;
        this.registerDate = LocalDate.now();
        this.completionDate = null;
        this.isComplete = false;
        this.comment = "";
    }
    public Todo() {}

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setRegisterDate() {
        this.registerDate = LocalDate.now();
    }
    public LocalDate getRegisterDate() {
        return registerDate;
    }
    public void setCompletionDate() {
        this.completionDate = LocalDate.now();
    }
    public LocalDate getCompletionDate() {
        return completionDate;
    }
    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public boolean getIsComplete(){
        return isComplete;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }
}