package test1023;

public class TransactionDto {

    private String date;
    private TransactionType type;
    private String category;
    private int amount;
    private String memo;
    private long id;


    // 모든 필드 포함 (데이터 조회 시 사용)
    public TransactionDto(String date, TransactionType type, String category, int amount, String memo, long id) {
        this.date = date;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.memo = memo;
        this.id = id;
    }
    // id만 제외 (데이터 등록용)
    public TransactionDto(String date, TransactionType type, String category, int amount, String memo) {
        this.date = date;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.memo = memo;
    }
    // 기본 생성자
    public TransactionDto() {}

    // type을 수입 혹은 지출로 제한
    public enum TransactionType {
        INCOME, 
        EXPENSE
    }
    public static TransactionDto.TransactionType parseTransactionType(String typeStr) {
    if ("INCOME".equals(typeStr)) {
        return TransactionDto.TransactionType.INCOME;
    } else if ("EXPENSE".equals(typeStr)) {
        return TransactionDto.TransactionType.EXPENSE;
    } else {
        throw new IllegalArgumentException("유효하지 않은 거래 유형: " + typeStr);
    }
}

    // setter, getter
    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
    public TransactionType getType() {
        return type;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getMemo() {
        return memo;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

}


