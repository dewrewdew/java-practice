package p9;

public class App {
    public static void main(String[] args) {
        new Test().test();
    }
}

class Test{
    public void test() {
        try {
            new SumCalculator().sum(0, 19);
        // => 아래 클래스에서 throws했으므로 그 다음에 처음으로 받는 클라스에서 해결을 필수로 해야함!!!
        // 이런경우 unhandled exception이라고 뜸!
        // 이거 해결하려면 try catch문 사용하면 됨!
        } catch (Exception e) {

        }

    }
}
class SumCalculator {
    public int sum(int a, int b) throws SumCalculatorException {
        if(b < a) {
            try {
            throw new SumCalculatorException();
            // checked exception(자바에만 존재하는 문법) => 너 이거 checked exception인데 왜 try catch문 안썼어? 오류값은 이 뜻!
            // runtimeException(언체크드 익셉션)을 상속받으면 오류값 안뜸!
            // exception(체크드 익셉션)은 문제 없음 => 일단이거 두가지는 외우기
            // throw를 하게되면 무조건 try catch문을 써야함!! => sum(int a, int b) 옆에 throws로 수정해줌!
            // throws SumCalculatorException => 나는 몰라 다음사람한테 토스하겠다 이 뜻!
            // unchecked exception => try catch문은 선택사항
            // checked exception => try catch문은 필수
            } catch(SumCalculatorException e) {

            }
        }
        int sum = 0;
        for(int i = a ; i <= b ; i++) {
            sum += i;
        }
        return sum;
    }
}
class SumCalculatorException extends Exception {}