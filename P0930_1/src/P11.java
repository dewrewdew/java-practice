public class P11 {
    public static void main(String[] args) {
        // 비트연산자
        // 메모리, 연산 최적화
        // 최적화 진행 시 C언어 선택하는게 나음
        // 현재 메모리가 부족한 시대가 아님.

        // 비트연산자 : & | ^ ~ >> >>> <<

        int a = 0b00110101;
        int b = 0b00001111;
        //////////00000101 -> 5 (&)
        //////////00111111 -> 63 (|)
        //////////00111010 -> 논리적 배타 합 (^) 달라야 1 같으면 0
        //////////11110000 -> 비트 반전(~) 0과 1 바꿔쓰기 -> ~b
        //////////00000011 -> 비트 오른쪽으로 2개 밀기 int r1 = b >> 2;
        int r1 = a ^ b;

        System.out.println(r1);

        //아래는 한 사람에 대한 정보 -> 둘중 하나 고르는 문항 3개 -> 즉, 3bit만으로도 기재가능한걸 3byte로 기재해서 용량을 과도하게 사용함.
        // 현재는 용량이 커서 문제되지 x
        boolean isman = true;
        boolean adult = true;
        boolean student = true;

        
        int isMan =     0b00000001; //남자
        int isAdult =   0b00000010; //성인
        int isStudent = 0b00000100; //학생

        int person2 = 0;
        person2 = person1 | isMan;
        person2 = person1 | isStudent;

            // 이미지...
            // FHD = 1920 * 1080
            // 24bit
            int pixel1 = 0xFF0000;
            
    }
}
