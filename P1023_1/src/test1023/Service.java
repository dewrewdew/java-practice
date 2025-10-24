package test1023;
import java.util.*;

public class Service {
    private Repository repository = new Repository();

    public void addTransaction() {
        IoManager.print("거래 등록을 시작합니다.");

        String date = IoManager.input("날짜 (YYYY-MM-DD): ");
        String typeStr = IoManager.input("유형 (수입/지출): ");
        String category = IoManager.input("카테고리: ");
        String amountStr = IoManager.input("금액: ");
        String memo = IoManager.input("메모: ");

        

        IoManager.print("===============================");
    }
}
