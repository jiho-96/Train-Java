public class JavaMathTrain {
    public static int sumEach(int n){  // 각자리의 합을 구함
        int tot=0;
        while (n!=0){
            tot+=n%10; // 3->2->1, 일의 자리를 구하고 더함
            n/=10;  // 자리수를 줄임
        }
        return tot;
    }
    public static boolean isPrime(int n){
        boolean isS = true;
        for (int i=2; i<= (int)Math.sqrt(n); i++){ // 소수인지 판단하기 위해 제곱근을 구하고 2~제곱근 사이의 값으로 나누어 떨어지면 소수가 아님
            if (n%i==0){
                isS=false;
                break;
            }
        }
        return isS;
    }
    public static int sumSmith(int n){
        int tot=0;
        int a=2;
        while (n!=1){
            if (n%a==0){
                tot+=sumEach(a);   // 소인수 분해를 하고 소수가 구해지면 소수에 대한 각 자리의 합을 구함
                n/=a;
            } else {
                a++;
            }
        }
        return tot;
    }

    public static void printPrimeDivide2(int n) {
        int a=2;
        while (n!=1){
            if (n%a==0){
                if (n/a==1){
                    System.out.println(a);
                } else {
                    System.out.print(a+"x");
                }
                n/=a;
            }else {
                a++;
            }
        }
    }
}