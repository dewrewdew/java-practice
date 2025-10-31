package p3;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;

public class App {
    public static void main(String[] args) {
        // 파일 로드
        File fis = new File("C:\\Temp\\aaa.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
    }
}
