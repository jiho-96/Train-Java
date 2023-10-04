// 자리수 더하기 123 -> 1+2+3 = 6 출력

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        System.out.print("숫자 입력 : ");
        Scanner scanner = new Scanner(System.in);
        String strX = scanner.nextLine();
        int num = Integer.parseInt(strX);
        int sum = 0;
        while(num > 0) {
            sum += num%10;
            num /= 10;
        }
        System.out.println("sum="+sum);
    }
}
