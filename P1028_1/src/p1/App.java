package p1;
// 배열의 문제점 : 정해진 크기(오버플로우, 메모리 낭비), 데이터 삽입/삭제의 어려움(데이터가 많을수록 느려짐)
// 배열의 장점 : 접근속도는 최상위(압도적 장점)
// 배열의 특징 : 순차 탐색이 가능 (리스트는 메모리가 곳곳에 생성됨)
// List(배열, 링크드 리스트) Set Map
// 메모리와 알고리즘 잘 따라갈 것!
// 알고리즘을 직접 구현할 필요는 없음. 이해하고 넘어갈 것!
// Class의 안정성 확보 과정은 필수! 여기선 생략함(public, getter/setter 등등)
// 알고리즘을 보고 장단점이 뭔지 생각해보면서 발전할 수 있다!
public class App {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(new StudentDto("철수"));
        list.add(new StudentDto("영희"));
        list.add(new StudentDto("길동"));
        list.add(new StudentDto("민수"));

        list.add(new StudentDto("메르시"),2);

        list.remove(1);

        System.out.println(list.get(0).name);
        System.out.println(list.get(1).name);
        System.out.println(list.get(2).name);
        System.out.println(list.get(3).name);
    }
}
// 코드 실행중 문제 발생 시 중간중간 출력문 넣어가면서 범위 좁혀가면서 판단

class StudentDto {
    StudentDto(String name) {
        this.name = name;
    }
    String name;
    int age;
    int score;
}

// 학생 정보를 담을 수 있는 클래스 정의 알고리즘
// 링크드리스트가 거의 전부!!!! 제대로 알아둘 것!! => 링크를 연결시키는 게 핵심!

class Node {
    StudentDto data;
    // studentDto가 한번 더 감싸져서 Node안에 있는 느낌
    Node next;
    // Node prev => 사실 이렇게 바로 앞의값도 지정하는 node도 추가해서 양방향으로 이동 가능하도록 설계함.
}
// 사실상 여기에 모든 정보가 담겨있음!
// 요게이제 studentDto와 다음 알갱이의 주소를 갖고있는 큰 알갱이 1개 구성 정보
// 설계할 때 여기에 무슨값을 담을지 예측하기 어려움 => 이럴 때 쓰는게 제너릭!!

// 아래 add 이해하는게 가장 중요!!
class MyLinkedList {
    private Node firstNode;
    public void add(StudentDto data) {
        Node newNode = new Node();
        newNode.data = data;

        if(firstNode == null) {
            firstNode = newNode;
            return;
        }
        // 필드값은 초기값으로 자동 초기화되므로 무조건 처음들어가는값은 null자리에 들어감 그래서 초기 설정값이 firstNode에 저장됨!
        // 여기까지만하면 초기값만 저장되고 다음 add실행부터는 if 이후에 실행문이 없으므로 들어오자마자 소멸됨 => 이후 코드 작성하자!

        // 꼬리 찾기 핵심 코드(마지막 null값) => 리스트가 배열보다 좋거나 안좋은 점을 정확히 파악해야함!
        Node tempNode = firstNode;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }
        // 꼬리 찾았음! 이제 마지막 노드에 다음 node를 연결하자!
        tempNode.next = newNode;
        // 기본 타입은 '=' 기준으로 오른쪽 값을 왼쪽에 대입한다고 생각하고,
        // 참조 타입은 왼쪽변수가 오른쪽 값을 가리킨다고 생각하자!!
    }
    // 삽입(최고 장점) => add 메서드가 서로 다른 매개변수로 오버로딩 되어있음!
    public void add(StudentDto data, int index) {
        Node newNode = new Node();
        newNode.data = data;

        if(index == 0) {
            newNode.next = firstNode;
            firstNode = newNode;
            return;
        }

        Node tempNode = firstNode;
        for(int i = 0 ; i < index - 1 ; i++) {
            tempNode = tempNode.next;
        }

        newNode.next = tempNode.next;
        tempNode.next = newNode;
        // next값 반영할 때 "작업 순서" 꼭 확인!(GC가 수거해가지 않도록 주의)

    }





    // 삭제(최고 장점) => 데이터 A, B, C가 있는데 B를 삭제하려면 A의 next값이 C의 주소를 갖게 하면 됨! B는 알아서 GC가 수거
    public void remove(int index) {
        if(index == 0) {
            firstNode = firstNode.next;
            return;
        }

        Node tempNode = firstNode;
        for(int i = 0 ; i < index - 1 ; i++) {
            tempNode = tempNode.next;
        }
        // 삭제 코드 1
        tempNode.next = tempNode.next.next;
        // 삭제 코드 2
    }

    // List에 접근해서 자료 가져오기 (제일 최악)
    public StudentDto get(int index) {
        if(index == 0) {
            return firstNode.data;
        }
    
    Node tempNode = firstNode;
    for(int i = 0 ; i < index ; i++) {
        tempNode = tempNode.next;
    }

    return tempNode.data;
    }
    // LinkedList의 최대 단점 => 접근이 너무 느림
    // 단, 배열의 접근 속도는 아무것도 따라올 수 없다.(단, index를 통해 접근할 때)
    // => 메모리가 아예 한번에 순서대로 저장되어있음


}
// 지금 코드는 studentDto라 학생정보밖에 담을수가 없음 => 제너릭 사용 시 더 다양한 정보를 담을 수 있음!

// class Node<E> {
//     E data;
//     Node<E> next;
// }
// 이런식으로 변경해서 사용 가능! (코드 전반적으로 수정해야됨)