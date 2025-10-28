package p10;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // 자료구조 : Collection Framework
        // map과 list를 다루지 못하면 프로그래밍 자체가 불가
        List<String> list = new ArrayList<>();
        // 왼쪽 오른쪽 타입이 서로 다르네??
        // list는 인터페이스 arraylist는 list를 상속받아서 구현한 것 => 다형성
        list.add("한조1");
        list.add("한조2");
        list.add("한조3");
        list.add("한조4");

        System.out.println(list.size());
        
        for(String e : list) {
            System.out.println(e);
        }
        // API는 이게 전부! 나중에는 자료가 복잡해져서 어려워질 것 확실히 알아두기!!
        // 2주 걸릴수도있음 익숙해지는데(api사용법말고 복잡한 자료구조 때문에)

        Map<String, Object> map = new HashMap<>();
        // 이것도 다형성!
        map.put("이름", "한조");
        map.put("나이", 30);
        map.put("점수", 99);
        System.out.println(map.get("이름") + " : " + map.get("점수"));
        // 실무에서는 자유로운 map을 더 선호함(사실상 Dto와 동일)
    }
}
