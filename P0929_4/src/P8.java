public class P8 {
    public static void main(String[] args) {
        // 타입 미스매치 -> 프로모션, 캐스팅
      

        byte a = 10;
        int b = 20;
        boolean c = true;

        a = b; // 문법 오류
        a = (byte)b; 
        // 캐스팅(명시적 형변환 Explicit Type Conversion) -> 억지로 형 변환하여 들어갈 수 있다고 개발자가 확신할 때만 사용 가능!!
        // 억지로 작은데로 넣기 때문에 데이터가 잘릴 가능성 높음 지양하는 방법.

        b = a; // 타입은 다르지만 프로모션 발생 (묵시적 형변환 Implicit Type Conversion)


        double v1 = 10.0; // double v1 = 10 -> 묵시적 형변환 발생(정수->실수) 10.0이 형 변환이 없어 깔끔!
        int v2 = (int)30.0;
        
        v1 = v2;
        v2 = v1;

        // -> 쉽게 말해 타입이 다르다면 한 쪽이 더 클 것이므로, 단방향으로만 프로모션이 가능할 것.

        float f1 = 10.0f;
        long f2 = 9012830183838L;
        f1 = f2;
        f2 = (long)f1;

        //

        int t1 = 65;
        char t2 = 65;
        char t3 = '안';

        System.out.println(t1);
        System.out.println(t2); // 대응되는 알파벳으로 출력
        System.out.println((int)t3); // 숫자로 출력



    }
}
