public class Conversion1 {
    public static void main(String[] args) {
        String [] names = {"Cm", "M", "Inch", "Feet", "Yard", "Mile"};
        double [] distance = {1,0.01,0.3937007874015748,0.03280839895013123,0.010936132983377079,
                              0.00000621371192237334};
        System.out.printf("\t\t");
        for (int i=0; i< names.length; i++){  // 모든 거리 단위를 출력
            System.out.printf("%s\t\t\t", names[i]);
        }
        System.out.println();
        for (int i=0; i<distance.length; i++){
            System.out.printf("%s\t", names[i]); // 거리 단위 하나를 출력
            for (int j=0; j< distance.length; j++){
                System.out.printf("%19.12f\t", distance[j]/distance[i]); // 0행은 1cm 기준 거리 환산, 1행은 1m 기준 거리 환산
            }
            System.out.println();
        }
    }
}
