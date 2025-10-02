public class P9 {
    public static void main(String[] args) {
        // 선택 정렬 => 전체 훑고 가장 작은 수 찾아서 맨 앞으로 옮기기
        int[] arr = {3, 1, 5, 9, 8, 6, 2, 7, 4};


        for(int x = 0; x < arr.length - 1; x++) {
            int minIndex = x; // 변수 초기화
            for(int y = x + 1; y < arr.length; y++) {
                if(arr[minIndex] < arr[y]) {
                    minIndex = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[minIndex];
            arr[minIndex] = temp;

        } 

        for(int e : arr) {
            System.out.println(e);
        }
    }
}
