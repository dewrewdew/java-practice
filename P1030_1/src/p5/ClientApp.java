package p5;
import java.io.DataOutputStream;
// 이제부터는 clint, server App  main으로 각각 실행! 서버 열고 
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("클라이언트 시작");

        System.out.println("서버에 접속 시도");
        Socket socket = new Socket("172.30.1.71", 7777);
        // () 안에 IP주소와 PORT번호 기입
        System.out.println("서버에 접속 완료");

        System.out.print("전달 값 입력 > ");
        String message = scanner.nextLine();

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(message);

        System.out.println("서버에 메세지 전달 완료");

        System.out.println("클라이언트 끝");
        
    }
}
