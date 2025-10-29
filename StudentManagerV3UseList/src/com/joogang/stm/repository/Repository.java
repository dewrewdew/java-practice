package com.joogang.stm.repository;
import com.joogang.stm.dto.*;
import java.util.*;

public class Repository {

    private List<StudentDto> list = new ArrayList<>();

    public void save(StudentDto studentDto) {
        list.add(studentDto);
    }

    public List<StudentDto> findAll() {
        return list;
    }
    // 깊은 복사가 필요하지만 데이터베이스에서 무조건 복사해서 넘겨주기때문에 사실상 필요 없어짐
    // 여기선 실무에서 쓰이는 코드 기준으로 작성!

    public List<StudentDto> findByNameContaining(String searchWord) {
        List<StudentDto> newList = new ArrayList<>();

        for(StudentDto studentDto : list) {
            if(studentDto.getName().contains(searchWord)) {
                newList.add(studentDto);
            }
            // Map<String, Object> map = new HashMap<>();
            // boolean isAnswered = feedbackSqlMapper.existsAnswerByFeedbackId(feedbackDto.getID());
            // StudentDto student = feedbacksqlMapper.findStudentById(feedbackDto.getStudentId());
        }
        return newList;
    }
    public int removeByName(String removeName) {
        // 참고 : 이 코드는 우선순위는 아님. 사실상 List의 remove를 사용할 일은 거의 없음
        // 여기서는 일반 for문 쓰는게 나음 => 이유는 검색해보기!
        int count = 0;
        for(int i = 0 ; i < list.size() ; i++) {
            if(list.get(i).getName().equals(removeName)) {
                list.remove(i);
                i--;
                count++;
            }
        }
        return count;
    }
}
