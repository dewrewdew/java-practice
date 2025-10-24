package com.review.stm.service;
import com.review.stm.Repository.*;
import com.review.stm.ioManager.*;
import com.review.stm.studentDto.*;


public class Service {

    Repository repository = new Repository();

    public void addStudent() {
        IoManager.print("===== 학생 정보 입력 시작 =====");
        String name = IoManager.input("이름 입력 > ");
        int age = Integer.parseInt(IoManager.input("나이 입력 > "));
        int score = Integer.parseInt(IoManager.input("점수 입력 > "));

        StudentDto studentDto = new StudentDto(name, age, score);
        repository.save(studentDto);
        IoManager.print("=============================");
    }

    public void listStudent() {
        IoManager.print("===== 학생 정보 목록 조회 =====");
        StudentDto[] list = repository.findAll();
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
    public void removeStudent() {
        IoManager.print("===== 학생 정보 삭제 시작 =====");
        String removeName = IoManager.input("삭제할 학생의 이름 > ");
        
        int count = repository.removeByName(removeName);
        IoManager.print("총 " + count + "명의 정보가 삭제되었습니다.");
        IoManager.print("=============================");
    }

}
