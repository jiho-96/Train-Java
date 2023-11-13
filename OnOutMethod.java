import java.util.Scanner;

public class OnOutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //키보드

        System.out.println("정수를 입력하세요.");
        int choice=scanner.nextInt(); // 키보드로 정수 입력
        System.out.println(choice);

        System.out.println("실수를 입력하세요.");
        double rchoice=scanner.nextDouble();
        System.out.println(rchoice);

        System.out.println("문자열을 입력하세요.");
        String schoice=scanner.next();
        System.out.println(schoice);
    }
}
