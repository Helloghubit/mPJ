import java.util.ArrayList;
import java.util.Scanner;

public class PetEMR {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("애완 동물 진료 관리 시스템");
        System.out.println("1. 신규 고객 정보 입력");
        System.out.println("2. 진료 기록 저장");
        System.out.println("3. 진료 기록 조회");
        System.out.println("4. 진료 기록 삭제");
        System.out.println("5. 종료");
        System.out.println("원하는 기능을 선택하세요 :");
        int num = 0;

        while(num != 5){
            num = sc.nextInt();
            selectFunction(num);
        }

    }

    public static memberDTO selectFunction(int num, ArrayList<memberDTO> memberDTOS){
        switch (num){
            case 1 :
                CRUD.createMemberDTO(memberDTOS);
                break;
            case 2 :

                break;
            case 3 :
                break;
            case 4 :
                break;
            default:
                break;
        }
    }
}
