import java.util.Arrays;

public class Lotto6Num {
    private int[] lots; // 6개의 정수를 저장하기 위한 배열
    private int base; // 기본 공의 개수 45
    private int ballNum; // 공 저장 개수 6

    public Lotto6Num(int base, int ballNum) {
        this.base = base;
        this.ballNum = ballNum;
        // 배열 생성
        lots = new int[ballNum];
    }

    public Lotto6Num() { // 기본 생성자로 로또 공의 개수 45, 배열의 크기 6
        this(45, 6);
    }

    public void print() { // 1차원 배열을 출력, 5개까지는 ,를 붙이고 6번째는 붙이지 않음
        for (int i = 0; i < lots.length; i++) {
            if (i == lots.length - 1) {
                System.out.printf("%d", lots[i]);
            } else {
                System.out.printf("%d,", lots[i]);
            }
        }
        System.out.println();
    }

    private int rand() {
        return (int) (Math.random() * base) + 1; // 1~45 사이 임의의 정수를 만듬
    }

    public boolean contain(int n) {
        for (int i = 0; i < lots.length; i++) {
            if (lots[i] == n) {   // 입력받은 n이 배열에 포함되어 있는지 판단
                return true;
            }
        }
        return false;
    }

    public void make() {
        Arrays.fill(lots, 0); // 배열을 0으로 초기화
        int count = 0;
        while (count != ballNum) {  // 6개 채워질때까지 반복
            int temp = rand(); // 1~45 임의의 정수 만듬
            if (!contain(temp)) { // 정수가 배열에 포함되어 있지 않으면 배열에 저장하고 저장된 개수를 증가시킴
                lots[count++] = temp;
            }
        }
        Arrays.sort(lots); // 배열을 증가순으로 정렬
    }

    public int[] getLots() {
        return lots;
    }
}