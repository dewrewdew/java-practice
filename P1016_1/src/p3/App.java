package p3;

public class App {
    public static void main(String[] args) {
        // 클래스 설계 원칙
        // 캡슐화 (정보의 은닉), 응집도를 높인다.
        System.out.println("안녕하세요");

        // SOLID
        // SRP - 단일 책임 원칙
        // 하나의 클래스느 하나의 역할만 해야하고, 하나의 메서드는 하나의 기능만 해야한다.
        // 하나의 메서드는 3줄 이상이면 의심해야 한다.

        // 보통 일단 구현 후 설계
    }
}



class SumCalculator {
    // 추상화 레벨에 맞는 역할끼리! => 당연히 추상화 레벨이 높을수록 더 많은 내용이 포함될 것.

    public void showResult() {
        int result = calculate();
        printResult(result);
    }

    public int calculate() {
        int sum = 0;
        for(int i = 0 ; i <= 10; i++) {
            if(isMultipleOfThree(i)) {
            sum = accumulate(sum, i);
            }
        }
        return sum;
        // System.out.println(sum); => 딱봐도 sumcalculator에 포함할 내용은 아님 => 분리!
    }

    private int accumulate(int sum, int i) {
        return sum += i;
    }

    private void printResult(int result) {
        System.out.println("결과: " + result);
    }


    private boolean isMultipleOfThree(int number) {
        return number % 3 ==0;
    }

}