public class P1 {
    public static void main(String[] args) {
        // break, continue
        // 1~10 자연수 중 3의 배수는 제외하고 더했을 때 어떤 숫자를 더해야 500이 넘는가?

        int sum = 0;

        for (int i = 1 ; true ; i++) {
            if(i%3 == 0){
                continue;
            }

            sum += i;

            if (sum > 30) {
                break;

            }
        }
        System.out.println(sum);

       
    }

}