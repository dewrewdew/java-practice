package p6;

public class App {
    public static void main(String[] args) {

    }
}
// class Person {
//     String name;
//     int age;
// }

// class Student {
//     String name;
//     int age;
//     int score;
// }

// class FireMan {
//     String name;
//     int age;
//     int height;
// }

// class Police {
//     String name;
//     int age;
//     int weight;
// }
// 이 경우 person을 부모로 3개의 자식을 만듦

class Person {
    String name;
    int age;
}

class Student extends Person {
    String name;
    int age;
    int score;
}

class FireMan extends Person {
    String name;
    int age;
    int height;
}