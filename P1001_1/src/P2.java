public class P2 {
    public static void main(String[] args) {
        // 구구단

        for(int x = 2 ; x <= 9 ; x++) {
            if(x == 5 || x == 7){
                continue;
            }
            
            for(int y = 1 ; y <= 9 ; y++) {
                int result = x * y;
                System.out.println(x + " X " + y + " = " + result);

            }
        }
    }
}
