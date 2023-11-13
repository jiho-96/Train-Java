public class BioCalendar {
    // 상수, 상수값은 변경할 수 없다.
    public static final int PHYSICAL = 23; // 상수(개발자 정의)
    // public static final 예약어를 붙여 상수를 선언, 상수는 대문자 사용
    public static void main(String[] args) {
        System.out.println(PHYSICAL);    // 상수값을 변수에 대입
        int index=PHYSICAL;
        double vals=2*Math.PI/index;    // Math.PI 3.14
        System.out.println(vals+"라디안");
    }
}
