import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        // 카지노
        // 초기 자본은 1,000원
        // 홀짝, 가위바위보, 로또, 업 앤 다운
        // 퇴장을 하거나, 모든 돈을 잃으면 게임이 끝난다.
        CasinoBetAmount casinoBetAmount = new CasinoBetAmount();
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

            // 탈출 로직 구현
            if(command.equals("0")) {
                break;
            }
            // 홀짝
            if(command.equals("1")) {
                System.out.println("-----홀짝 게임-----");
                int bet = casinoBetAmount.verifyBetAmount(coin, scanner);
                
                System.out.println("홀 혹은 짝을 선택해주세요");
                System.out.println("1. 홀");
                System.out.println("2. 짝");
                System.out.print("입력 > ");
                String even = scanner.nextLine();

                int result = (int) (Math.random() * 2) + 1;
                String strResult = result + "";

                String textResultEven = result == 1 ? "홀" : "짝";
                System.out.println(textResultEven + "이 나왔습니다.");

                if(strResult.equals(even)){
                    System.out.println("당신은 이겼습니다.");
                    System.out.println("베팅 금액의 2배가 적립됩니다.");
                    coin += bet * 2;
                } else {
                    System.out.println("당신은 졌습니다.");
                    System.out.println("베팅하신 금액 " + bet + "원이 차감됩니다.");
                    coin -= bet;
                }

                System.out.println("-----홀짝 게임을 종료합니다.-----");
            // 가위바위보
            } else if(command.equals("2")) {
                System.out.println("------ 가위바위보 게임 ------");
                int bet = casinoBetAmount.verifyBetAmount(coin, scanner);
                System.out.println("아래 숫자 중 하나를 선택해주세요");
                System.out.println("1. 가위");
                System.out.println("2. 바위");
                System.out.println("3. 보");
                System.out.print("선택 > ");
                int input = Integer.parseInt(scanner.nextLine());
                int random = (int)(Math.random()*3 + 1);
                String[] list = {"가위", "바위", "보"};
                System.out.println(list[random - 1] + "가(이) 나왔습니다.");
                if (input == random) {
                    System.out.println("비겼습니다. 베팅 금액이 반환됩니다.");
                } else if ((input == 1 && random == 2) || (input == 2 && random == 3) || (input == 3 && random == 1)) {
                    System.out.println("졌습니다. 베팅 금액이 차감됩니다.");
                    coin -= bet;
                } else if ((input == 1 && random == 3) || (input == 2 && random == 1) || (input == 3 && random == 2)) {
                    System.out.println("이겼습니다. 베팅 금액의 2배만큼 적립됩니다.");
                    coin += bet * 2;
                }

            // 로또
            } else if(command.equals("3")) {
                System.out.println("-----로또 게임-----");
                int bet = casinoBetAmount.verifyBetAmount(coin, scanner);
                System.out.println("6개를 맞히면 베팅 금액의 3배, 5개를 맞히면 2배가 적립됩니다.");
                System.out.println("1~45 사이의 값중 중복되지 않는 숫자 6가지를 골라 입력해주세요.");
                // 사용자 입력값 저장
                int[] inputList = new int[6];
                for(int i = 0 ; i < inputList.length ; i++) {
                    System.out.print((i + 1) + "번 숫자 > ");
                    inputList[i] = Integer.parseInt(scanner.nextLine());
                }
                // 랜덤 생성값 저장
                int[] list = new int[6];
                for(int i = 0 ; i < list.length ; i++) {
                    int newNumber;
                    boolean isDuplicate;

                    while(true) {

                        newNumber = (int) (Math.random()*45) + 1;
                        isDuplicate = false;
                        for(int j = 0 ; j < i ; j++) {
                            if(newNumber == list[j]) {
                                isDuplicate = true;
                                break;
                            }
                        }
                    if(!isDuplicate) {
                        break;
                    }
                    }
                list[i] = newNumber;
                }

                // 비교
                int matchCount = 0;
                for(int i = 0 ; i < 6 ; i++) {
                    for(int x = 0 ; x < 6 ; x++) {
                        if(inputList[i] == list[x]) {
                        matchCount++;
                        break;
                        // 이미 random값에 중복이 없도록 구현해두었으므로 일치하는 값을 하나만 찾으면 더 이상 검사할 필요가 없음
                        // 성능과 효율성을 위해 break; 실행
                        }
                    }
                }
                for(int i = 0 ; i < 6 ; i++) {
                System.out.println("출력된 값은 " + (i + 1) + "번 : " + list[i]);
                }
                System.out.println("총 " + matchCount + "개를 맞히셨습니다.");
                if(matchCount == 6) {
                    System.out.println("베팅금액의 3배가 적립됩니다.");
                    coin += bet * 3;
                } else if(matchCount == 5) {
                    System.out.println("베팅금액의 2배가 적립됩니다.");
                    coin += bet * 2;
                } else {
                    System.out.println("실패하셨습니다. 베팅금액이 차감됩니다.");
                    coin -= bet;
                }

            // 업 앤 다운
            } else if(command.equals("4")) {
                System.out.println("-----업 앤 다운-----");
                System.out.println("숫자는 0~46사이의 값이 있습니다.");
                System.out.println("총 시도 횟수는 5회입니다.");
                int bet = casinoBetAmount.verifyBetAmount(coin, scanner);

                int targetNumber = (int)(Math.random()*47);
                boolean iscorrectAnswer = false;
                // for문 안에서 일어난 일(정답을 맞췄는 지)을 밖으로 전달하는 Flag역할!
                for(int i = 5 ; i > 0 ; i--) {
                    System.out.print("예상값을 입력하세요. ("+i+"회 남음) > ");
                    int guessNumber = Integer.parseInt(scanner.nextLine());

                    if(targetNumber > guessNumber) {
                        System.out.println("업!");
                    } else if(targetNumber < guessNumber) {
                        System.out.println("다운!");
                    } else if(targetNumber == guessNumber) {
                        System.out.println("정답입니다!!! 승리하셨습니다.");
                        System.out.println("베팅 금액의 3배가 적립됩니다.");
                        coin += bet * 3;
                        iscorrectAnswer = true;
                        break;
                    }
                }
                if(iscorrectAnswer != true) {
                System.out.println("실패하셨습니다. 잔여 횟수가 없습니다.");
                System.out.println("베팅 금액만큼 차감됩니다.");
                coin -= bet;
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

class CasinoBetAmount {
    int bet;
    // Scanner scanner = new Scanner(System.in); => scanner를 여기서 더 선언하는 건 자원 낭비!
    // 매개변수에 scanner 추가!
    

    public int verifyBetAmount(int coin, Scanner scanner) {
        while(true) {
            System.out.print("베팅할 금액을 입력해주세요. 현재 잔액 : " + coin + " > ");
            bet = Integer.parseInt(scanner.nextLine());
            if (bet > coin) {
                System.out.println("잔액이 부족합니다. 현재 잔액 : " + coin);
                System.out.println("다시 입력해주세요."); 
            } else if (bet <= 0) {
                System.out.println("0보다 큰 값을 입력해주세요.");
            } else {
                return bet;
            }
        }
    }
}
