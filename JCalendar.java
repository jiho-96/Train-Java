public class JCalendar {
    public boolean isLeapYear(int year) { // 멤버 메서드
        boolean isS = false;
        // 입력된 연도가 4의 배수이지만 100의 배수는 아니며 400의 배수
        if( ((year%4==0)&&(year%100!=0))||(year%400==0)){
            isS=true;
        }
        return isS;
    }

    public static void main(String[] args) {
        JCalendar hc = new JCalendar(); // 객체 생성
        System.out.println(hc.isLeapYear(2017));
    }
}
