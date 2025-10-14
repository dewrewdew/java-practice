public class P3 {
    public static void main(String[] args) {
        // 실행 버튼을 누르면 오로지 main만 실행된다고 생각하자!!
        System.out.println("프로그램시작");
        System.out.println("인스턴스 생성 전");
        Student1 s1 = new Student1(2); // 인스턴스 생성 구문이 있으면 무조건 생성자 1회 호출함
        System.out.println("인스턴스 생성 후");
        s1.name = "철수";
        s1.age = 20;
        s1.score = 70;

        Student1 s2 = new Student1(1);
        s2.name = "영희";
        s2.age = 10;
        s2.score = 90;
        System.out.println("프로그램 끝");

        int a = 10;
        Student1 s3 = new Student1(a);
        //생성자에서 a의 타입이 선언된 이후부터는 new Student()로 공란으로 둘 수 없음. 입력 받을 수 있는 형태가 정해져있으므로
        //Student1(String a, int b){ } 생성자를 이렇게 선언하게 되면 new Student1("sdfsdf", 112); 이 형태로 입력해야 함.

    }
}


class Student1 {
    // 속성(필드), 멤버(인스턴스) 변수
    String name;
    int age;
    int score;

    // 생성자 - 일반적으로는 초기화 목적(인스턴스가 실행될 때 바로 실행됨(구구단 같은 것도 가능))
    Student1(int a) {
        // 실행되는 코드 부분
        // 여기서 선언한 int a와 main에서 선언하는 int a는 서로 다름. 각각 별도로 존재! => 즉 "a"라는 변수로 연결된 게 아니라 형태만 의미.
        // 즉 main과 생성자에 변수명이 각각 a,b로 선언되어있어도 값을 넘겨받아 실행하는 것!
        // 따라서 main에서 선언한 int a는 여기서 사용할 수가 없음. 그래서 매개변수가 필요!
        // 이제 학생값을 클래스로 만들어 name, age, score를 한번에 설정 가능!
        // argument : 넘겨주는 값 / parameter : 변수
        System.out.println("Student1 생성자 부분 실행됨");
    }
}
