public class P6 {
    public static void main(String[] args) {
        Student s1 = new Student("민지", 30);
        s1.age = 25;
        s1.introduce();

    }
}


class Student {
    String name;
    int age;

Student(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("생성자 실행됨");
}
void introduce() {
    System.out.println("안녕하세요. 저는 " + name + "이고, 나이는 " + age + "입니다.");
}



}

