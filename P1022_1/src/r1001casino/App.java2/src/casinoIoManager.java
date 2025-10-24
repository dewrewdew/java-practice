import java.util.*;
public class casinoIoManager {

    public int getValidBetAmount(int coin, Scanner scanner) {
        int bet;


        while(true) {
            System.out.println("베팅 금액을 입력해주세요. (남은 금액) : " + coin + "원 입니다.");
            bet = Integer.parseInt(scanner.nextLine());

            // 1. 잔액 확인
            if (coin < bet) {
                System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
            } 
            // 2. 0 초과 금액 확인 (추가 검증)
            else if (bet <= 0) {
                 System.out.println("0원 이상의 금액을 베팅해야 합니다.");
            }
            // 3. 유효한 입력
            else {
                break; // 유효하므로 반복문을 탈출
            }
        }

        return bet;
    }
}

