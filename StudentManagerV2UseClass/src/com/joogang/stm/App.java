// 프로젝트 시작(순서에 주의) => 2025.10.17 이 프로그램이 꽃!! 앞으로 2주간 계속 반복 물 흐르듯 작성될떄까지!!!!!
// 보통 데이터를 먼저 정리함(student DTO 정립이 0순위) => stm.dto로 이동하여 작성
// ★반드시!!!!!!!! 계속 실행 눌러보면서 구현해야함!!!!
package com.joogang.stm;
import com.joogang.stm.controller.*;

// import com.joogang.stm.dto.StudentDto; // <0> StudentDto 기재 후 import 작성

public class App {
    public static void main(String[] args) { // main은 여기 하나밖에 없으니 어느 패키지에서 실행버튼 눌러도 여기서 실행됨! 보통 main문은 짧음!
        // System.out.println("안녕하세요"); => 프로젝트 만들고 1회 시행해보기 (test)

        // StudentDto s1 = new StudentDto();
        // s1.name = "한조";
        // s1.setName("한조"); // s1.name = "한조"; 불가!! 왜? StudentDto class field가 private이니까!! 기입하고싶으면 set 읽어오고싶으면 get
        new Controller().run(); // <1> 작성 후 기재 가능



    }

}
