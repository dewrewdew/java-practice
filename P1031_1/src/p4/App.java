package p4;
// 시간 측정하는 문법
public class App {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        long sum = 0;
        for(int i = 0 ; i <= 1000000 ; i++) {
            sum += i ;
        }

        System.out.println(sum);
        System.out.println("총 시간 : " + (System.currentTimeMillis() - time) + "ms");
    }
}
