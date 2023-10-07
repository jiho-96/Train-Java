public class TotalSum {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i=1; i <=10; i++) {
            sum += i;
            totalSum += sum;
        }
        System.out.println("totalSum="+totalSum);
    }
}

/*
덧셈 문제 1+(1+2)+(1+2+3)+(1+2+3+4)+ ... +(1+2+3+4+...+10)
*/
