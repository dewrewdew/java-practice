package p2;
import java.util.*;
// java.language와 java.util 두개가 제일 중요

public class App {
    public static void main(String[] args) {
        List<StudentDto> list = new LinkedList<>();
        // new 옆에 LinkedList, vector, ArrayList(얘는 내부가 그대로 배열!)를 넣어도 (셋 다 구현체) 전부 결과가 같음 => 리스코프의 치환원칙
        // 그럼 각자 뭐가 다를까? add 알고리즘이 다르다! (적용하는 구현체와 해당 상황에 따라 퍼포먼스가 다르게 나타남)

        list.add(new StudentDto("한조1"));
        list.add(new StudentDto("한조2"));
        list.add(new StudentDto("한조3"));
        list.add(new StudentDto("한조4")); // 추가 => 공간이 있다는 가정 하에 배열에서 전혀 문제 발생 x
        list.add(2, new StudentDto("끼워넣기")); // 삽입 => 배열에서는 문제 발생(밀어넣어야되는 과정이 추가됨) => ArrayList(배열 기반)사용 시 주의!!!!
        // 삽입이 자주 일어나면 LinkedList쓰는게 최적의 선택! (그러나 LinkedList의 최대 단점은 "접근" => 이것도 맨앞/맨뒤면 문제x 중간에있는게 문제)
        // 배열도 맨 뒤에있는 값이 삭제 혹은 삽입되면 문제되지 x => 배열의 앞쪽에 있는 값이 삽입/삭제되는게 퍼포먼스가 뚝뚝 떨어진다!
        list.remove(1); // 삭제 - ArrayList 사용시 주의(삽입/삭제 발생 빈도를 따져서 뭘 쓸건지 판단해야 함)
        System.out.println(list.size());

        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i).name);
        }
        // 이 코드는 LinkedList에서 최악(알고리즘 순환 구조 이해하기) 배열 기반 ArrayList에서 best

        for(StudentDto studentDto : list) {
            System.out.println(studentDto.name);
        }
        // 따라서 LinkedList는 향상된 for문을 사용해야 함! 이 향상된 포문은 ArrayList에서도 좋음 둘 다 사용 가능!
        // 그니까 결론은 향상된 for문!
        


    }
}

class StudentDto {
    StudentDto(String name) {
        this.name = name;
    }
    String name;
    int age;
    int score;
}

// 접근 속도 : O(1) => ()안에 1이 들어있을때가 가장 빠름 => 크기가 아무리 커도 속도는 항상 1이라는 뜻
// O(N) : N은 배열의 크기를 나타냄 => 데이터가 많으면 많을수록 속도가 느려진다는 뜻


// vector도 배열 종류!





// Queue : 선입 선출 (FIFO = LILO) => 비동기식 프로그램에서 사용(주문 누적 => 처리)
// => 맨앞정보를 return하고 지워야함 배열이면 또 다 당겨와야함!!! => LinkedList가 적합!


// Stack : 후입 선출 (FILO = LIFO) => 맨 끝 정보만 빼고 더하고 함 => 배열이 유리
