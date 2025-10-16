
// 문제를 클래스로 풀어보는 연습 필수!!!


package p5;

import java.util.*;

public class atcodeQ1 {
    public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final int c = scanner.nextInt();
    final int d = scanner.nextInt();
    final int e = scanner.nextInt();
    final int f = scanner.nextInt();
    final int x = scanner.nextInt();
    final Runner takahashi = new Runner(b, a, c); // 값이 바뀔일이 없을경우 final 사실 대부분이 final 생략하는 것 뿐!
    final Runner aoki = new Runner(e, d, f);

    Stadium stadium = new Stadium(x, takahashi, aoki);
    stadium.simulate();
    scanner.close();

    }
}



class Stadium {
    private int totalRunningTime;
    private Runner takahashi;
    private Runner aoki;

    public Stadium(int totalRunningTime, Runner takahashi, Runner aoki){
        this.totalRunningTime = totalRunningTime;
        this.takahashi = takahashi;
        this.aoki = aoki;


    }

    public void simulate() {
        for(int i = 0 ; i < totalRunningTime ; i++) {
            takahashi.process();
            aoki.process();
        }

        if(takahashi.getDistance() == aoki.getDistance()) {
            System.out.println("draw");
        }   else if(takahashi.getDistance() > aoki.getDistance()) {
           System.out.println("takahashi");
        }   else {System.out.println("aoki");
        }
        }
    }



class Runner {
    private final int speed;
    private final int workTime;
    private final int restTime;

    private int distance = 0;
    private int currentRuntime = 0;
    private int currentResttime = 0;
    private boolean isRest = false;


    public Runner(final int speed, final int workTime, final int restTime) {
        this.speed = speed;
        this.workTime = workTime;
        this.restTime = restTime;
    
        

    }
    final public int getDistance() {
        return distance;
        }
        final public void process() {
        if(isRest) {
            rest();
        } else {
            run();
        }
        run();
        rest();
        }

        private void run() {
        distance += speed;
        currentRuntime++;
        if(currentRuntime == workTime) {
            isRest = true;
            currentRuntime = 0;
        }
        }

        private void rest() {
        currentResttime++;
        if(currentResttime == restTime) {
            isRest = false;
            currentResttime = 0;
        }
        }
}
