public class FinalCardTest {
    public static void main(String[] args) {
        CardF c = new CardF("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}

class CardF{
    final int NUMBER; // 상수지만 선언과 함께 초기화 하지 않고
    final String KIND; // 생성자에서 단 한번만 초기화할 수 있음
    static int width = 100;
    static int height = 250;

    CardF(String kind, int num){
        KIND = kind; // 매개변수로 넘겨받은 값을 초기화
        NUMBER = num;
    }

    CardF() {
        this("HEART", 1);
    }
    public String toString(){
        return KIND + " " + NUMBER;
    }
}