public class P8 {
    public static void main(String[] args) {
        {// double로 연산하면 안되는 이유 (귀찮지만 적당히는 해도 됨)=> 값의 정확도가 떨어져서 사용 지양함.
        int apple = 1;
        double piece = 0.1;
        int count = 7;
        double result = apple - (piece * count);
        System.out.println(result);
        }


        // 세밀한 계산 시 double은 최소화
        int weight = 10;
        int apple = 1 * weight;
        int piece = (int)(0.1 * weight);
        int count = 7;
        int result = apple - (piece * count);
        double result2 = result/(double)weight;

        // 계산은 편하고 정확하게 int로 다 하고나서 마지막에 double로 변환하여 소수점까지 출력한다.


    }
}
