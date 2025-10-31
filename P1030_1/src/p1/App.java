package p1;
import java.util.*;


public class App {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        // 순서가 없고, 키가 꼭 있어야하는것빼곤 다 장점 => 어떤 데이터가 먼저 입력된건지 알 수 없음
        map.put("안녕", 3);
        map.put("반갑", null);
        // 어떤 경우에서도 잘 쓸 수 있는게 중요 => 어떤경우에 어떤걸 써야하는지 바로 판단이 가능해야 함(생각을 거치지않고 바로 판단이 돼야 함)
    }


    // List vs Set vs Map


    // List 순서 O ex) LinkedList(접근 느림, 중간 삽입 빠름, queue(제일중요)) => 단점 : get , ArrayList(접근 빠름, 중간 삽입 느림, stack)
    // Set 순서 X, 탐색이 엄청 빠름 ex) 트리, 해시에서 사용
    // Map 순서 X, 키와 값을 쌍으로 넣어야 함(키가 곧 배열의 인덱스),사실상 단점이 거의 없음(탐색은 list, map둘다 느림), ex)hash map (키는 중복 불가)
    // 보통은 서로 섞어서 사용!
    // 이걸 기준으로 자료구조 공부할 것 ! 물론 개발할줄아는게 기본!
}