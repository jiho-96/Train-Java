public class EvenOdd {
    public static void showOddEvenw(int n) {
        int temp=n;
        while (temp!=1){ // 입력받은 temp가 1이 될 때까지 반복
            if (temp%2==1) { //홀수
                temp=temp*3+1; // 홀수이면 3배한 값에 1을 더함
            } else {
                temp/=2;  // 짝수이면 2로 나눔
            }
            System.out.print("[" + temp + "]");
        }
        System.out.println("\n-----------------");
    }
    public static void main(String[] args) {
        showOddEvenw(122);
    }
}
