public class JavaUserDefinedType {
    public static void main(String[] args) {
        // 기본 타입
        double latitude = 37.52127220511242;
        double longitude = 127.0074462890625;
        //  사용자 정의 객체 생성
        JLocation jloc = new JLocation();
        jloc.lat = latitude; // 값 대입
        jloc.lng = longitude; // 값 대입

        JLocation newLoc = jloc;
        System.out.println(newLoc.lat);
    }
}

class JLocation{
    public double lat;
    public double lng;
}
