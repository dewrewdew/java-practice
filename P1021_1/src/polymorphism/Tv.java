package polymorphism;
// <4> 원래는 interface 먼저 설정 -> interface가 없을때의 단점을 설명하기위해 다른것부터 구현해본것!
// interface 즉, 표준만 잘 정의되어있으면 모듈만 뜯어내서 조립 가능하다!
// interface는 abstract 생략되어 있음!
public interface Tv {
    public void powerOn();
    public void powerOff();
    public void volumeUp();
    public void volumeDown();
}
