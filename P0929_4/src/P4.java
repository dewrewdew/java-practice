public class P4 {
    public static void main(String[] args) {
    // 기본 타입(primitive type) 종류
    // 정수 : byte, short, int, long
    // 동일한 변수명을 type만 다르게 별도로 선언할 수 없음
    // 프로그래밍 최소 단위는 byte, 데이터의 최소 단위는 bit
    // 실질적으로는 기본적으로 int 사용! 20억 이상의 값을 다룰 때는 long 사용
    // 이유는 연산의 기본 단위가 int라서
    
    byte a = 10; // 8bit = 1byte 경우의 수 : 256
    short b = 10; // 16bit = 2byte 경우의 수 : 65536
    int c = 10; // 32bit = 4byte 경우의 수 : 약 40억
    long d = 10; // 64bit = 8byte 경우의 수 : 한정되어있긴 하지만 매우 크다

    // 정수 리터럴 : 정수를 표현하는 문법적 방식
    int e = 10;
    e = 0xFF;
    
    long f = 1000;

    }
}
