public class P10 {
    public static void main(String[] args) {
        // 소수 판별 문제
        // 2부터 100 사이의 소수를 출력하시오.

        for(int number = 2; number <= 100; number++) {

            boolean isPrime = true;
            for(int x = 2; x < number; x++) {
                if(number%x == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                System.out.print(number + " ");
            }
    }
}
}