package com.joogang.stm.service;
// <5> add, delete, update등의 기능을 구현하여 controller if문에 추가
// 컴포넌트
// 역할 : 비즈니스 로직(코어 로직) 활용
// 자바에서는 static이 함수! (인스턴스 생성 여부과 관계없이 작동)
// 파싱 : 어떤 문장을 해석(가공)해서 어떤 결과값을 만들겠다는 뜻
import com.joogang.stm.util.IoManager;
import com.joogang.stm.dto.StudentDto;
import com.joogang.stm.repository.Repository;

public class Service {
    private Repository repository = new Repository();
    //<6>작성하면서 repository가 생성되면 작성 (3레이어드 아키텍쳐를 위해)
    public void addStudent() {
        IoManager.print("====== 학생 정보 입력 시작 ======");
        String name = IoManager.input("이름 입력 > ");
        int age = Integer.parseInt(IoManager.input("나이 입력 > "));
        int score = Integer.parseInt(IoManager.input("점수 입력 > "));

        // StudentDto studentDto = new StudentDto(name, age, score); => 인스턴스를 여기서 생성하면 기입하고 사라지고 새로생성하고 기록이안됨.
        // => "배열"을 사용하여 값을 "기록"해야 함. 별도 공간에서 기재하려 함! => 요게 repository에 작성한거!

        // <7> studentDto 주고받는 메서드 작성
        StudentDto studentDto = new StudentDto(name, age, score);

        repository.save(studentDto);
    

        IoManager.print("===============================");
    }



    public void listStudent() {
            IoManager.print("===== 학생 정보 목록 시작 =====");

            StudentDto[] list = repository.findAll();
            // list[0] = null; =>이렇게 기입해도 되지만 데이터 수정등은 repository만 관리할 수 있도록(이것도 되긴하지만 좀 더 안전한 관리를 위해)
            for(StudentDto studentDto : list) {
                String text = "";
                text += "이름 : " + studentDto.getName();
                text += ", 나이 : " + studentDto.getAge();
                text += ", 점수 : " + studentDto.getScore();
                IoManager.print(text);
            }
            IoManager.print("총 " + list.length + "명이 존재합니다.");
            IoManager.print("=============================");
        }
        // <8> 끝났음 이제 이걸 호출하는 메소드를 만들러 controller로!
    
    // <10> 여기도 결과부터 작성! repository한테 검색하라고 지시하는 메서드
    public void searchStudent() {
            IoManager.print("===== 학생 정보 검색 시작 =====");
            String searchWord = IoManager.input("검색할 이름 > ");

            StudentDto[] list = repository.findByNameContaining(searchWord);
            for(StudentDto studentDto : list) {
                String text = "";
                text += "이름 : " + studentDto.getName();
                text += ", 나이 : " + studentDto.getAge();
                text += ", 점수 : " + studentDto.getScore();
                IoManager.print(text);
            }

            IoManager.print("검색된 총 인원은 " + list.length + "입니다.");
            IoManager.print("=============================");
        
        }
    // <11> "삭제" 기능 구현! 여기서 작성해서 repository로 처리하라고 넘기기!
    public void removeStudent() {
    IoManager.print("===== 학생 정보 삭제 시작 =====");
    String removeName = IoManager.input("삭제할 학생의 이름 > ");

    int count = repository.removeByName(removeName);
    IoManager.print("총 " + count + "명의 정보가 삭제되었습니다.");


    IoManager.print("=============================");
    }

    // <13> "통계" 기능 구현 => 이건 repository로 넘길 필요 x
    public void statistize() {

    IoManager.print("===== 학생 정보 통계 시작 =====");

    StudentDto[] list = repository.findAll();
    int sumScore = 0;
    for(StudentDto studentDto : list) {
        sumScore += studentDto.getScore();
    }

    double avg = sumScore / (double)list.length;
    IoManager.print("총 인원 : " + list.length);
    IoManager.print("평균 : " + avg);
    IoManager.print("=============================");
    }

}
