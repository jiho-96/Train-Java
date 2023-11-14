public class UseMemberMtd {
    public static final int PHYSICAL = 23; // static 변수 생성 없이 사용
    // 멤버 메서드 선언
    public double getBioRhythm(long days, int index, int max){
        return max*Math.sin((days % index) *2*Math.PI/index);
    }

    public static void main(String[] args) {
        int days=1200;
        UseMemberMtd member = new UseMemberMtd(); // 객체를 생성
        // 멤버 메서드 호출
        double phyval=member.getBioRhythm(days, PHYSICAL, 100);
        System.out.printf("신체 지수 %1$.2f 입니다.\n", phyval);
    }
}

// 메서드 앞에 static이 붙으면 static 메서드(클래스 메서드)라고 하고, static이 붙지 않으면 멤버 메서드라고 함
// 멤버 메서드는 new 예약어를 이용해 객체를 생성해야 함