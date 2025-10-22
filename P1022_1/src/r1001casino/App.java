package r1001casino;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coin = 3000;

        System.out.println("=======================");
        System.out.println("======중앙카지노======");
        System.out.println("=======================");

        while(true) {
            // 게임 종료 시점(coin 소진)
            if(coin <= 0) {
                System.out.println("금액이 모두 소진되었습니다.");
                System.out.println("게임을 종료합니다.");
                break; 

            }            
            
            System.out.println("다음 중 진행할 게임을 선택하세요.");
            System.out.println("1. 홀짝");
            System.out.println("2. 가위바위보");
            System.out.println("3. 로또");
            System.out.println("4. 업 앤 다운");
            System.out.println("5. 숫자 야구");
            System.out.println("0. 게임 종료");
            System.out.print("선택 > ");
            String command = scanner.nextLine();
            // 게임 종료
            if(command.equals("0")) {
                break;
            }

            // 1. 홀짝 게임 진행
            if(command.equals("1")) {
            System.out.println("====홀짝 게임을 시작합니다.====");
            System.out.println("홀 혹은 짝을 맞추시게 되면 베팅 금액의 2배가 적립되며, 틀리면 베팅 금액만큼 차감됩니다.");
            int bet;
            while(true){
                System.out.print("베팅 금액을 입력해주세요 (남은 금액 : " + coin + "원) > ");
                bet = Integer.parseInt(scanner.nextLine());
                if(coin < bet) {
                System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
            }   else {
                break;
            }
            } 

            System.out.println("홀 혹은 짝을 입력해주세요.");
            System.out.println("1. 홀");
            System.out.println("2. 짝");
            System.out.print("입력 > ");
            String userGuess = scanner.nextLine();

            int computerChoice = (int)(Math.random() * 2) + 1;
            String strComputerChoice = computerChoice + "";
            String outputComputerChoice = computerChoice == 1 ? "홀" : "짝";
            System.out.println(outputComputerChoice + "이 나왔습니다.");

            if(strComputerChoice.equals(userGuess)) {
                System.out.println("이겼습니다. 축하합니다!");
                coin += bet*2;
            } else {
                System.out.println("졌습니다. 베팅하신 금액" + bet + "원이 차감됩니다.");
                coin -= bet;
            }
            

            // 2. 가위바위보
        }   else if(command.equals("2")) {
            System.out.println("====가위바위보 게임을 시작합니다.====");
            System.out.println("이기면 베팅 금액의 2배가 적립되고, 비기면 보존되며, 지면 베팅 금액의 2배만큼 차감됩니다.");
            System.out.print("아래 선택지 중 하나를 선택하세요.\n1. 가위\n2. 바위\n3. 보\n선택 > ");
            String userGuess = scanner.nextLine();
            int computerChoice = (int)(Math.random() * 2) + 1;
            String strComputerChoice = computerChoice + "";
            

            System.out.println("계속 진행하시려면 Enter를 눌러주세요.");
            scanner.nextLine();
            
        }   else if(command.equals("3")) {
            // 3. 로또
        }   else if(command.equals("4")) {
            // 4. 업 앤 다운
        }   else if(command.equals("5")) {
            // 5. 숫자 야구
        
        }
    }





    }
}
