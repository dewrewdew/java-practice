package com.joogang.stm.service;
import com.joogang.stm.repository.*;
import com.joogang.stm.util.*;
import java.util.*;

import com.joogang.stm.dto.*;

public class Service {
    private Repository repository = new Repository();

    public void addStudent() {
        IoManager.print("========= 학생 정보 입력 =========");
        String name = IoManager.input("이름 입력 > ");
        int age = Integer.parseInt(IoManager.input("나이 입력 > "));
        int score = Integer.parseInt(IoManager.input("점수 입력 > "));
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.save(studentDto);
        IoManager.print("=================================");
    }
    public void listStudent() {
        IoManager.print("========= 학생 목록 ===========");
        List<StudentDto> list = repository.findAll();
        for(StudentDto studentDto : list) {
            String text = "";
            text += "이름 : " + studentDto.getName();
            text += ", 나이 : " + studentDto.getAge();
            text += ", 점수 : " + studentDto.getScore();
            IoManager.print(text);
        }
        IoManager.print("총 인원 : " + list.size());
        IoManager.print("=================================");
    }
    public void searchStudent() {
        IoManager.print("========= 학생 정보 검색 ===========");
        String searchName = IoManager.input("검색할 이름 > ");
        List<StudentDto> list = repository.findByNameContaining(searchName);

        for(StudentDto studentDto : list) {
            String text = "";
            text += "이름 : " + studentDto.getName();
            text += ", 나이 : " + studentDto.getAge();
            text += ", 점수 : " + studentDto.getScore();
            IoManager.print(text);
        }
        IoManager.print("검색된 인원 : " + list.size());
        IoManager.print("=================================");
    }
    public void removeStudent() {
        IoManager.print("========= 학생 정보 삭제 ===========");
        String removeName = IoManager.input("삭제할 학생의 이름 > ");
        int removeCount = repository.removeByName(removeName);
        IoManager.print("총 삭제된 인원 : " + removeCount);
        IoManager.print("=================================");
    }

}