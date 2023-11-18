public class Teamperature {
    public static void main(String[] args) {
        for (int i=0; i<101; i++) { // 반복문, 초기값 0, 101보다 적은 정수까지 i 1씩 증가
            double fahrenheit=9.0/5*i+32; // for 블록변수
            System.out.printf("섭씨 %d도 = 화씨%2f도\n",i,fahrenheit);
        }
    }
}
