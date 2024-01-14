public class ExchangeRate2 {
    public static void main(String[] args) {
        FixerRate finance = new FixerRate();
        finance.base = "USD";
        finance.date = "2017-06-08";
        finance.usd = 1;
        finance.jpy = 110.22;
        finance.cny = 6.7978;
        finance.krw = 1123.3;
        finance.eur = 0.89055;
        System.out.println(finance);
        double krw = 1000000;
        double ratio = finance.krw;
        double result = ExchangeRate2.calculate(krw,ratio);
        System.out.printf("%.2fKRW은 %.2f%s 입니다.\n", krw, result, finance.base);
    }
    public static double calculate(double krwMoney, double exchangeRatio){
        return krwMoney/exchangeRatio;
    }
}
