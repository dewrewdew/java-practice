package p9;

public class App {
    public static void main(String[] args) { // => public은 풀고 private은 막는 것!
        Account a1 = new Account("철수");

        // a1.balance += 3000;
        // a1.balance += 3000;
        // a1.balance -= 5000;

        // a1.deposit(3000);
        // a1.deposit(3000);
        // a1.withdraw(100000);
        // 이미 정의해둔 메소드가 있는데 이렇게 짠다? => 속성값을 전부 PRIVATE 처리 해버림으로서 아예 이걸 이렇게 코딩할 수 없게 만들어버림
        // 접근 금지시켜서 아예 못쓰게함


        // System.out.println(a1.owner + "의 잔액 : " + a1.balance);
        // => private으로 잠궈버리면 최종 금액도 조회 못하네 어떻게 하지 ? 절대 private으로 풀어버리지는 x 메서드를 이용해서 푸는 기능 구현!
        // 그래서 아래와같이 메서드로 값 불러오기

        System.out.println(a1.getOwner() + "의 잔액: " + a1.getBalance());

        // 알약으로 치면 약의 색이 public(겉 모습) => 알약을 열었을때 그 성분들이 private 근데 보통은 성분은 알 필요x 겉 색깔로 구분!
        // 그래서 겉의 모습에 대해서만 설명해줌(api개발자->앱개발자) => 노출 여부를 구분을 하겠다.



    }
}
// 앱을 개발하는 사람과 api를 개발하는 사람 총 2명이 있다고 가정.
// api 개발하는 사람은 앱개발자가 자기가 의도하는대로 api를 잘 쓰기를 바람. 꼭 그렇게 되어야만하고
// 그래서 자기가 원치 않는 방향으로 짜는걸 막기 위해 접근 제한자로 앱개발자한테 안보이게 막음. (보통 속성은 무조건 막음)
// 속성은 절대 변경되면 안됨 => 제어권은 무조건 api개발자만 갖고있어야됨
class Account {
    private String owner;
    private int balance;
// class Account ~ int balance;까지는 보통 private
    public Account(String owner) { // 생성자도 private 가능 (남들은 생성 못하게 함)
        this.owner = owner;
    }

    public void deposit(int value) {
        balance += value;
    }

    public void withdraw(int value) {
        if(cannotWithdraw(value)) {
            System.out.println("출금 오류: 잔액이 부족합니다.");
            return; // void일때도 이런식으로 종료하기 위해 사용 가능!
        }
        balance -= value;
    }

    boolean cannotWithdraw(int value) { // withdraw로 분기시키기 위한 코드(api 개발자 자기 자신을 위한 코드)
        // => public으로 풀어버리면 쓸데없이 다른사람들이 접근해서 써버림
        return balance < value;
    }

    // read only
    public String getOwner() {
        return owner;
    }
    // read only
    public int getBalance() {
        return balance;
    }
}
