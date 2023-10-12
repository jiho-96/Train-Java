public class Palindrome {
    public static void main(String[] args) {
        int num = 34543;
        int tmp = num;

        int result = 0; // num을 거꾸로 변환해서 담을 변수

        while (tmp !=0) {
            result = result*10 + tmp%10; // 기존 결과에 10을 곱해서 더함
            tmp /= 10;
        }
        if (num==result)
            System.out.println(num + "는 회문수 입니다");
        else
            System.out.println(num + "는 회문수가 아닙니다");
    }
}

/*
회문수 : 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말함
숫자를 역순으로 바꾸기 -> 10으로 나눠가면서 10으로 나머지 연산을 하는 방식으로 각 자리를 얻음
다만 그냥 더하는 게 아니라 10을 곱해가면서 더함*/
