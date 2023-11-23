import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondtion {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s=0;
        for (int i=1;i<=10;i++){ // 1~10 사이의 정수 저장
            ilist.add(i);
        }
        //stream filter map collect
        ilist=ilist.stream()
                .filter(i->i%2==1)  // filter(수 -> 홀수)
                .map(i->i*i)  // map(수 -> 수*수)
                .collect(Collectors.toList()); // 홀수에 대하여 제곱한 수를 새로운 리스트에 저장
        ilist.forEach(i->{
            System.out.printf(i+"\t");
        });
        System.out.println();
        //stream reduce
        s=ilist.stream().reduce(0,Integer::sum);  // 홀수 제곱수의 합을 구함
        System.out.println("1~10 사이의 홀수에 대한 제곱합: " + s);
    }
}
