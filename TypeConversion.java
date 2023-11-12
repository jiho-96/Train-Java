public class TypeConversion {
    public static void main(String[] args) {
        String slat = "37.52127220511242   ";
        // 공백제거 후 double 타입으로 변환
        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}
