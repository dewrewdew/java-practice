package com.practice.session1.repository;
import com.practice.session1.studentdto.*;
public class Repository {
    private StudentDto[] list = new StudentDto[5];
    private int count = 0;

    public void save(StudentDto studentDto) {
        list[count] = studentDto;
        count++;
        if(count == list.length) {
            int newListLength = 0;
            newListLength = count + 5;
            StudentDto[] newList = new StudentDto[newListLength];
            for(int i = 0 ; i < count ; i ++) {
                newList[i] = list[i];
            }
            this.list = newList;
        }
    }
    public StudentDto[] findAll() {
        StudentDto[] newList = new StudentDto[count];
        for(int i = 0 ; i < count ; i++) {
            String name = list[i].getName();
            int age = list[i].getAge();
            int score = list[i].getScore();
            newList[i] = new StudentDto(name, age, score);
            
        }
        return newList;
    }
    public StudentDto[] findByNameContaining(String searchName) {
        int searchCount = 0;
        for(int i = 0 ; i < count ; i ++) {
            if(list[i].getName().contains(searchName)) {
                searchCount++;
            }
        }
        StudentDto[] newList = new StudentDto[searchCount];
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().contains(searchName)){
                String name = list[i].getName();
                int age = list[i].getAge();
                int score = list[i].getScore();
                newList[i] = new StudentDto(name, age, score);
            }
        }

        return newList;
    }
    public int removeByName(String removeName) {
        int removeCount = 0;
        for(int i = 0 ; i < count ; i ++) {
            if(list[i].getName().equals(removeName)){
                for(int x = i ; x < (count - 1) ; x++) {
                    list[x] = list[x + 1];
                }
            }
            count--;
            removeCount++;
            i--;
        }
        return removeCount;
    }
    public void updateByName(String updateName, StudentDto studentDto) {
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().equals(updateName)) {
                list[i].setName(studentDto.getName());
                list[i].setAge(studentDto.getAge());
                list[i].setScore(studentDto.getScore());
            }
        }
    }

}
