import java.util.ArrayList;
import java.util.List;

public class LottoList {
    public static void main(String[] args) {
        List<Integer> ilsit = new ArrayList<>();
        // 넣기
        for (int i = 1; i <= 10; i++) { //1~10까지 리스트에 저장
            ilsit.add(i);
        }
        // 가져오기
        for (int i = 0; i < ilsit.size(); i++) {
            int m = ilsit.get(i);
            System.out.printf("%d\t", m);
        }
        System.out.println();
    }
}
