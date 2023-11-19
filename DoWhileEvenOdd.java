public class DoWhileEvenOdd {
    public static void showOddnEven(int n){
        int temp=n;
        do { //홀수, 짝수에 대한 각 연산을 먼저 시행
            if(temp%2==1){
                temp=temp*3+1; //홀수
            } else {
                temp/=2;  // 짝수
            }
            System.out.print("["+temp+"]");
        } while (temp!=1);
        System.out.println("\n-------------------");
    }

    public static void main(String[] args) {
        showOddnEven(122);
    }
}
