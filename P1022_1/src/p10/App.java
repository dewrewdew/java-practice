
package p10;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // 여기가 service 내부 코드라는 가정
        // Repository에서 getList()를 호출했다.
        // 근데 Repository에서는 StudentEntity배열로 결과를 줬다.
        // 다시 contoller로 배열을 리턴해야 하는데 StudentDto 배열로 리턴해줘야한다.

        List<StudentEntity> entitieList = new ArrayList<>();
        entitieList.add(new StudentEntity("한조", 30, 99));
        entitieList.add(new StudentEntity("김철수", 30, 99));
        entitieList.add(new StudentEntity("김영희", 30, 99));
        entitieList.add(new StudentEntity("길동", 30, 99));
        // 위처럼 repository에서 배열을 service에 전달했다.
        // 문제 : StudentEntity -> StudentDto로 변환해라

        List<StudentDto> dtoList = new ArrayList<>();
        for(StudentEntity entity : entitieList) {
            // StudentDto studentDto = new StudentDto();
            StudentDto studentDto = StudentDto.fromEntity(entity); // 정적 팩토리 메서드
            dtoList.add(studentDto);
        } // 이 코드 마스터 해야함. 중요!!!
        

        // dtoList를 리턴한다
        //List<StudentDto> dtoList = entitieList.stream()
        //.filter(entity -> entity.getName().startsWith("김"))
        //.toList();

        double average = dtoList.stream()
            .filter(dto -> dto.getName().length() <= 3)
            .mapToInt(dto -> dto.getScore())                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
            .filter(score -> score >= 50)
            .distinct()
            .average().getAsDouble();
        entitieList.stream()
            // .map(entity -> StudentDto.fromEntity(entity)); 단축1
            // .map(entitu -> entity.toDto()); 단축2
            .map(StudentDto::fromEntity); // 단축3
            // 웬만하면 람다식은 한줄로 짜야됨. 중괄호 쓸거면 람다식 안쓰는게 나음
        // ->로 인해 가독성이 높아짐
        
    }
}


class StudentDto {
    private String name;
    private int age;
    private int score;
    // Entity -> Dto 변환 (보통은 from을 조금 더 선호)
    public static StudentDto fromEntity(StudentEntity entity) {
        return new StudentDto(entity.getName(), entity.getAge(), entity.getScore());
    }
    public StudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
}

// Service - Repository간에 사용될 구조
class StudentEntity {
    private String name;
    private int age;
    private int score;
    public StudentEntity(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    // Entity -> Dto 변환 메서드
    public StudentDto toDto() {
        return new StudentDto(name, age, score);
    }

        public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
}
