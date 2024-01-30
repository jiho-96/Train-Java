import java.util.Scanner;

public class ExchangeRate3 {
    public static void main(String[] args) {
        double USD = 1113.00; // 변수값
        double JPY = 10.0624; // 변수값
        double CNY = 164.1020; // 변수값
        double krw = 1000000; // 환전하려는 금액

        System.out.println("USD로 환전하려면 1, JPY로 환전하려면 2, CNY로 환전하려면 3을 입력");
        Scanner scanner = new Scanner(System.in); // 입력
        int choice = scanner.nextInt(); // 정수 입력
        double result = 0.0; // 변수 선언
        switch (choice){
            case 1:
                result = calculate(krw, USD);
                System.out.printf("한화 %.2f원은 %.2f달러입니다.\n", krw,result);
                break;

            case 2:
                result = calculate(krw, JPY);
                System.out.printf("한화 %.2f원은 %.2f엔입니다.\n", krw,result);
                break;

            case 3:
                result = calculate(krw, CNY);
                System.out.printf("한화 %.2f원은 %.2f위안입니다.\n", krw,result);
                break;
            default:
                System.out.println("환전할 수 없습니다.");
                break;
        }
    }
    public static double calculate(double krwMoney, double exchangeRatio){
        return krwMoney/exchangeRatio;
    }
}
