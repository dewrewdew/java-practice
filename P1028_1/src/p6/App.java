package p6;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        // 로또 번호 생성하기
        while(list.size() < 6) {
            int value = (int) (Math.random()*45) + 1;
        

            if(list.contains(value)) {
                list.add(value);
            }
        }

        for(int value : list) {
            System.out.print(value + " ");
        }
    }
}
// 배열은 탐색속도 O가 n 즉 O(n) 찾는 데이터가 없으면 n만큼 다 돌아야됨
