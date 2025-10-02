public class P6 {
    public static void main(String[] args) {
        {
            // 산술 연산자
        int a = 5;
        int b = 2;
        int c = a / b;

        System.out.println(c);

        // 나누기는 피연산자의 타입에 따라 정수 혹은 실수 나누기를 한다.
        }
        {
        // 나머지 % 특징 : 분모가 특정 숫자면(5) 결과는 특정 숫자만큼 한정됨(0~4)
        int a = 7;
        int b = 4;
        int c = a % b;
        System.out.println(c);

        }
        {
            // 정수는 0으로 나눌 수 없다.
            // int a = 10/0; //exception
            // NaN => Not a Number : 숫자가 아님

            double a = 0.0/ 0.0;
            System.out.println(a);
        }
        {
            // 단축 배정 연산자, 증감 연산자 : 대부분은 산술
            // Line 33~35 전부 동일한 결과
            int a = 10;
            a = a + 1;
            a += 1;
            a++; // ++는 무조건 1만 증가시킴
            a--; // --는 무조건 1만 감소시킴

            int b = 10;
            b = b + 3;
            b += 3;


            int c = 10;
            c = c - 7;
            c -= 7;

            int d = 10;
            d = d * 3;
            d *= 3;

            int f = 3;
            f++;
            ++f;

            int r1 = 7 + f++ + ++f;
            // ++f는 먼저 계산, f++은 그 식이 끝나고 계산됨.
            // f가 5라면 결과 : 7 + 6 + 6
            System.out.println(r1);
            System.out.println(f);
        }
}
}
