package a10;

import java.io.FileOutputStream;

public class App {
    public static void main(String[] args){
    int value = Integer.parseInt("19");
//         FileOutputStream fileOutputStream = null;
//         // 
//     try {
//     // Socket socket = new Stocket("19");
//     // 뭔가 API를 썼는데 unhandled뜨면서 빨간 밑줄 뜬다? try catch문 쓰면된다는것만 알면 돼!
//     // 만약 unhandled exception이 여러개뜬다? 한개도 빠짐없이 다 처리 해줘야함!! => 최상위 부모 Exception을 쓰면 한방에 해결
//     // Socket socket = new Socket("111.111.111.111",8080);
//     FileOutputStream fileOutputStream = new FileOutputStream("C:/aaa/bbb.text");
//     // 결국은 이거 해결하려고 여태 배운것!!!!!!!!!!!! 가장 중요!! 알아두기!!!!!!!!!!
//     // 파일의 권한을 선점하는 용도
// } catch (Exception e) {
//     e.printStackTrace();
//     // 일단 지금은 해결 못하겠다 로그만 남겨두자의 뜻!(넘한테 패스)
// } finally { // 어떤 경우라도 finally를 해줘야 함
//     if(fileOutputStream != null) {
//         try {
//             fileOutputStream.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
// }
}
}
try(FileOutputStream fileOutputStream) = new FileOutputStream("c:/aaaa/bbb.text") {

} catch(Exception e) {

}
// 요즘은 close()가 포함된 이 실행문을 사용하면 됨!!
// 이 실행문이 뭘 의미하는지는 알고 넘어가야 함!

