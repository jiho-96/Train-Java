public class CastingTest {
    public static void main(String[] args) {
        Cars cars = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        cars = fe;
        // cars.water(); //Cars 타입의 참조변수로는 water() 호출할 수 없음
        fe2 = (FireEngine) cars; // 자손타입 <- 조상타입
        fe2.water();
    }
}

class Cars {
    String color;
    int door;

    void drive() {
        System.out.println("drive~~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Cars {
    void water() {
        System.out.println("water!!!");
    }
}