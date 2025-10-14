public class P2 {
    public static void main(String[] args) {
        StudentDto s1 = new StudentDto();
        StudentDto s2 = new StudentDto();
        StudentDto[] arr = new StudentDto[5]; // 이건 배열 생성 문법(각각의 인스턴스는 아직 생성되지 x)
        // arr[0].name =?? null pointer exception 뜰 것
        // 배열만 생성됐을 뿐 그 배열의 각각의 칸이 어떤 값을 가리키는지 주소값이 null로 설정되어있음
        // 즉, 실질적인 값을 담을 studentDto instance가 없는 것!
        // arr[0] = new StudentDto(); => 결국 이렇게 배열 한칸한칸에 인스턴트를 가리키는값이 하나씩 하나씩 생성이되어야함! [5]로 선언했으니까 0~4까지
        arr[0] = new StudentDto();
        arr[1] = new StudentDto();
        arr[2] = new StudentDto();
        arr[3] = new StudentDto();
        arr[4] = new StudentDto();

        arr[0].name = "홍길동"; // 이제야 오류값이 뜨지 않음! arr[0]이 가리키는 인스턴트가 선언됐으니까!

        s1.name = "홍길동";
        s1.age = 30;
        s1.score = 70;

        s2.name = "철수";
        s2.age = 40;
        s2.score = 80;        

    }
}


class StudentDto {
    String name; // string도 클래스! class 안에 class선언 가능하네?! 
    //(근데 string은 좀 특이한 케이스라 이해하기 힘듦 넘어가기 class는 다른 예시로 이해할 것!)
    int age;
    int score;
    AdditionalInfo addtionalInfo; // 이렇게 선언할 수 있구나!
    //그럼 main에서 StudentDto s1 = new StudentDto();를 선언하면 어떻게 될까?
    //<StudentDto s1 = new StudentDto();
    //s1.additionalInfo = new AdditionalInfo();> 왼쪽과 같이 <>로 둘다 인스턴트를 생성해줘야 비로소 값 넣기 가능!!
}

class AdditionalInfo {
    String gender;
    String birth;
}
