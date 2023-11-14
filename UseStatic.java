public class UseStatic {
    public static final int PHYSICAL = 23; // 상수
    // static 메서드 선언
    public static double getBioRhytm(long days, int index, int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }

    public static void main(String[] args) {
        int days=1200;
        //메서드 호출
        double phyval=getBioRhytm(days, PHYSICAL, 100);
        System.out.printf("신체 지수 %1$.2f 입니다.\n",phyval);
    }
}
//static 메서드는 객체 생성 없이 호출할 수 있음
