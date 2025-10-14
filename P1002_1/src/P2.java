public class P2 {
    public static void main(String[] args) {
        // 배열 => 반복문을 쓰려는게 목적! 기본적으로는 하나의 메모리에 한가지 값만 들어간다.
        // => 그럼 데이터가 2만개가 있고 그중에 특정 값을 찾을 때는? 이럴때 쓰는게 배열! 데이터를 뭉쳐서 한번에 관리!

        int[] scores = new int[5]; // scores는 int가 아님! 그래서 1가지 정수를 기입하면 오류뜸.
        // 주의) index는 0부터 시작! 그래서 int[0]~int[4]까지만 생성! index는 int[n-1]까지만 생성됨에 주의!
        // exception오류는 컴파일 오류(x) / 런타임 오류(o)
        // int [] scores = new int[10]; 에서 = 은 대입연산자이므로 scores도 메모리 한개 차지 그래서 이 선언으로 사용하는 메모리는 총 6개!
        // new~로 시작하는건 stack이 아니라 heap에 저장됨! => 참조하는 변수가 꼭!! 있어야 됨.
        // 기본타입을 제외한 모~든 변수는 참조타입!
        // scores는 참조변수로 30500 등 컴퓨터의 30500번째 메모리부터 5개의 배열을 하겠다 이런 느낌!

        scores[0] = 77;
        scores[3] = 99;

        for(int i = 0 ; i < 5 ; i++) { // index가 0~4까지밖에없으니 i<5로 표현 그리고 보통 0부터 시작(배열 때문에)
            // => 배열은 보통 반복문과 함께 쓰임! 사실 그러려고 배열 쓰는 것!
            System.out.println(scores[i]);


        }

        System.out.println(scores[0]);
        System.out.println(scores[5]);









    }
}
