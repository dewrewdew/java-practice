package p6;

public class App {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.a = 10;
        t2.a = 20;

        t1.c = 10;
        t2.c = 20;
        
        System.out.println(t1.c);
        System.out.println(t2.c);

    }
}



class Test {
    int a;
    int b;
    static int c;

}