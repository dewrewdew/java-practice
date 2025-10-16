package com.joongang.stm.repository;
import com.joongang.stm.service.*; // 3) 이와 같이 선언


public class AAA {
    QQQ qqq;
    // 1)BBB bbb; => 동일 패키지 내의 클래스는 바로 사용 가능. 다른 패키지 내의 클래스는 바로 사용 불가
    // 2)com.joongang.stm.service.BBB bbb; // 패키지 경로 기재 후 사용 가능! => 너무 번거로우니까 import로 대체해버림
    BBB bbb; // 4) 이제 바로 사용 가능


}
