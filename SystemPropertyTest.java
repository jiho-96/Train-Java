import java.util.Iterator;
import java.util.Map;

public class SystemPropertyTest {
    public static void main(String[] args) {
        long namotiom=System.nanoTime();
        for(int i=0; i<100000;i++){  // 10만 번 출력 반복
            System.out.print("");
        } // 10만번 반복 후 시간을 나노세컨드로 반환
        long manotime2 = System.nanoTime(); // 10^9 nano java 추가
        System.out.println(System.getenv("JAVA_HOME")); // 환경변수
        // 모든 env 구하기
        Map<String, String> map = System.getenv(); // 환경변수
        Iterator<String> iter = map.keySet().iterator(); // Map에서 키 얻기
        int j=0;
        while (iter.hasNext()) {
            String keys=iter.next(); // 키값을 얻음
            System.out.println((++j+"")+keys+":"+map.get(keys)); // 키값에 대한 밸류
        }
    } //main
}
