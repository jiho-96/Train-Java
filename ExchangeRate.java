public class ExchangeRate {
    public static void main(String[] args) {
        final double USD=1113.00; // 상수값
        final double JPY=10.0624; // 상수값
        double krw = 1000000; // 변수값
        double result = krw/USD; // 연산
        System.out.printf("한화 %.2f원은 미국 달러로 %.2f달러입니다.\n",krw,result);
        result=krw/(JPY); // 일본 100d엔
        System.out.printf("한화 %.2f원은 일본 엔화로 %.2f엔입니다.\n",krw,result);
    }
}
