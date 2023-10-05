public class TwoDimArray {
    public static void main(String[] args)
    {   // 2차원 배열 생성
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float avg = 0;
        for(int i=0; i < arr.length;i++) {
            for(int j=0; j < arr[i].length;j++) {
                total += arr[i][j];
            }
        }
        avg = total /(float)(arr.length * arr[0].length);
        System.out.println("총합 = "+total);
        System.out.println("평균 = "+avg);
    }
}
