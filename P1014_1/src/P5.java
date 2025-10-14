public class P5 {
    public static void main(String[] args) {
            Student3 s1 = new Student3("철수");
            Student3 s2 = new Student3("영희");

            s1.study(3);
            s1.study(2);
            s1.study(5);
            s2.study(1);
            s2.study(1);
            s2.study(1);

            s1.printResult();
            s2.printResult();
            // 위 두 실행문은 로직은 같으나 this만 다름
    }
}



class Student3 {
    String name;
    int totalTime;
    int score;

    Student3(String name) {
        this.name = name;
    }
    Student3() {} // no argument consructure라고 함! ()안에 인자가 없음.

    void study(int hour) {
        this.totalTime += hour; // this가 없다고해서 아예 안쓴게 아님 축약된거 this는 무조건 존재!
        this.score += hour * 3;
    }
    void printResult() {
        System.out.println(this.name + "은 " + this.score + "점 입니다.");
    }
}
// 구조는 크게
// class 생성
// 필드
// 생성자
// 메서드