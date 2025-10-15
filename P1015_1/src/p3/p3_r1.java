package p3;


// {} p3 설명 제외 후 코드만 정리


import java.util.Scanner;

public class p3_r1 {
    public static void main(String[] args) {
        
        IoManager ioManager = new IoManager();
        Calculator calculator1 = new Calculator();

        String value = ioManager.input("값 입력 > ");
        ioManager.output("입력한 값 : " + value);

        Calculator calculator2 = new Calculator();
        int result = calculator2.sum(1, 10);
        System.out.println(result);

        int inputStart = 77;
        int inputEnd = 1500;
        result = calculator2.sum(inputStart, inputEnd);
        System.out.println(result);



    }
}


class IoManager {

    Scanner scanner = new Scanner(System.in);

    String input(String text) {

        String inputValue = scanner.nextLine();
        return inputValue;
    }

    void output(String text) {
        System.out.println(text);
    }
}


class Calculator{
    int sum = 0;
    int sum(int start, int end) {

        for(int i = start ; i <= end ; i++) {
            sum = this.accumulate(sum, i);
        }
        return sum;
        }

    int accumulate(int sum, int i) {
        sum += i;
        return sum;
    }
}


