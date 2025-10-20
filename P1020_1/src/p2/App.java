package p2;

public class App {
    public static void main(String[] args) {

    }
}

class shopDto {
    String name;
    // 외 기타 추가 정보들이 있을 것! (쇼핑몰 기준)

    ProductDto[] productList = new ProductDto[5];
    // 하나의 shopDto에는 여러개의 ProductDto가 있을 수 있다!
    // 한가지 상점에 여러가지 물건이 있다.
}

class ProductDto {
    String name;
    // 외 기타 추가 정보들(생략)
    OptionDto[] optionList = new OptionDto[5];
    // 한가지 물건에 여러가지 물건이 있다.

}

class OptionDto {
    String name;
    // 외 기타 추가 정보들(생략)
    // 옵션에도 또 여러 옵션이 추가될 수 있음.
}
