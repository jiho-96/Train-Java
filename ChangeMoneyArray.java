import java.util.Scanner;


public class ChangeMoneyArray {
    public static void main(String args[]) {
// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = {500, 100, 50, 10};
        System.out.print("금액 입력 : ");
        Scanner scanner = new Scanner(System.in);
        String strX = scanner.nextLine();
        int money = Integer.parseInt(strX);
        System.out.println("money="+money);
        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
            money = money%coinUnit[i];
        }
    }
}
