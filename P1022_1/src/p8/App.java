package p8;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // 리스트 사용 방법
        // StudentDto[] arr = new StudentDto[5]; => 배열의 크기가 정해져있지 않음(내부적으로는 5칸짜리가 선언되고 필요할때마다 계속 늘어남)
        List<StudentDto> list = new ArrayList<>();
        list.add(new StudentDto("철수"));
        list.add(new StudentDto("영희"));
        list.add(new StudentDto("길동"));
        list.add(new StudentDto("..."));
        list.add(new StudentDto("..."));

        // 리스트에서 값을 뽑아 오는 방법 (첫번째값이 0번쨰부터 시작하는건 배열과 똑같음!)
        StudentDto studentDto = list.get(2); // return 타입이 studentdto
        System.out.println(studentDto.getName());

        System.out.println("==========================");
        for(StudentDto element : list) {
            System.out.println(element.getName());
        // 반복문 출력 방법 1
        }
        System.out.println("==========================");
        // 반복문 출력 방법 2
        // Stream API - 람다식 사용
        list.forEach((student) -> System.out.println(student.getName()));
        // 반복문 한바퀴 될 때마다 뭘 수행할건지 알고리즘을 던져주는 것!
    }
}

class StudentDto {
    private String name;
    private int age;
    private int score;

    public StudentDto(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }



}
