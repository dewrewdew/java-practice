package polymorphism;
// <3> 인터페이스 설정 없이 설계 시작 => 어떤 문제가 생기는지 확인해볼 것!
// 삼성티비 기능을 lgtv로 바꿔버리고 싶어 => 코드의 의존도가 높으면 모듈만 바꿔치기가 불가능!!
// public class LgTv {
//     public void turnOn() {
//         System.out.println("엘지티비 전원을 켠다.");
//     }
//     public void turnOff() {
//         System.out.println("엘지티비 전원을 끈다.");
//     }
//     public void soundUp() {
//         System.out.println("엘지티비 소리를 올린다.");
//     }
//     public void soundDown() {
//         System.out.println("엘지티비 소리를 내린다.");
//     }
// }

public class LgTv implements Tv {
    private Speaker speaker;
    // <5> 이제 interface가 왜 필요한 지 알았으니 전부 변경하기!!
    public LgTv(Speaker speaker) {
        this.speaker = speaker;
    }
    public void powerOn() {
        System.out.println("엘지티비 전원을 켠다.");
    }
    public void powerOff() {
        System.out.println("엘지티비 전원을 끈다.");
    }
    public void volumeUp() {
        speaker.soundUp();
    }
    public void volumeDown() {
        speaker.soundDown();
    }
}
