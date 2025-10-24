package com.review.stm.Repository;
import com.review.stm.studentDto.StudentDto;

public class Repository {

    private StudentDto[] list = new StudentDto[5];

    private int count = 0;
    // 저장 로직
    public void save(StudentDto studentDto) {
            list[count] = studentDto;
            count++;
    }

    public StudentDto[] findAll() {
        StudentDto[] newList = new StudentDto[count];

        for(int i = 0 ; i < count ; i++) {
        String name = list[i].getName();
        int age = list[i].getAge();
        int score = list[i].getScore();
        StudentDto studentDto = new StudentDto(name, age, score);
        newList[i] = studentDto;
        }
        return newList;
    }
    public StudentDto[] findByNameContaining(String searchWord) {
        int searchCount = 0;
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().contains("searchWord")) {
                searchCount++;
            }
        }
        // 여기서 동일한 조건으로 if문을 한번 더 쓰지 않으면 나는 list[1], [3], [5]의 값을 원했지만 실제로는 list[0],[1],[2]가 저장되고 끝남.
        // i는 for문 전체 검색용, 내가 필요한 칸의 값만을 가리키는 변수 하나가 더 필요함을 인지하자!
        // i를 공유해서 저장하면 의도와는 다르게 [0],[1],[2]의 값만 그대로 저장됨.
        StudentDto[] newList = new StudentDto[searchCount];
        int newsearchCount = 0;
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().contains("searchWord")) {
                String name = list[i].getName();
                int age = list[i].getAge();
                int score = list[i].getScore();
                StudentDto studentDto = new StudentDto(name, age, score);
                newList[newsearchCount] = studentDto;
                newsearchCount++;
            }
        }
        return newList;
    }
    // int i로 전체 for문 설정 후 if로 조건 제시하고, 그다음 그에 해당하는 위치로부터 다음에있는거 "전부" 앞으로 당겨와야함
    // 반복문이 한번 더 필요함을 인지하자!
    public int removeByName(String removeName) {
        int removeCount = 0;
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().equals(removeName)) {
                for(int x = i ; x < count - 1 ; x++ ) { // 아래에 있는 list[x+1] 때문에 count끝까지 가면 값이 없음! 그래서 x < (count -1)
                list[x] = list[x+1]; // 이 부분은 자리만 옮기는거니까 필드를 일일이 복사할 필요가 x 구분!

                }
                count--;
                removeCount++;
                i--;
            }
        }
        return removeCount;
    }
}
