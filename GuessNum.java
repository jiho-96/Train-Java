import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) +1; // Math.random : 0~1사이의 값, 0 일 수 도 있으니 100 곱하기 1 더한 후 정수
        int input = 0;  // 입력 저장 공간
        int count = 0;  // 시도횟수 카운트

        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            System.out.print("1~100 사이의 값 입력 : ");
            input = scanner.nextInt(); // 입력받은 값 저장

            if(answer>input){
                System.out.println("더 큰 수를 입력하세요");
            } else if(answer<input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다");
                System.out.println(count + "번 시도했습니다");
                break;
            }
        } while (true); // 무한 반복문
    }
}

/*
1~100 사이의 숫자 맞추기
*/
