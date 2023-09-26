public class E5 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for(int i=1; i <=10; i++) {
            sum += i;
            totalSum += sum;
        }
        System.out.println("totalSum="+totalSum);
    } // main
}

//  1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합