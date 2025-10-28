package p7;
import java.util.*;

public class App {
    public static void main(String[] args) {
    // Map 계열 : 키와 값을 쌍으로 저장
    // Map은 키는 거의 100% String를 사용
    // 키는 중복 불가, 값은 중복 가능
    // 결론은 ArrayList(썼는데 만약 느리면 linkedList로 바꾸기만하면됨-리스코프치환법칙), hash/map 잘 쓰면됨
    Map<String, StudentDto> map = new HashMap<>();
    map.put("한조", new StudentDto("한조"));
    map.put("영희", new StudentDto("영희"));
    map.put("철수", new StudentDto("철수"));

    }
}

class StudentDto {
    StudentDto(String name) {
        this.name = name;
    }
    String name;
    int age;
    int score;
}

