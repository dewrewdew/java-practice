package p7;
// 람다식 사용 예시 3 => 람다식은 진짜 극한으로 간결한게 필요할때만 사용!
public class App {
    // public static void main(String[] args) {
    //     QQQ qqq1 = (a) -> {
    //         return Math.sqrt(a);
    //     }; // 요게 기본 코드
        // 여기있는 세미콜론 잊지 말자! 람다식 실행문의 ;이니까!
        // return값이 있는 케이스는 return도 무조건 빼야 함!

        public static void main(String[] args) {
        // QQQ qqq1 = a -> Math.sqrt(a);
        // '->' 화살표의 의미 : a를 Math.sqrt(a).로 바꿔준다!
        // 아래처럼 더 줄이기 가능!
        QQQ calculateSqrt = Math::sqrt;
        QQQ calculateLog = Math::log;


        double result = calculateSqrt.calculate(10);
        double resultLog = calculateLog.calculate(59);
    }
}

interface QQQ {
    public double calculate(int a);
} // 리턴타입 1개 파라미터 1개 => 실무에서 가장 많이 사용되는 경우!!!