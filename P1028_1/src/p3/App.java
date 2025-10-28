package p3;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Queue<OrderDto> queue = new LinkedList<>();
        // LinkedList가 Queue를 상속받았음을 의미!
        queue.offer(new OrderDto("햄버거"));
        queue.offer(new OrderDto("피자"));
        queue.offer(new OrderDto("치킨"));


        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
    // queue에서는 보통 offer, add, poll을 주로 사용!
    // 원형 queue는 잘 사용 안함 => LinkedList 사용
}



class OrderDto {
    String name;
    OrderDto(String name) {
        this.name = name;
    }
}


    // Deque(덱)은 양쪽이 다 뚫려있고 양쪽에서 입출력이 다 됨
