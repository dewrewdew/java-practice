package p2;
import java.util.*;
public class App {
    public static void main(String[] args) {
        StudentDto s1 = new StudentDto();
        
        List<StudentDto> studentDtos = new ArrayList<>();
        studentDtos.add(s1);
        // List안에 어떤 타입의 인스턴스들을 담을건지 타입을 지정해줘야 함! <>로!
        // 다른 타입을 담으려면 당연히 다른 List를 선언해야 함!

        List<School> schools = new ArrayList<>();
        School sch1 = new School();
        schools.add(sch1);
    }
}

class StudentDto {
    String name;
    int age;
    int score;
}
class School {
    String universityName;
}
