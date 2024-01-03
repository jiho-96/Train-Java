public class JSort2 {
    public static void QuickSort(int[] nn, int start, int end) {
        // 각 위치의 값을 구함
        int left = start;
        int right = end;
        int mid = nn[(start + end) / 2];
        do {
            // A1
            while ((nn[left] < mid) && (left < end)) { //왼쪽부터 오른쪽으로 배열 mid 값보다 크거나 같은 값을 찾을 때까지 left를 증가
                left++;
            } // A2
            while ((mid < nn[right]) && (right > start)) { // 오른쪽에서 왼쪽으로 배열 mid 값보다 작거나 같은 값을 찾을 때까지 right를 감소
                right--;
            }
            // B
            if (left <= right) { // 해당 조건일 경우 위에서 찾은 값을 서로의 값으로 변경
                int temp = nn[left];
                nn[left] = nn[right];
                nn[right] = temp;
                left++;
                right--;
            }
        } while (left < right);
        // C
        if (start < right) {
            QuickSort(nn, start, right);
        }
        // D
        if (left < end) {
            QuickSort(nn, left, end);
        }
    }

    public static void QuickSort(int[] n) {
        QuickSort(n, 0, n.length - 1);
    }

    public static void print(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}