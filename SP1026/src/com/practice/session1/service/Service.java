package com.practice.session1.service;
import com.practice.session1.repository.*;
import com.practice.session1.iomanager.*;
import com.practice.session1.studentdto.*;

public class Service {
    Repository repository = new Repository();

    public void addStudent() {
        IoManager.print("========학생 정보 등록=========");
        String name = IoManager.input("이름 > ");
        int age = Integer.parseInt(IoManager.input("나이 > "));
        int score = Integer.parseInt(IoManager.input("점수 > "));
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.save(studentDto);
        IoManager.print("==============================");

    }
    public void findAllStudent() {
        IoManager.print("========학생 정보 목록 조회=========");
        StudentDto[] list = repository.findAll();
        for(int i = 0 ; i < list.length ; i++) {
            String text = "";
            text += "이름 : " + list[i].getName();
            text += ", 나이 : " + list[i].getAge();
            text += ", 점수 : " + list[i].getScore();
            IoManager.print(text);
        IoManager.print("==============================");

        }
    }
    public void findByStudentName() {
        IoManager.print("========학생 정보 검색=========");
        String findName = IoManager.input("검색할 학생의 이름을 입력하세요 > ");
        StudentDto[] list = repository.findByNameContaining(findName);
        for(int i = 0 ; i < list.length ; i++) {
            String text = "";
            text += "이름 : " + list[i].getName();
            text += ", 나이 : " + list[i].getAge();
            text += ", 점수 : " + list[i].getScore();
            IoManager.print("총 " + list.length + "명의 학생 정보가 검색되었습니다.");        
            IoManager.print(text);
        IoManager.print("==============================");
        }
    }
    public void updateStudent() {
        IoManager.print("========학생 정보 업데이트=========");
        String updateName = IoManager.input("수정할 학생의 이름을 입력하세요 > ");
        String name = IoManager.input("새로 반영할 이름을 입력하세요 > ");
        int age = Integer.parseInt(IoManager.input("나이 > "));
        int score = Integer.parseInt(IoManager.input("점수 > "));
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.updateByName(updateName, studentDto);
        IoManager.print("==============================");
    }
    public void removeStudent() {
        IoManager.print("========학생 정보 삭제=========");
        String removeName = IoManager.input("삭제할 학생의 이름을 입력하세요 > ");
        int removeCount = repository.removeByName(removeName);
        IoManager.print("총 " + removeCount + "명의 학생 정보가 삭제되었습니다.");        
        IoManager.print("==============================");
    }
    

}