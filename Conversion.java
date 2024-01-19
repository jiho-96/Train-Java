// 일차원 배열과 반목문 for
public class Conversion {
    public static void main(String[] args) {
        String [] names = {"Cm", "M", "Inch", "Feet", "Yard", "Mile"}; // 문자열 1차원 배열을 선언하고 초기회
        for (int i=0; i<names.length; i++){ // 길이 단위를 출력
            System.out.printf("%s\t\t\t", names[i]);
        }
        System.out.println();
        for (String ss: names){ // 향상된 for 사용
            System.out.printf("%s\t\t\t", ss);
        }
        System.out.println();
    }
}
