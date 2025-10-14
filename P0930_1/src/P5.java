public class P5 {
    public static void main(String[] args) {
        {// 산술 연산자
        int a = 10;
        int b = a + 10;
        int c = a + b;
        
        // int + int + int 연산 가능

        byte v1 = 10 + 20;
        byte v2 = 30;
        byte v3 = v1 + v2;

        // byte + byte + byte 연산 불가능 => byte + byte는 결과값이 자동으로 int로 변경이 됨.
        // byte로 출력하고 싶다? 이럴 때 쓰는게 casting!!
        // byte v3 = (byte)v1 + (byte)v2 -> 기존 v1 + v2과 다를 바 없음
        // -> byte v3 = (byte)(v1 + v2);로 사용!
        }

        {
            int a = 10;
            double b = 20.0;
            // int c = a + b; int를 double로 바꿔서 double c로 받거나 => double c = a + b;
            // int로 바꿔서 연산되도록 캐스팅하거나 int c = (int)(a + b);
        }

        {
            int a = 10;
            double b = a / 3;
            System.out.println(b);
            // int / int => 피연산자가 둘 다 int면 정수로 나누기를 함(결과도 정수) => 위 코드에서 결과가 3이 됨.
            // int / double => 한쪽이라도 double이 되면 자동으로 int를 double로 자동 전환함 => 결과 3.3333..

        }

    }
}
