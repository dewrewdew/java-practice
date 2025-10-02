public class P2 {
    public static void main(String[] args) {
        

        // 주석!!!(컴파일 시 제외됨(실행할 때 제외되는게 x))
        // 주석 요즘은 여러줄 쓰지 X
        // 오류 3가지
        // 1. 문법 오류 : 컴파일 불가능
        // 2. 런타임 오류 : 문법 오류는 없지만 (컴파일 가능), 실행시에 Exception 발생
        // ex) int result = a/0;
        // 3. 버그
       
        int score = 95;
        if(score >= 90) {
            System.out.println("90점 이상입니다.");

        } else {
            System.out.println("90점 미만입니다.");

        }


    }
}
