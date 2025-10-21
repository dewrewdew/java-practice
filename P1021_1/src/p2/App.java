package p2;

public class App {
    public static void main(String[] args) {
        // 자바 문법의 interface : 클래스간 상호작용을 위한 표준 정의 => class 정의보다 앞서 정이되어야 함.
        // class 설계자랑 main코드 설계자 두명이서 일한다 치면 class먼저정의해야되면 main은 일을 시작을 못함
        // 그래서 interface를 먼저 정의하고 둘 다 시작하자 함!
        // 입출력 담당 코드

        int valueA = 40;
        int valueB = 70;
        Calculator calculator = new CalculatorMock();
        // 다형성
        int result = calculator.sum(valueA, valueB);
        System.out.println(result);

        // 일단 mock up 으로 만든걸로 사용하고 class 부분의 설계자가 전부 완성하면 모듈만 교체하면 됨! mock up만 다른걸로 바꿔버리기!
        // mock up => CalculatorImpl로 모듈만 바꿔버리면 됨 이게 조립식 설계! 레고 생각하기!!한 부분을 떼어내서 다른데다 통으로 붙여넣어도 정삭 작동!
        // 런타임시에는 = 기준 오른쪽 즉, 인스턴스부분을 참조하므로 끼워넣기가 가능함!


    }
}

interface Calculator {
    public int sum(int a, int b);
}
// 이렇게 interface를 먼저 선언하면 main부분 class부분 둘 다 동시에 작업 시작 가능!

class CalculatorMock implements Calculator {
    public int sum(int a, int b) {
        return 70;
    }
}
// mock up 으로 가짜 틀도 작성해버림!

class CalculatorImpl implements Calculator {
    public int sum(int a, int b) {
        int sum = 0;
        for(int i = 0 ; i <= b ; i++) {
            sum += i;
        }
        return sum;
    }
}