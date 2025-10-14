public class P3 {
    public static void main(String[] args) { // java는 type만 같으면 거의 다 됨!!! 고로 type을 엄청 신경써야 함!!!
        int count = 10;
        int[] arr = new int[count];

        for(int i = 0 ; i < arr.length ; i++) { // arr.length는 배열의 크기!
            arr[i] = (int)(Math.random()*6) + 1;
        }
    }
}
