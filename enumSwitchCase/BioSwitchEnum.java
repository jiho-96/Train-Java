package enumSwitchCase;

public class BioSwitchEnum {
    //메서드 선언
    public static String textInfor(PEI index, double value){
        String result = "";
        switch (index){
            case PHYSICAL: result="신체지수: "; break;
            case EMOTIONAL: result="감정지수: "; break;
            case INTELLECTUAL: result="지성지수: "; break;
            default: result="미결정: "; break;
        }
        return result + (value*100);
    }

    public static void main(String[] args) {
        PEI index = PEI.PHYSICAL;
        double value=0.86;
        System.out.println("신체 지수 주기값: " + index.getPei()); // enum을 int로 변환
        String st = textInfor(index, value);
        System.out.println(index.ordinal()); // 순서를 출력, PHYSICAL은 0번째
        System.out.println(index.name());   // enum 값 을 출력
        System.out.println(index);        // name이 자동으로 붙어서 이름이 출력
        System.out.println(index.getPei()); // textInfor static 메서드를 호출하여 문자열을 반환
    }
}
