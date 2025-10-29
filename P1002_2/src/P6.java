public class P6 {
    public static void main(String[] args) {
        //정렬(버블정렬 : 맨 왼쪽부터 2개씩 값 비교 후 위치 교환)
        int[] arr = {7, 8, 9, 1, 3, 4, 5, 6, 2};

        for(int x = 0 ; x < arr.length -1 ; x++) { // 버블정렬 1회만 하면 가장 큰 수만 맨 오른쪽으로 가고 끝남 => 전체정렬하려면 몇번 돌아야하는가!
            for(int y = 0 ; y < arr.length - x -1 ; y++) { // x가 만약 3번 돌았으면 남은 숫자 총 6개 그럼 y는 5번째 숫자까지만 보면 됨

            // arr.length  - 1 만 해도 당연히 잘 돌아감! 효율이 떨어질뿐(이미 정렬한건 다시 정렬할 필요가 없기 때문)
                if(arr[y] > arr[y+1]) {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
        for(int e : arr) {
            System.out.println(e);
        }
    }
}
