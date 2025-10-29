package p3;
import java.util.*;
import java.time.*;

public class App {
    public static void main(String[] args) {
        Map<String, TodoAdditionalData> todos = new HashMap<>();
        
        todos.put("러닝하기", new TodoAdditionalData());
        // 이렇게 하면 할 일이 키값이 됨!

        Set<String> keys = todos.keySet();
        for(String key : keys) {
            TodoAdditionalData data = todos.get(key);
            System.out.println("키 : " + key + ", 값 : ");
        }
        // map 자체로는 반복문 돌릴 수 x key값을 뽑아와서 반복문을 돌림
        // 주의 : 저장된 순서대로 출력되지 않음
    }
}
// 할일 관리
// 데이터 : 할 일, 등록일, 완료일, 완료 여부, 후기 (날짜 타입 다뤄볼 것 - order by)
// Hash Map 사용

class TodoAdditionalData {
    LocalDate 등록일;
    LocalDate 완료일;
    boolean 완료여부;
    String 후기;
}

// 할 일은 키로 관리
// map은 보통 반복문 돌리는 용도로 사용하진 x (향상된 for문 사용 불가)
// map은 보통 put과 get만 씀

// 시험 문제 완료 시간은 시스템 시간으로!