package polymorphism;
// <0> 기능 설정 (단, 삼성과 엘지 설계자가 다르다는 가정하에 진행)
// => interface를 정의하기전에 먼저 정의해버림 => 결합도가 너무 높아짐
// public class SamsungTv {
//     public void powerOn() {
//         System.out.println("삼성 티비 전원을 켠다.");
//     }
//     public void powerOff() {
//         System.out.println("삼성 티비 전원을 끈다.");
//     }
//     public void volumeUp() {
//         System.out.println("삼성 티비 볼륨을 올린다.");
//     }
//     public void volumeDown() {
//         System.out.println("삼성 티비 볼륨을 내린다.");
//     }
// }

// <6> 여기도 interface랑 엮어주기!
public class SamsungTv implements Tv {
    public void powerOn() {
        System.out.println("삼성 티비 전원을 켠다.");
    }
    public void powerOff() {
        System.out.println("삼성 티비 전원을 끈다.");
    }
    public void volumeUp() {
        System.out.println("삼성 티비 볼륨을 올린다.");
    }
    public void volumeDown() {
        System.out.println("삼성 티비 볼륨을 내린다.");
    }
}
