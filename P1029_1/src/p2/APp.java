package p2;

public class APp {

}

// 쇼핑몰 Dto들
class Seller {
    String name;
}

class Product {
    String name;
}

class Option {
    String name;
}

// Seller => 일대다관계 => Product => 일대다관계 => Option
// 목록은 list 내역은 map같은느낌
// 데이터 구조 짜는게 사실 95%는 차지함
