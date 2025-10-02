public class P11 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[101];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = true;

        }

    for(int number = 2; number < arr.length; number++) {
        if(arr[number]) {
            System.out.print(number + " ");
            for(int i = number * 2; i < arr.length; i += number){
                arr[i] = false;

            }
        }
    }
    }
}
// 추석 숙제 : https://blog.naver.com/s001lec

