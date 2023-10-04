// 피보나치수열의 10번째 수 구하기

public class Fibonnaci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1; // 시작의 첫 두 숫자를 1, 1
        int num3 = 0; // 세번째 값
        System.out.print(num1+","+num2);
        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2; // 세번째 값은 첫번째와 두번째 값 더하기
            System.out.print(","+num3); // 세 번째 수열 출력
            num1 = num2; // 두 번째 수열을 첫 번째 값으로
            num2 = num3; // 세 번째 수열을 두 번째 값으로
        }
    }
}