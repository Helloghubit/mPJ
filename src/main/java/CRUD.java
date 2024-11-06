import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CRUD {
    public static Scanner sc = new Scanner(System.in);
    public static memberDTO m = new memberDTO();
    public static recordsDTO r = new recordsDTO();
    public static void createMemberDTO(HashMap<String,memberDTO> memberMap){
        System.out.println("전화 번호 : ");
        String num = sc.nextLine();
        if(memberMap.containsKey(num)){
            System.out.println("이미 등록된 전화 번호 입니다.");
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

        System.out.println("출생 년도(yyyy) : ");
        m.setYear(sc.nextInt());
        sc.nextLine();

        System.out.println("고객 정보가 추가되었습니다.");
        memberMap.put(m.getNumber(), m);
    }

    public static void createRecordsDTO(HashMap<String,memberDTO> memberMap, HashMap<String,ArrayList<recordsDTO>> recordsMap){
        System.out.println("전화 번호를 입력하시오 : ");
        String num = sc.nextLine();
        recordsDTO r = new recordsDTO();

        if(!memberMap.containsKey(num)){
            System.out.println("없는 번호입니다.");
            return;
        }else {
            memberDTO m = memberMap.get(num);
        }
        r.setYear(m.getYear());
        r.setCity(m.getCity());
        r.setBreed(m.getBreed());
        r.setName(m.getName());
        r.setPetName(m.getPetName());
        r.setNumber(m.getNumber());

        System.out.println("진료일을 입력하세요 : ");
        r.setDate(sc.nextLine());
        System.out.println("진료 내용을 입력하세요 : ");
        r.setSymptoms(sc.nextLine());
        System.out.println("진료 기록이  저장되었습니다.");
        if(recordsMap.containsKey(num)) {
            recordsMap.get(num).add(r);
        }else{
            ArrayList<recordsDTO> arr = new ArrayList<>();
            arr.add(r);
            recordsMap.put(num,arr);
        }
    }

    public static void readRecordDTO(HashMap<String,ArrayList<recordsDTO>> recordsMap){
        System.out.println("전화번호를 입력하세요 :");
        String num = sc.nextLine();
        ArrayList<recordsDTO> arr = recordsMap.get(num);
        if (recordsMap.containsKey(num)) {
            for (int i = 0; i < arr.size(); i++) {
                recordsDTO r = arr.get(i);
                System.out.println("[" + r.getPetName() + "]의 진료 기록");
                System.out.println("    진료일 : " + r.getDate());
                System.out.println("    진료 내용 : " + r.getSymptoms());
                System.out.println("    소유주 이름 : " + r.getName());
                System.out.println("    동물 이름 : " + r.getPetName());
                System.out.println("    주소 : " + r.getCity());
                System.out.println("    종류 : " + r.getBreed());
                System.out.println("    출생연도 : " + r.getYear());
            }
        }else
            System.out.println("해당 전화번호를 가진 진료 기록이 없습니다.");
    }

    public static void deleteRecordDTO(HashMap<String,ArrayList<recordsDTO>> recordsMap){
        System.out.println("전화번호를 입력하세요 :");
        String num = sc.nextLine();
        recordsMap.remove(num);
        System.out.println("진료 기록이 삭제되었습니다.");
    }
}
