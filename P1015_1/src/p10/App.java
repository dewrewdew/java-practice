package p10;
import p11.Pppp;
public class App {
    public static void main(String[] args) {
            StudentDto s1 = new StudentDto();
            s1.setName("철수");
            System.out.println(s1.getName());



            Pppp p = new Pppp();// => 여기서 p. 까지 치면 이제 어떤 변수까지 사용 가능한지 보임
    }
}

// Dto = 기능 없음. 데이터를 묶기만 하는 용도의 클래스
// 편하게 다른데서 가져다가 쓰느냐고 만들었는데 속성을 전부 private으로 만들어버림 => 자바 bean(instance의 별명)의 표준 => 게터 세터 사용!!
class StudentDto {
    private String name;
    private int age;
    private int score;

    // setter - write 권한
    public void setName(String name) {
        this.name = name;
    }

    // getter - read 권한
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
