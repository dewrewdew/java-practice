public class P7 {
    public static void main(String[] args) {
        // 문자열 연산 : +

        String a = "안녕하세요.";
        String b = "반갑습니다.";
        String c = a + b;

        System.out.println(c);

        int v1 = 10;
        int v2 = 30;
        String v3 = "야호";

        System.out.println(v3 + v2 + v1);

        // 숫자 + 문자 => 문자를 따라감 (보이기엔 숫자같지만 형태만 숫자고 사실 문자로 변형된 것.)
        // 문자를 숫자로 바꾸는 형변환 자체가 없음!! 불가!
        // v1 + v2 + v3 과 v3 + v2 + v1의 결과는 다름!! 순서대로 계산해야함 주의!!



    }
}
