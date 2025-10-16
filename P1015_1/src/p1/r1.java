package p1;

public class r1 {
    public static void main(String[] args) {
        // 1. 매개변수 있는 생성자를 사용해 객체 생성
        Book book1 = new Book("자바의 정석", "남궁성", 30000);
        
        // 2. 기본 생성자를 사용해 객체 생성
        Book book2 = new Book();
        
        // 3. 메소드 호출 및 결과 확인
        System.out.println("=== Book1 정보 ===");
        book1.displayInfo();
        
        System.out.println("\n=== Book2 정보 ===");
        book2.displayInfo();
    }

}

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book() {
        this.title = "제목 미정";
        this.author = "작가 미상";
    }

    void displayInfo() {
        
        System.out.println("--도서 정보--");
        System.out.println("제목 : [" + this.title + "]");
        System.out.println("저자 : [" + this.author + "]");
        System.out.println("가격 : [" + this.price + "]원");
    
    }

}
