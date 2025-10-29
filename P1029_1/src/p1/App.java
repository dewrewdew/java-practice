package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // 관리자가 회원 정보 목록을 원하는 경우
        List<User> list = new ArrayList<>();
    {
        // 관리자가 모든 회원 정보와 그 회원이 쓴 글의 모든 정보를 보고 싶다.
        // 자료구조의 의미 => 여러 정보들을 하나로 정리할 수 있느냐
        List<Map<String, Object>> totalDataList = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("userInfo", new User());
        List<Article> articleList = new ArrayList<>();
        articleList.add(new Article());
        articleList.add(new Article());
        articleList.add(new Article());
        map1.put("articldList", articleList);

        totalDataList.add(map1);
    }
    {
        // 글 상세 페이지
        // 글 정보 - 유저 정보
        // list는 "순서"가 필요할 때 사용, MAP은 "다른 계열의 객체"를 묶을 때 사용
        Map<String, Object> data = new HashMap<>();
        data.put("writer", new User());
        data.put("article", new Article());



        // List<Comment> commentList = new ArrayList<>();
        // data.put("commentList", commentList);
        // comment는 보통 다른사람들이 내 글에 달아둠 => 그래서 사실 아래와 같이 작성
        // 데이터 구조는 보자마자 판단할 수 있어야 함 연습 철저히!
        List<Map<String, Object>> commentDataList = new ArrayList<>();
        data.put("commantDataList", commentDataList);


        Map<String, Object> commentData1 = new HashMap<>();
        commentData1.put("comment", new Comment());
        commentData1.put("writer", new User());
        commentDataList.add(commentData1);
    }

}
}

class User {
    String nickname;
    // 유저 정보
    List<Article> list;
    // 이게 정석이긴 함! => 그러나 현실적으로는 힘듦
}

class Article {
    String title;
    String content;
}

class Comment {
    String text;
}

