public class P1 {
    public static void main(String[] args) {
    Qwer qqqq = new Qwer();
    // = 기준 왼쪽은 변수 생성 문법 오른쪽은 인스턴스 생성 문법!
    // qqqq도 지역변수!
    // Qwer qqqq ; // 변수 선언 문법 (참조 타입)
    // new Qwer(); // 인스턴스 선언 문법 => 결과는 이걸 가리키는 메모리 주소값! 따라서 qqqq에 대입 가능!
    qqqq.a = 10; // .은 접근연산자! qqqq를 통해 해당 클래스의 a에 대입!
    qqqq.b = 20;
}
}


// "지역 변수"만 스택에 쌓임.


//클래스 정의 문법(이 안에서 로직 실행은 안됨. 정의만 하는 부분이므로)
class Qwer {
    // 속성 - 멤버 변수 - 인스턴스 변수 => 지역변수가 x 스택에 쌓이지 x
    int a; //(int) Math.random() 값을 넣기위한 목적의 메소드는 사용 가능
    int b;
    int score;
    String name;
    //생성자
    //기능

}