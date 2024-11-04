import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CRUD {
    public static HashMap<String,ArrayList<memberDTO>> map = new HashMap<String,ArrayList<memberDTO>();
    public static Scanner sc = new Scanner(System.in);
    public static memberDTO m = new memberDTO();
    public static void createMemberDTO(ArrayList<memberDTO> memberDTOS){
        System.out.println("전화번호 : ");
        String num = sc.nextLine();
        if(map.containsKey(num)){
            System.out.println("이미 등록된 전화번호 입니다.");
            return;
        }else{
            m.setNumber(num);
        }

        System.out.println("소유주 이름 :");
        m.setName(sc.nextLine());

        System.out.println("동물 이름 : ");
        m.setPetName(sc.nextLine());

        System.out.println("주소 : ");
        m.setCity(sc.nextLine());

        System.out.println("종류 : ");
        m.setBreed(sc.nextLine());
        sc.nextLine();

        System.out.println("출생 년도(yyyy) : ");
        m.setYear(sc.nextInt());

        System.out.println("고객 정보가 추가 되었습니다.");
        memberDTOS.add(m);
    }

    public static void createRecordsDTO(ArrayList<memberDTO> memberDTOS){
        
    }
}
