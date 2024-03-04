public class ArrayTest {
    public static void main(String[] args) {
        int [] score = {71, 89, 55, 25, 45, 64, 98};

        // 초기화
        int max = score[0];
        int min = score[0];

        for (int i=1; i < score.length; i++){
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값 " + max);
        System.out.println("최소값 " + min);
    }
}
