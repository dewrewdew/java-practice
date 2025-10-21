package polymorphism;
// <8> 인스턴스 생성 관리, 조립 - 다른 기능 없음
// 설정에 해당하는 클래스 => 프레임 워크에 따라 추후 xml, json, 어노테이션 설정 가능
// beans는 인스턴스의 별칭!
public class BeansContainer {
    // public Tv getTv(String name) {
    //     if(name.equals("samsung")) {
    //         return new SamsungTv();
    //     } else if(name.equals("lg")) {
    //         return new LgTv();
    //     }
    //     return null;
    // }
    // 위 내용이 팩토리 예시 => 팩토리는 쓰고 버리려는 성향이 강함!
    private User user;
    public BeansContainer() {
        // 생성 및 조립 설정
        Tv tv = new SamsungTv();
        user = new User(tv); //DI => 생성자 주입이 가능하게 하는 코드
    }

    public User getUser() {
        return user;
    }
    

    

}
