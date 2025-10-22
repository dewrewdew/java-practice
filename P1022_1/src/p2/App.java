package p2;

// class 공부 꿀팁 => main(app) 개발자와 class 개발자가 서로 완전 다른 사람이라는 전제 하에 진행해야함!
// 즉 누가 어떻게 써도 호환이 되어야 함!
// p1의 static class CCC가 자주 쓰이는 유일한 경우
// "불변 객체" 가 있고 "가변 객체"가 있다!
public class App {
    public static void main(String[] args) {
        // StudentDto s1 = new StudentDto("한조", 30, 99);
        // // 일반적인 인스턴스 생성문
        // // 2번째가 age인지 3번째가 age인지 한번에 알 수 없어 가독성이 너무 떨어짐
        // StudentDto s1 = new StudentDto("");
        // s1.setName("한조");
        // s1.setAge(30);
        // s1.setScore(99);
        // 이렇게 쓰자니 원칙 위배 => Builder Pattern 구현!
        // setter 존재 자체가 가변 객체가 되는 이유
        StudentDto s1 = StudentDto.builder()
                                    .name("한조") // builder()의 리턴타입이 builder()이기 때문에 연쇄적으로 계속 작성 가능!
                                    .age(30) // name 실행 후 또 builder()니까 바로 또 작성
                                    .score(90) // age 실행 후 또 builder() 생성되니 바로 작성
                                    .build() // studentDto 인스턴스 생성 후 끝!
                                    ;
                                    // 이 코드 실무에서 엄청 많이 쓰임!! => 이런 생김새 보면 아 builder pattern이구나 판단하면 됨!
    }
}

class StudentDto {
    private String name;
    private int age;
    private int score;

    private StudentDto(Builder builder) {
        this.name = builder.name;
        this.age = builder.score;
        this.score = builder.score;
    }

    public StudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    // Builder Pattern (여러 디자인 패턴 중 하나)
    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {
        private String name;
        private int age;
        private int score;

        public Builder() {
        // 빌더라는 클래스 인스턴스
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder score(int score) {
            this.score = score;
            return this;
        }
        // setter와의 차이 : return 타입이 Builder! 즉, 유틸리티 클래스를 리턴함

        public StudentDto build() {
            return new StudentDto(this);
        }




    }

    // setter, getter 구현
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public void setScore(int score) {
    //     this.score = score;
    // }

    // public String getName() {
    //     return this.name;
    // }
    // public int getAge() {
    //     return this.age;
    // }
    // public int getScore() {
    //     return this.score;
    // }
}