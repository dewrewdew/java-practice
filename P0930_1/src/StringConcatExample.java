public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int value  = 10 + 2 + 8;
        System.out.println(value);

        // 문자열 결합 연산
        String str1= 10 + 2 + "8";
        System.out.println(str1);

        String str2 = 10 + "2" + 8;
        System.out.println(str2);

        String str3 = "10" + 2 + 8;
        System.out.println(str3);

        String str4 = "10" + (2 + 8);
        System.out.println(str4);


        char test1 = 'a';
        char test2 = '1';
        System.out.println(test1);
        System.out.println(test2);
        
    }
}
