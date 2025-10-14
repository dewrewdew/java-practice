public class P1 {
    public static void main(String[] args) {
        int[] arr1 = null;

        {
            int[] arr2 = new int[5];
            arr2[0] = 30;
            arr1 = arr2;
            // 원래는 scope가 끝났다 치면 arr2가 사라짐 근데 arr1이 arr2와 같은 참조를 나타내므로 garbage로 인식하지 x
            // 따라서 heap에서 arr2가 참조했던(이제는 arr1이 참조하는) 배열은 사라지지x

            arr1 = null;
            // scope를 빠져나가지 않고 heap 영역의 배열을 삭제하는 방법은 이렇게 arr1이 더이상 그 배열을 가리키지 않게해서 그 heap에 있는 배열을 garbage로 만들면 됨.
            



        }
    }
}
