
// <0> DTO 정의 시작.
// DTO => 기능 없음. 자료 형태를 묶기 위한 클래스 (프로젝트 시작 시 0순위로 수행) => 핵심은 속성!
// 주로 속성은 private 메서드는 public => 무조건은 아니지만 대부분 적용
// 실행할 필요가 없는 부분. 따라서 main선언 별도로 진행하지x
// 이 값을 기준으로 전달하고 넘겨받는 역할! 그래서 DTO라 함!


package com.joogang.stm.dto;

public class StudentDto {
    private String name;
    private int age;
    private int score;

    // All Argument Constructor => No Argument Constructor가 필요할때도 있음 나중에는! 값 없는것도 기입받기 위해!
    // 보통 all, no 이렇게 두가지 생성(생성자 오버로딩)
    public StudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // No Argument Constuctor
    public StudentDto() { }

    // setter, getter => field(private)에 직접 접근이 불가하므로 메서드로 접근하겠다. => 당연히 public으로 생성(입력 받아와야 하니까)
    // 문법은 메서드지만 개념적으로는 기능으로 분류 안함! => 값만 입력받는 느낌(write 권한만 해당)
    
    
    
    // 여기부터 아래로 쭉 기재된 코드는 공식!! 이해를 기반으로 하되 숨쉬듯 작성할 수 있어야 함!
    
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
