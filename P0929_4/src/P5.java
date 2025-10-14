public class P5 {
    public static void main(String[] args) {
        // 실수 타입 : float, double(실제 사용)
        // 사실상 연산을 위해서라면, int나 long으로 변환해서 연산.

        double a = 10.3; // 64bit = 8byte (연산의 기본 단위) -> float보다 조금 더 정밀한 값 담을 수 있음. 그래도 얘도 근삿값.
        float b = 10.3f; // 32bit = 4byte *f를 꼭 써줘야 함! -> double에 비해 조금 더 큰 값을 담을 수 있음 but, 근삿값

        double c = 0.123456789;
        float d = 0.123456789f;

        System.out.println(c);
        System.out.println(d);

        // 실수 리터럴
        double e = 0.0000000000000000003;

        e = 3e-27;



        
    }
}
