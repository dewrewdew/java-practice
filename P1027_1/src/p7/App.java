package p7;
// throw
public class App {
    public static void main(String[] args) {
        int result = 0;
        try {
        result = new SumCalculator().sum(10, -20);
        } catch ( Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        System.out.println("프로그램 종료");
    }
}

class SumCalculator {
    // public int sum(int a, int b) {
    //     int sum = 0;
    //     for(int i = a ; i <= b ; i++) {
    //         sum += i;
    //     }
    //     return sum;
    //     // 만약 sum(10, -20)을 하면? 의미가 이상해짐 return을 어떻게 해야해;; 이런 느낌
    //     // 즉, 더이상 코드를 실행하는것 자체가 문제다? exception을 발생시켜버림!!
    // }
    public int sum(int a, int b) {
        if( b < a) {
            throw new RuntimeException("b는 a보다 클 수 없다.");
        }
        int sum = 0;
        for(int i = a ; i <= b ; i++) {
            sum += i;
        }
        return sum;
    }
    // API 설계자는 exception 값만 return해줄거! app 개발자는 이 exception을 직접 처리 해야 함!
}