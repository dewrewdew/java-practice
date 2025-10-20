package p4;

public class App {
    public static void main(String[] args) {
        // String currentDay = "월요일";
        // 문자가 용량이 커서 보통 int로 사용
        // 일요일~토요일 : 0 ~ 6
        // ex) int currentDay = 1; => 타입 안정성 관련 문제 발생(public으로 해두면 타인이 임의로 변경할 수 있으므로)

        // if(currentDay.equals("일요일")) {

        // } else if(currentDay.equals("월요일")) {
             
        // }
        Day currentDay = Day.MONDAY;
        if(1 == Day.SUNDAY.getValue()) {

        } else if(currentDay == Day.MONDAY) {

        }

    

    }
}



// enum = 도메인을 정의한다. (도메인 : 한정된 정보의 범위)



enum Day{
    SUNDAY(0),
    MONDAY(1),
    THURSDAY(4);
    
    private final int value;
    Day(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }
    
}
