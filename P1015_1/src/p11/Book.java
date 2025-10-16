package p11;

public class Book {
    public static void main(String[] args) {
        BookTest book1 = new BookTest("자바의 정석", "남궁성", 30000);
        BookTest book2 = new BookTest();

        System.out.println("== book1 정보 ==");
        book1.displayInfo();
        System.out.println("== book2 정보 ==");
        book2.displayInfo();

    }
}

class BookTest{
    String title;
    String author;
    int price;

    BookTest() {
        this.title = "제목 미정";
        this.author = "작가 미상";
        this.price = 0;
        System.out.println("생성자1 실행");
    }

    BookTest(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("생성자2 실행");

    }

    void displayInfo() {
        System.out.println("--도서 정보--");
        System.out.println("제목 : [" + title + "]");
        System.out.println("저자 : [" + author + "]");
        System.out.println("가격 : [" + price + "] 원");
        System.out.println("메소드 실행");
        
    }



}