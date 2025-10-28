package p5;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        // Set계열

        set.add(10);
        set.add(20);
        set.add(1);
        set.add(5);
        set.add(15);
        set.add(7);
        set.add(8);
    }
    // 이진트리구조 장점: 탐색 속도가 진짜 빠름 => 기하급수적으로 빠름
    // 양쪽으로 입력값이 그 값보다 크냐 작냐만 비교(만약 기존 값과 동일, 즉 큰지 작은지 판단 불가할 경우 튕겨나감)
    // 동일한 값도 저장하는 로직도 존지함!
    // 단점 : 입력된 순서를 알 수 없다. => 순서가 있다면 무조건 배열!
    // => 삭제할때가 최악 => 값을 삭제할때마다 트리를 재구성 해야 함!
}   
