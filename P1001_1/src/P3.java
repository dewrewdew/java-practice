import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        // 카지노
        // 초기 자본은 1,000원
        // 총 4개의 게임 중 골라서 진행 가능.
        // 홀짝, 가위바위보, 단순 로또, 업앤다운...
        // 퇴장을 하거나, 모든 돈을 잃으면 게임이 끝난다.

        Scanner scanner = new Scanner(System.in);

        int coin = 1000;

        System.out.println("**************");
        System.out.println("   중앙카지노   ");
        System.out.println("**************");

        while(true) {
            System.out.println("다음 중 진행할 게임을 선택하세요.");
            System.out.println("1. 홀짝");
            System.out.println("2. 가위바위보");
            System.out.println("3. 로또");
            System.out.println("4. 업 앤 다운");
            System.out.println("0. 끝내기");
            System.out.print("선택 > ");
            String command = scanner.nextLine();

            if(command.equals("0")) {
                break;
            //1~4번은 게임 선택, 0번은 탈출이므로 로직이 달라 따로 구현하는게 보기 좋음. if~else로 구현해도 문제는 없지만 보통 따로 구현함.
            }

            if(command.equals("1")) {
                //...홀짝 게임 진행
                System.out.println("-----홀짝 게임-----");
                System.out.print("베팅액 입력(남은 돈 : "+coin+") > ");
                int bet = Integer.parseInt(scanner.nextLine());
                coin -= bet;

                System.out.println("홀 혹은 짝을 선택해주세요");
                System.out.println("1. 홀");
                System.out.println("2. 짝");
                System.out.print("입력 > ");
                String even = scanner.nextLine();

                int result = (int) (Math.random() * 2) + 1; // 문자 + 숫자 => 문자열!! 마지막에 ""넣어서 문자열로 만들어버림.
                String strResult = result + "";

                String textResultEven = result == 1 ? "홀" : "짝";
                System.out.println(textResultEven + "이 나왔습니다.");

                if(strResult.equals(even)){
                    System.out.println("당신은 이겼습니다.");
                    coin += bet * 2;
                } else {
                    System.out.println("당신은 졌습니다.");
                }

                System.out.println("-----홀짝 게임을 종료합니다.-----");

            } else if(command.equals("2")) {
                //....
            } else if(command.equals("3")) {
                
            } else if(command.equals("4")) {
                System.out.println("-----업 앤 다운-----");
                System.out.println("숫자는 0~46사이의 값이 있습니다.");
                System.out.println("총 시도 횟수는 5회입니다.");

                System.out.print("베팅 금액 입력(가진 돈 :"+coin+" ) > ");
                int bet = Integer.parseInt(scanner.nextLine());

                int targetNumber = (int)(Math.random()*47);

                boolean correctAnswer = true;
                for(int i = 5 ; i > 0 ; i--) {
                    System.out.print("예상값을 입력하세요. ("+i+"회 남음) > ");
                    int guessNumber = Integer.parseInt(scanner.nextLine());

                    if(targetNumber > guessNumber) {
                        System.out.println("업!");
                    } else if(targetNumber < guessNumber) {
                        System.out.println("다운!");
                    } else {
                        // 같은 경우
                        System.out.println("정답입니다!!! 승리하셨습니다.");
                        coin += bet * 3;
                        correctAnswer = true;
                        break;
                        
                    }
                }

                if(!correctAnswer) {
                    System.out.println("정답을 맞추는 데 실패하셨습니다.");
                }
                
            } else {
                System.out.println("잘못된 값을 입력하셨습니다. 다시 시도해주세요.");
                // else는 보통 이럴 때 사용
            }

            //...게임 종료 시점

            if(coin <= 0) {
                System.out.println("모든 돈을 잃었습니다.");
                break;
            }

            System.out.println("계속 진행하시려면 enter를 입력해주세요.");
            scanner.nextLine();

        }


        
            System.out.println("이용해주셔서 감사합니다. 게임을 종료합니다.");
    }



}
