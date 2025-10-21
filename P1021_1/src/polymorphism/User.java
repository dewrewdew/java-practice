package polymorphism;
// <1> 사용자의 행동 정의 => 각 제조사의 개별 기능과 상관없이 어떤것도 동일하게 조작이 가능해야 함!
// 삼성Tv만의 조작 방법 구현 이런걸 해야하는게 x

public class User {
    // <7> 결합도 낮추기 시작! 인스턴스생성없이 tv 인터페이스 사용하기
    // Tv tv; 인스턴스 선언 없이 이렇게만 쓰거나 아님 아래있는 public void watchTv() 안에 watchTv(Tv tv) 이렇게 넣어버리겠다!
    // 아래와 같이 watchTv() 안에 인터페이스를 넣음으로서(파라미터로) => "의존주입"이라함 결합도를 확 떨굼!
    // public void watchTv(Tv tv) {
    private Tv tv;
    // 일반적으로는 이렇게 사용 가독성을 위해

    // DI = 의존 주입 (생성자 주입)이 가능하게 하는 코드!=>생성 당시에만 주입!=>여기선 생성자 주입 사용(일반적으로는 생성자 주입이나 세터주입 둘 중 하나 사용)
    // 이제부터는 뭐 apple tv던, 무슨 tv던 user는 관심갖지 않는다는 뜻! 뭐가 주입되든 나는 실행하는것만 신경쓰겠다는 뜻!
    public User(Tv tv) {
        this.tv = tv;
    }
    // // DI = 의존 주입(세터 주입) => 중간중간에 바뀔 가능성이 있음
    // public void setTv(Tv tv) {
    //     this.tv = tv;
    // }
    // beans => instance의 별칭!
    public void watchTv() {
        System.out.println("사용자의 티비 시청 시작!");
        // Tv tv = new SamsungTv();
        // <6> 다형성을 이용하여 제조사 상관없이 동일하게 작동하도록 interface와 엮어서 구현
        // SamgsungTv()로 교체되면 바로 실행 가능 (모듈 교체) => 교체해보고 실행해보면 삼성 코드가 실행됨. (교체식 프로그래밍 기법)
        // 그치만 이 코드는 삼성이나 엘지티비에 아직까지 의존하고 있음.(아직 결합도가 높음)
        // => 그러기 위해서는 user가 인스턴스를 생성하면 안됨(lg나 삼성 둘중 하나의 인스턴스일테니)
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
        System.out.println("사용자의 티비 시청 끝!"); 
    }
}
