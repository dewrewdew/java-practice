public class P4 {
    public static void main(String[] args) {
        // 이중 배열 (사실 n중 배열 다 가능)
        // 배열은 보통 반복문과 연결이 됨 => 이중 배열은 이중 반복문과 보통 연결됨!

        int[][] arr = new int[3][4]; //=>마지막 칸은 arr[2][3]! 왜냐면 0부터 시작하니까!n-1!
        // 여기서 메모리는 총 몇개 차지? 원래는 int[]arr = new int[3] 하면 stack에 arr 1개, heap에 3칸이라 총 4개지만
        // []은 접근연산자!=> [][]은 총 2번 접근하겠다는 것. but, 사실은 메모리에서는 전부 한줄로 관리함 따라서 메모리입장에서는 행열이 아닌 4칸짜리 네모 3개!

        arr[0][0] = 50; // 행 x 열!
        arr[1][2] = 70;

        arr[0] = new int[2]; // => 이렇게 되면 네칸짜리 세개 중 한줄이 2칸짜리로 대체됨!

        //for(int x = 0 ; x < 3 ; x++) 이렇게 쓰려면 배열의 크기가 모두 동일해야함 2칸짜리에서 exception 발생!
        for(int x = 0 ; x < arr.length ; x++)
            for(int y = 0 ; y < arr[x].length ; y++) { // arr[x]로 먼저 접근을 해서! 거기의 길이를 알아야함!!
                arr[x][y] = 30;
            }
        }



    }
