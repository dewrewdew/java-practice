package p4;

public class App {
    public static void main(String[] main) {
        SumCalc1 sc1 = new SumCalc1(); // new SumCalc1();만 선언하고 변수에 안넣고 끝내면 가리키는 변수가 없으니 생성하자마자 gc가 수거해감
        int result1 = sc1.sum(1, 10); // 다회용 (메서드로 구현)

        int result2 = new SumCalc2(1, 10).getResult();// 왼쪽코드는 보통 한번만 사용하고 끝내는경우에 사용 / SumCalc2 sc2 = new SumCalc2(1, 10); => 다회용

    }
}


class SumCalc1{
    int sum(int s, int e) {
        int sum = 0;
        for(int i = s ; i <= e ; i++) {
            sum += i;
        }
        return sum;
    }
}

class SumCalc2 {
    int sum = 0;
    int start = 0;
    int end = 0;
    
    SumCalc2(int start, int end) {
        for(int i = start ; i <= end ; i++) {
            sum += i;
        }
    }

    int getResult() {
        return sum;
    }

}