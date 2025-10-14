public class P3_1 {
    public static void main(String[] artgs) {
    Student2 s1 = new Student2("철수", 20, 30);
    Student2 s2 = new Student2("영희", 10, 20);

    System.out.println(s1.name);
    System.out.println(s2.name);

    }
}



class Student2 {
        String name;
        int age;    
        int score;


    //생성자
    Student2(String a, int b, int c){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        System.out.println("매개변수 3개짜리 호출됨");
        this.name = a; // this 인스턴스가 생성된 그 시점의 값의 주소를 나타냄.(그 메모리! 그 주소!) 따라서 인스턴스 s1이 생성됐을때는 그에 해당하는 값이 들어가고 인스턴스 s2이 생성됐을때는 그 값이 들어감.
                        // 왜? 인스턴스 생성 시 생성자가 무조건 1회 실행되니까!
        this.age = b;
        this.score = c;
        //필드명 그대로를 파라미터로 적고 그럼 변수가 똑같으니까 (main과 생성자) 생성자에 this를 붙여서 구분해줌
    }
    Student2(String a, int b) {
        this.name = name;
        this.age = age;
        // 생성자가 이미 존재하는데 한번 더 선언 => overloading
        // 입력 형식이 3칸짜리인경우 위의 생성자로 실행하고 2개면 아래 생성자가 실행됨
        // ex) new Student1("철수", 20, 20); => 위의 생성자 실행
        // ex) new Student1("철수", 20); => 아래 생성자 실행
    }

}