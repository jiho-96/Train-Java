public class Smith {
    public static void printSmith(int t1, int t2) {
        for (int i = t1; i < t2; i++) {
            if (!JavaMathTrain.isPrime(i) &&
                    JavaMathTrain.sumEach(i) == JavaMathTrain.sumSmith(i)) {  // 스미스
                System.out.printf("%d는 스미스 수", i);
                JavaMathTrain.printPrimeDivide2(i);
            }
        }
    }

    public static void main(String[] args) {
        // 10000~20000 사이의 스미스 수
        printSmith(10000, 20000);
    }
}
