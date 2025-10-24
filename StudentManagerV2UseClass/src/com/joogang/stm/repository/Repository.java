// <6> Repository 작성
// 컴포넌트
// 역할 : 저장소 - 데이터 입출력 담당
// 3레이어드 아키텍쳐 : controller는 service 참조 service는 repository 참조
// 만약 전체 복습이 부담되면 repository는 복사해서 시작해도됨
package com.joogang.stm.repository;

import com.joogang.stm.dto.StudentDto;

public class Repository {
    private StudentDto[] list = new StudentDto[5];
    // 멤버 변수로 기록? 앞으로도 계속 이 메모리를 사용하겠다는 뜻!
    // 이 멤버 변수에 값을 기록할 수 있게 메소드 작성 필요하겠다!
    // 동시에 몇번째칸에 값을 작성할 지 count변수도 필요!
    
    // <7>
    private int count = 0;
    // 아래 메서드들에서 실제 어디까지 저장되어있는지 알 수 있는 변수가 필요
    // 따라서 멤버변수 = 인스턴스변수로 선언!


    public void save(StudentDto studentDto) {
        list[count] = studentDto;
        count++;
        // count의 역할 : 다음에 값을 저장할 배열의 위치를 가리킴
    }

    // <8> 아래 내용 반영 위해 return list;를 수정 => 안전하게 복사해둔 배열(new list)을 return하는걸로(그래야 잘못된 값이 들어와도 원본은 멀쩡함)
    // list[0] = null; =>이렇게 기입해도 되지만 데이터 수정등은 repository만 관리할 수 있도록(이것도 되긴하지만 좀 더 안전한 관리를 위해)
    public StudentDto[] findAll() {
        // 안전하게 배열을 복사해서 사용=> 그치만 이건 얕은 복사! list[0].setAge = 5; 이걸 방어하지 못했음!
        // 깊게 복사하기 시작!
        // 아래 코드가 조금 어려우면 필요한 만큼 배열을 복사해서 리턴한다고 생각하고 끝내기!

        StudentDto[] newList = new StudentDto[count];

        for(int i = 0 ; i < count ; i++) {
            String name = list[i].getName();
            int age = list[i].getAge();
            int score = list[i].getScore();

            StudentDto studentDto = new StudentDto(name, age, score);
            newList[i] = studentDto;
            // 여기부터는 데이터가 2개면 2개, 3개면 3개 데이터 수량만큼만 복사됨!
        }

        return newList;
    }

    // <9> 한 이름으로된 정보가 총 몇 개 있는지 구하기 => 여기부터는 뒤에서부터 작성(결과부터 작성하는 느낌)
    public StudentDto[] findByNameContaining(String searchWord) {
        int searchCount = 0;
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().contains(searchWord)) {
                searchCount++;
            }
        }

        StudentDto[] newList = new StudentDto[searchCount];
        int newListCount = 0;
        for(int i = 0; i <count ; i++) {
            if(list[i].getName().contains(searchWord)) {
                String name = list[i].getName();
                int age = list[i].getAge();
                int score = list[i].getScore();
                StudentDto studentDto = new StudentDto(name, age, score);
                newList[newListCount] = studentDto;
                newListCount++;
                
            }
            
        }
        return newList;

    }
    // <12> remove 기능 받아서 처리하기! => 코딩하다보면 return 값이 없어 계속 빨간줄 뜸 => return 0; 먼저 써두고 작성!
    // 빨간줄 있는상태로 코딩하는게 좋은건 아님!
    // 이 예제는 통채로 전부 class 이해를 위한 예제! 로직이 이해안되면 넘어가도 됨!
    public int removeByName(String removeName) {
        int removeCount = 0;

        for(int i = 0; i < count ; i++) {
            if(list[i].getName().equals(removeName)) {
                for(int x = i ; x < count - 1 ; x++) {
                    list[x] = list[x+1];

                }
                    count--;
                    i--;
                    removeCount++;
                
            }
        }

        return removeCount;
    }

}
