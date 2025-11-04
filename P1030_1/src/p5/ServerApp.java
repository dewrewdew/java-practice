package p5;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 시작");
        ServerSocket serverSocket = new ServerSocket(7777);
        // ()사이에 포트번호 입력 => 임의의 포트번호 7777 입력
        // server가 열림
        while(true) {
            Socket socket = serverSocket.accept();
            // 서버는 기본적으로 절대 꺼지면 안됨. 
        }

        // System.out.println("클라이언트 접속 대기");
        // Socket socket = serverSocket.accept();
        // // 접속 대기 => scanner.nextLine();과 비슷한 느낌
        // System.out.println("누군가 접속을 했음");

        // DataInputStream dis = new DataInputStream(socket.getInputStream());
        // String message = dis.readUTF();
        // System.out.println("서버 종료");

    }
}
