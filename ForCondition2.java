import java.util.ArrayList;
import java.util.List;

public class ForCondition2 {
    public static void main(String[] args) {
        List<Integer>ilist=new ArrayList<>(); // list는 int타입이므로 랩퍼 클래스 Integer 사용
        int s=0;
        for (int i=1;i<=10;i++){ // 1~10 사이의 정수 List에 저장
            ilist.add(i);
        }
        for (int m:ilist){
            if(m%2==1){ // 홀수인지 판별
                s+=m*m; // 홀수이면 제곱의 합을 구함
                System.out.printf("%d\t", m*m);
            }
        }
        System.out.println();
        System.out.println("1~10 사이의 홀수에 대한 제곱합: " + s);
    }
}
