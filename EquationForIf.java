// 2x+4y=10의 모든 해를 구하기, 0<=x<=10, 0<=y<=10

public class EquationForIf {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) //0<=x<=10 {
            for (int y = 0; y <= 10; y++) // 0<=y<=10{
                if (2 * x + 4 * y == 10) //2x+4y=10 {
                    System.out.println("x=" + x + ", y=" + y);
    }
}
