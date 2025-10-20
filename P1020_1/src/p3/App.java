package p3;

public class App {
    public static void main(String[] args) {

    }
}

class Team {
    String name;
    // 한 부서 내의 팀 리스트 외 기타 정보들(생략)
    Team[] teamList = new Team[5];
    Person[] PersonList = new Person[5];

    // person[]만 있을때는 이중 for문 사용 / team[], person[] 둘 다 있을 때는 재귀함수로 풀어야 함!
    // team 아래의 team[] 아래에 또 team[] 이 있다고 하면 데이터의 무게감이 서로 같은 것들이 아래로 이루어져 있어서 재귀함수로 풀어야 함.
    // team 아래에 person[]처럼 무게감이 다른 데이터들이 엮여 있으므로 재귀 사용 x 다중 for문 사용해야 함 => 대부분의 경우!
    // 결론 : 회원이 회원을 참조하고 또 회원이랑 이어지고 즉 데이터들의 무게감들이 전부 같은경우에만 재귀함수 사용!(사실상 재귀 + 1중 for문의 반복)
}

class Person {
    String name;
    // 한 팀 내의 구성원 외 기타 정보들(생략)
}