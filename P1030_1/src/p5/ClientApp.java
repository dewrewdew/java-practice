package p5;

import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        System.out.println("클라이언트 시작");

        System.out.println("서버에 접속 시도");
        Socket socket = new Socket("172.30.1.71", 7777);
        // () 안에 IP주소와 PORT번호 기입

        System.out.println("클라이언트 끝");
        
    }
}
