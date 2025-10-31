package p2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class App {
    public static void main(String[] args) throws Exception{
    // 파일, 쓰레드, 네트워크
    // 파일 입출력 => 목표 : 데이터를 파일에 저장할 수 있다.
    // RAM은 전기적 신호로 접근하여 속도가 빠르고 전기신호가 차단되면 데이터가 소멸됨
    int a = 10;
    System.out.println(a);
    }

    File file = new File("C:\\Temp\\aaa.dat");
    OutputStream fos = new FileOutputStream(file);
    // outputstream : 보내는 것
    // 네트워크에서 쓰는건 싹 다 byte
    fos.write(a);
    fos.close();

    for.write( a >> 24 );
    for.write( a >> 16 );
    for.write( a >> 8 );
    for.write( a >> 0 );
    // int를 저장하기위해 바이트 4개를 쪼개서 비트연산해서 저장

}
