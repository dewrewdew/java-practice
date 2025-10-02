public class P1 {
    public static void main(String[] args) {
        // 변수 : RAM에 저장되는 메모리
        // 변수의 큰 구분 : 기본 타입, 참조 타입
        // 기본 타입 : 실제로는 8가지지만 사실상 4가지 (정수, 실수, 문자(정수), 논리)
        // 정수 : byte, short, int, long
        // 실수 : float, double
        // 문자(정수) : char
        // 논리 : boolean -> true or false만 입력 가능.
        
        // 프로모션, 캐스팅 - 은근 중요!!(Class 들어가면 엄청 중요!!!)

        // 메모리 ..

         int a = 10;
         int b = 20;
         int c = 50;
        // 변수 중복 선언 불가 int c = 20;


        c = 100; // <- 변수 선언 문법 아님!

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
