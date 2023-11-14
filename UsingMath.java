public class UsingMath {
    public static final int PHYSICAL = 23; // 상수

    public static void main(String[] args) {
        int index=PHYSICAL;   // 상수값을 변수에 대입
        int days=1200;
        double phyval=100*Math.sin((days % index)*2*Math.PI/index);
        System.out.printf("신체 지수 %1$.2f 입니다.\n",phyval);
    }
}
