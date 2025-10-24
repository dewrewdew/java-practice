package p2;

public class App {
    public static void main(String[] args) {
        //String

        String text = "";
        long time = System.currentTimeMillis(); // 프로그램 실행 시간 측정용 API => 1970년 1월 1일 0시 0분 0초 000ms부터 지금까지 지난 ms
        System.out.println(time/1000/60/60/24);
        for(int i = 0; i < 100; i++) {
            text += "야호!!";
        } // 오버헤드가 많이 발생되는 코드
        System.out.println("첫번째 : " + (System.currentTimeMillis() - time) + "ms");
        // currentTime은 실행할때마다 그 때 당시의 시간을 출력해줌.
        // System.out.println(text);

        // String은 불변객체 => 값을 변경하려할 때 변경은 안되고 그냥 새로 생성하는 것
        // 즉, 한번 세팅되면 그 메모리는 값이 변하지 않음
        // 값을 변경시키는 메서드 혹은 그에 준하는 연산자 수행시 새로운 메모리를 생성시킨다.
        // 작업할때마다 메모리를 계속 차지함=>이러한 이유로 String 연산이 많이 발생할 시 퍼포먼스에 영향을 준다.
        // 이럴 때 쓰는게 StringBuilder, StringBuffer => 메모리를 미리 많이 잡아두고 거기에 착착착 정보를 쌓음 => 면접 단골 문제!!
        // Buffer : 여유 메모리
        StringBuilder stringBuilder = new StringBuilder("안녕하세요");
        // text = text.substring(3); => 앞에서부터 3칸을 자른 값을 "새로 생성해서 반환"해준다! (기존 값은 그대로)
        // => 따라서 그 text를 그대로 출력하면 변경 전 값이 나옴(원본) => 변수에 새로 담아(반환해서) 출력해야 변경된 값 나옴
        // String resultText = stringBuilder.toString();
        for(int i = 0 ; i < 100 ; i++) {
            stringBuilder.append("야호");
        } // 미리 capacity를 설정해서 메모리를 확보해두고 거기에 데이터를 착착착 넣음
        String resultText = stringBuilder.toString();
        System.out.println(resultText);
    }
}
