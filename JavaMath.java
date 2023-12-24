public class JavaMath {
    public static void printDivide(int n) {  // 약수를 출력, 정수로 나누어 떨어지는 수
        if (n == 1) {
            System.out.println("[1]");  // 1의 약수는 1뿐이므로 1출력
        } else {  // 2 이상은 반드시 1로 시작
            System.out.printf("[1,");
            for (int i = 2; i < n; i++) {  // 정수 n에 대하여 약수를 구하기 위해 2~n1로 나눔
                if (n % i == 0) {  // 정수 n을 2~n-1로 나누어 떨어지면 약수
                    System.out.printf("%d,", i);
                }
            }
            System.out.println(n + "]"); // 정수 n 자신도 약수
        }
    }

    public static void printPrimeDivide(int n) { // 소인수 분해 과정
        int a = 2; // 2부터 나누기
        while (n != 1) { // n이 1이 될 때까지 반복
            if (n % a == 0) { // n이 a로 나누어 떨어지면 소수로 나누어 떨어지므로 소인수 분해 과정
                if (n / a == 1) { // 몫이 1이면 n과 a가 같음
                    System.out.println(a);
                } else {
                    System.out.print(a + "x");
                }
                n /= a; // 소수로 나눔
            } else { // 나누어 떨어이지지 않으면 a의 값을 1 증가 시킴
                a++;
            }
        }
    }

    public static void main(String[] args) {
        printDivide(194560);
        printPrimeDivide(194560);
    }
}