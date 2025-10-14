public class P10 {
    public static void main(String[] args) {
        // 논리 연산자 && || ! => 연산자 우선순위 최하위

        // 피연산자는 boolean, 결과도 boolean

        int a = 10;
        int b = 20;

        boolean r1 = a > 5 && b < 15; // and, ~이고, 논리 곱// a && b 사용 불가 (연산 대상이 int)
        boolean r2 = a > 5 || b > 5; // or, ~이거나, 논리 합
        boolean r4 = a < 30 && b < 15; // && 연산자에서 왼쪽이 false면 오른쪽 실행도 안함 바로 false 출력
        boolean r5 = a > 5 || b < 15; // || 연산자에서 왼쪽이 true면 오른쪽 실행도 안함 바로 true 출력


        // !
        boolean r3 = !(a > 5) || b > 5;
        System.out.println(r3);
        



    }
}
