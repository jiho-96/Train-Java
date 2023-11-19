public class ForEvenOdd {
    public static void showOddnEvenf(int n) {
        int temp = n;
        for (;temp!=1;) { // for(초기값;조건;스텝), 초기값, 조건 스텝을 모두 제거하고 사용할 수 있음, while이 됨
            if (temp % 2 == 1) { //홀수
                temp=temp*3+1;
            } else { //짝수
                temp /= 2;
            }
            System.out.print("[" + temp + "]");
        }
        System.out.println("\n---------------------");
    }
    public static void main(String[] args){
        showOddnEvenf(122);
    }
}

