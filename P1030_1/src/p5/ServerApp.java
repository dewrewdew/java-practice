package p5;

import java.net.ServerSocket;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 시작");
        ServerSocket serverSocket = new ServerSocket(7777);
        // ()사이에 포트번호 입력 => 임의의 포트번호 7777 입력
        // server가 열림

        System.out.println("클라이언트 접속 대기");
        serverSocket.accept();
        // 접속 대기 => scanner.nextLine();과 비슷한 느낌
        System.out.println("누군가 접속을 했음");


        System.out.println("서버 종료");

    }
}
