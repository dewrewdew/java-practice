public class P7 {
    public static void main(String[] args) {
        // 정렬

        int[] arr = {3, 8, 9, 5, 6, 7};

        for(int x = 0 ; x < arr.length - 1 ; x++) {
            for(int y = 0 ; y < arr.length - x - 1; y++) {
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

