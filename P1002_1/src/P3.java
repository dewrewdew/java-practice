public class P3 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        //arr1 = null; // 참조 타입이 메모리 주소를 지정하는 역할이지만 int값 넣어서 직접 지정할 수는 없음(문법적으로 불가) ex) arr1 = 0; 불가능
                     // null = 참조할 것이 없다는 의미의 값 & 모든 참조 타입에는 null값은 대입할 수는 있다!->참조 타입이 어디상 어디를 가리키지 않음
        int[] arr2 = new int[5];
        arr1[0] = 30;
        arr2[0] = 40;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

    }
}
