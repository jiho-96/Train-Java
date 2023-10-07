public class Sum100 {
    public static void main(String[] args) {
        int sum = 0; // 총합 저장 변수
        int s = 1; // 값 부호를 바꿔즈는데 사용할 변수
        int num = 0;

        // 조건식 값이 true이므로 무한 반복문
        for (int i=1; true; i++, s=-s) {
            num = s*i; // 매 반복마다 s 의 값은 1, -1, 1, ...
            sum+=num;

            if (sum>=100)  // 총합이 100보다 같거나 크면 반목문 종료
                break;
        }
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}

// 1+(-2)+3+(-4)+... 일때 100이상이 되려면 몇까지 더해야하는지 구하기