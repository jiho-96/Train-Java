public class Conversion2 {
    public static final String [] names = {"Cm", "M", "Inch", "Feet", "Yard", "Mile"};
    public static final double [] distance = {1,0.01,0.3937007874015748,0.03280839895013123,
                                              0.010936132983377079, 0.00000621371192237334};
    // 2차원 배열로 동적(new)하는 방법
    public static double [][] convert(){ // 6종류에 대한 환산표를 2차원 배열로 만듬
        double [][] mm = new double[distance.length][distance.length]; // 6x6 2차원 배열 생성
        for (int i=0; i< distance.length; i++){
            for (int j=0; j< distance.length; j++){
                mm[i][j] = distance[j]/distance[i]; // 2차원 배열 대입
            }
        }
        return mm;
    }

    public static void main(String[] args) {
        //2차원 환산표 작성
        double [][] convDistance = convert(); // 환산해서 만든 2차원 배열
        System.out.printf("\t\t");
        for (int i=0; i< names.length; i++){
            System.out.printf("%s\t\t\t", names[i]); // 거리 단위 이름 출력
        }
        System.out.println();
        for (int i=0; i<convDistance.length; i++){
            System.out.printf("%s\t", names[i]);
            for (int j=0; j<convDistance[i].length; j++){
                System.out.printf("%19.12f\t", convDistance[i][j]); // 거리 환산 2차원 배열 출력
            }
            System.out.println();
        }
        // 계산 확인
        double value = 100000; // 100000cm를 다른 단위로 환산
        int selectIndex=0; // cm
        double cm = value*convDistance[selectIndex][0];
        double m = value*convDistance[selectIndex][1];
        double inch = value*convDistance[selectIndex][2];
        double feet = value*convDistance[selectIndex][3];
        double yard = value*convDistance[selectIndex][4];
        double mile = value*convDistance[selectIndex][5];
        System.out.printf("%fcm =\t%fm =\t%finch =\t%ffeet =\t%fyard =\t%fmile\n", cm,m,inch,feet,yard,mile);
    }
}
