public class ArraySum {
    public static void main(String[] args) {
        //배열 생성
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        // 배열 길이만큼 반복
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; //10+20+30+40+50=150
        }
        System.out.println("sum=" + sum);
    }
}
