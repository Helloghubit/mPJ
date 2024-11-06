import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PetEMR {
    static HashMap<String,memberDTO> memberMap = new HashMap<>();
    static HashMap<String,ArrayList<recordsDTO>> recordsMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("==애완 동물 진료 관리 시스템==");
            System.out.println("1. 신규 고객 정보 입력");
            System.out.println("2. 진료 기록 저장");
            System.out.println("3. 진료 기록 조회");
            System.out.println("4. 진료 기록 삭제");
            System.out.println("5. 종료");
            System.out.println("원하는 기능을 선택하세요 :");
            int num = sc.nextInt();
            if(num==5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            selectFunction(num,memberMap,recordsMap);
        }

    }

    public static void selectFunction(int num, HashMap<String,memberDTO> memberMap, HashMap<String,ArrayList<recordsDTO>> recordsMap){
        switch (num){
            case 1 :
                CRUD.createMemberDTO(memberMap);
                break;
            case 2 :
                CRUD.createRecordsDTO(memberMap,recordsMap);
                break;
            case 3 :
                CRUD.readRecordDTO(recordsMap);
                break;
            case 4 :
                CRUD.deleteRecordDTO(recordsMap);
                break;

            default :
                System.out.println("잘못된 입력입니다.");
        }
    }
}
