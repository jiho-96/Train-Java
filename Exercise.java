public class Exercise  {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num > 0 ? " ":(num < 0 ? " " : "0"));
    }
}

/* 삼항연산자를 사용하면 2가지 경우의 수를 처리할 수 있음. 삼항연산자에 삼항연산자를 포함시키면 3가지 경우의 수를 처리할 수 있다
num의 값이 0보다 크면 양수 출력하고 끝나지만, 0보다 작거나 같으면 괄호완의 삼항연산자가 수행되고 0보다 작으면
음수가 출력 그렇지 않으면 0이 출력
 */