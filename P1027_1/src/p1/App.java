package p1;

public class App {
    public static void main(String[] args) {
        // 제너릭 => 용도는 딱 하나. 자료구조용!! list와 map에서 사용
        
        StudentDto<String> s1 = new StudentDto<String>();
        s1.age = "30";
        // <1> 임의의 대문자로 타입 지정 후 나중에 특정 타입으로 변환 가능(단, 왼쪽 오른쪽이 같은 타입이어야 함)
        // 위 실행문이 컴파일 될 때 해당 클래스가 <> 안에 기재된 타입으로 지정되어버림
        // 즉 name, age, score가 전부 String타입이 됨!
        StudentDto<Integer> s2 = new StudentDto<Integer>();
        s2.age = 30;
        // <2> 박싱, 언박싱과 관련된 Integer를 사용하여 변환해야함(제너릭은 privitive type으로는 변환 불가능하기 때문에)
        // <3> 요즘은 어차피 = 기준 왼쪽 오른쪽이 무조건 같을것이므로 오른쪽 <> 안에있는 값은 생략함
        // 최근엔 이렇게 사용 => StudentDto<String> s1 = new StudentDto<>();
    }
}



// class StudentDto {
//     String name;
//     int age;
//     int score;
    // <0> 어떨때는 score가 int였음 하고 어떨때는 score가 double이였음 좋겠다?
    // 여태 배운걸 가지고는 class를 여러개 생성할 수 밖에 없음(필드값을 여러개 설정해야하니까)
    // 이럴때 class명 옆에 <> 안에 아무거나 적으면 됨 (보통 대문자 1개 적음)
    // => 아무거나 적고 그 타입으로 필드 지정 가능!
class StudentDto<asdf> {
    asdf name;
    asdf age;
    asdf score;
    // 상속, 다형성, 오버라이딩의 최상단에는 오브젝트가 있다!!!!
    Object score2;
    // 제너릭이 없을때는 이렇게 짰었음 => 아무값이나 넣을 수 있음
    // s1.score = "13"; 도 가능 s1.score = 313; 도 가능
    // but 타입이 명시되어있는 int a같은 변수에는 object값 저장 불가
    // int a = s1.score; => 오류
    // 해결책 : object값을 type casting한다!
}
// class StudentDto2<T> {
//     String name;
//     T age;
//     T score;
//} // 만약 name은 age, score과 같이 제너릭을 사용하고 싶지만 그래도 둘과는 타입이 구분됐음 한다?
    // <> 안에 두가지 타입 지정!
class StudentDto2<N, T> {
    N name;
    T age;
    T score;

    public T test(T value) {
        T result = null;
        return result;
}   // 타입의 한 형태니까 당연히 다른 실행문에도 동일하게 적용 가능!

}   // 결론적으로는 class 설계 당시에 나는 타입을 뭘로 정의해야할지 모르겠으니까 쓸 때 정의해 느낌! 책임전가하는 느낌


