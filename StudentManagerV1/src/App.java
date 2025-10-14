import java.util.*;
public class App {
    public static void main(String[] args) throws Exception { //원래는 하나의 프로젝트당 단 한개의 main만 존재해야 함.
        // 주제 : 학생 정보 관리 프로그램
        // 기능 : 학생 정보 등록, 목록, 검색, 삭제, 수정..
        // 한 명의 학생의 데이터 : 이름, 나이, 성적
        // 대입 연산자 "="가 있으면 무조건 변수!!!!
        // 코딩할 때 UI도 신경쓰기!!
        // 1. 문법을 이해하려고 노력
        // 2. 충분한 반복(코드에 익숙해진다. - 억지로 이해 x 자연스럽게 이해될 때 까지)
        // 3. 반복 이후에 남은 어려운 부분들을 다시 공부
        // 4. 복기 가능
        // 5. 응용 가능 => 문제 풀기, 고도화, 추가 기능 구현 / 이것을 이용해서 만들고 싶은 것을 만든다.

        Scanner scanner = new Scanner(System.in);

        // 자료구조 => while문 돌면서 돌때마다 새로생성될 필요 없고, 한번 기억된 정보가 오래 살아남아야하므로 명령문 바깥쪽 main 안쪽에 선언되어야 함.
        String[] nameList = new String[5];
        int[] ageList = new int[5];
        int[] scoreList = new int[5];
        int studentCount = 0; //배열 중 몇번째에 저장해야되는지 가르키는 변수(인덱스 역할)



        //환영 인사
        System.out.println("===========================================");
        System.out.println("          학생 정보 관리 프로그램 v1           ");
        System.out.println("               개발자 : 트레이서              ");
        System.out.println("===========================================");

        while(true) {
            System.out.println("**** 메뉴 ****");
            System.out.println("1. 학생 정보 등록");
            System.out.println("2. 학생 정보 목록");
            System.out.println("3. 학생 정보 검색");
            System.out.println("4. 학생 정보 삭제");
            System.out.println("5. 학생 정보 수정"); //문제
            System.out.println("6. 학생 정보 통계"); //문제 : 학생 평균 점수, 가장 낮은 점수를 가진 학생
            System.out.println("0. 프로그램 종료");

            System.out.print("명령어 입력 > ");

            String command = scanner.nextLine();
            
            // 종료 처리
            // command == "0" 을 하게 되면 각자가 참조하는 주소값을 비교하게 되어 무조건 false가 됨.
            // String 비교는 equals!
            if(command.equals("0")) {
                break;            
            }

            // 명령 처리
            if(command.equals("1")) {
                // 학생 등록 로직
                // 문제 : 이름(2글자 이상), 나이, 점수 값 유효성 검사 - 숫자가 아닌 경우 입력안되게
                System.out.println("#### 학생 등록 ####");
                System.out.print("이름 입력 > ");
                String name = scanner.nextLine();
                System.out.print("나이 입력 > ");
                String stringAge = scanner.nextLine();


                int age = Integer.parseInt(stringAge);
                System.out.print("점수 입력 > ");
                int score = Integer.parseInt(scanner.nextLine());

                nameList[studentCount] = name;
                ageList[studentCount] = age;
                scoreList[studentCount] = score;
                studentCount++;

                // ArrayList 내부 동작 구조 - 이해 해보려고 노력하되 안되면 넘어가도 됨
                if(studentCount == nameList.length) {
                    // 2배 크기의 배열 생성
                    String[] newNameList = new String[studentCount];
                    // 배열 복사
                for(int i = 0; i < studentCount; i++) {
                    newNameList[i] = nameList[i];
                    }
                    nameList = newNameList;


                    // age 배열 늘리기
                if(studentCount == ageList.length) {
                
                    int[] newAgeList = new int[studentCount];
                
                for(int i = 0; i < studentCount; i++) {
                    newAgeList[i] = ageList[i];
                    }
                    ageList = newAgeList;

                    // score 배열 늘리기
                if(studentCount == scoreList.length) {
                
                    int[] newScoreList = new int[studentCount];
                
                for(int i = 0; i < studentCount; i++) {
                    newScoreList[i] = scoreList[i];
                    }
                    scoreList = newScoreList;
                
                    }
                }
                }           

                // 다음과 같이 입력되었습니다. (정보 출력) 위 정보가 확실합니까? (Y/N)
                System.out.println("학생 정보가 등록 되었습니다.");
                System.out.println("########################");
                // 문제stringage가 숫자로만 이루어져있는지 확인

            }   else if(command.equals("2")) {
                // 학생 목록 로직 => length로 하면 모든 값이 다 출력됨!
                for(int i = 0 ; i < studentCount ; i++) {
                    String text = ""; //요건 출력문 깔끔하게 적는 꿀팁!
                    text += "이름: " + nameList[i] ;
                    text += ", 나이: " + ageList[i];
                    text += ", 점수: " + scoreList[i];
                    System.out.println(text);
                }
                // 문제(쉬움): 만약 검색된 학생 정보가 없다면, "등록된 학생이 없습니다."를 출력하세요.
                System.out.println("총 " + studentCount + "명의 학생 정보가 존재 합니다.");
                System.out.println("##########################");



            }   else if(command.equals("3")) {
                // 학생 검색 로직
                System.out.println("######### 학생 검색 로직 ########");
                System.out.println("검색할 학생의 이름 > ");
                String searchName = scanner.nextLine();
                int searchCount = 0;
                for(int i = 0 ; i < studentCount ; i++) {
                    if(nameList[i].contains(searchName)) {
                        searchCount++;
                        String text = "";
                        text += "이름: " + nameList[i];
                        text += ", 나이: " + ageList[i];
                        text += ", 점수: " + scoreList[i];
                        System.out.println(text);
                    }
                }


            }   else if(command.equals("4")) {
                // 학생 삭제 로직
                System.out.println("#### 학생 검색 ####");
                System.out.print("삭제할 학생의 이름 > ");
                String deleteName = scanner.nextLine();

                int deleteCount = 0;
                for(int i = 0 ;  i < studentCount ; i++) {
                    if(nameList[i].equals(deleteName)) {
                        //밀어 넣기
                    for(int x = i ; x < studentCount - 1 ; x++) {
                        nameList[x] = nameList[x+1];
                        ageList[x] = ageList[x+1];
                        scoreList[x] = scoreList[x+1];
                    }
                    studentCount--;
                    deleteCount++;
                    i--;
                    }
                }
                System.out.println("총 " + deleteCount + "명의 정보가 삭제 되었습니다.");
                System.out.println("#################################");



            }   else if(command.equals("5")) {
                // 학생 정보 수정 로직
                System.out.println("[테스트 로그] 학생 정보 수정 로직 수행");
            }   else if(command.equals("6")) {
                // 학생 정보 통계 로직
                System.out.println("[테스트 로그] 학생 정보 통계 로직 수행");

            }   else {
                System.out.println("번호를 잘못 입력하셨습니다.");
                System.out.println("다시 입력 바랍니다.");
            }

            System.out.println("계속 진행하시려면 enter를 입력하세요.");                
            scanner.nextLine();
            
        
        }

        // 마무리 코드
        System.out.println("프로그램을 종료합니다.");
        System.out.println("이용해주셔서 감사합니다.");

        scanner.close();
        
    }

}