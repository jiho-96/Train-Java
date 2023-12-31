public class JSortMain {
    public static void main(String[] args) {
        int [] m = {24, 320, 45, 66, 32, 93, 124, 227, 460, 11, 58, 183, 293, 397, 62, 246, 312};
        int [] n = new int[m.length];
        System.arraycopy(m, 0, n, 0, m.length); // 배열 m을 배열 n에 복사함. m과 n은 같은 원소들을 갖지만 다른 배열
        JSort.print(n);  // 일차원 배열을 출력
        long a = System.nanoTime();  // 현재 시간을 나노세컨으로 구함
        JSort.BubbleSort(n); // 버블 정렬
        //Sort.InsertSort(n);
        long b = System.nanoTime(); // 정렬 후 시간
        System.out.println((b-a)+"nano sec"); // 정렬 후 시간에서 정렬 전 시간을 빼서 걸린 시간 구함, 10의 -9승
        JSort.print(n);
    }
}
