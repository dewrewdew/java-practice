public class P4 {
    public static void main(String[] args) {
        String str = "안녕하세요!!, 반갑습니다.";

        char[] arr = str.toCharArray(); //char은 int타입으로 분류되므로 사실상 숫자!
        int test1 = 'b' - 'a'; //문자에 대한 숫자가 매핑되므로 결과는 1
        String[] arr2 = str.split(",");

        String str2 = "야호!!";
        String str3 = "야호!!";
        if(str2.equals(str3)) {
        }

        if(str2.contains("호")) {
            
        }
    }
}
