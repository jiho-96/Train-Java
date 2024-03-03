class Data2 { int x; }
public class PrimitiveParam {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x){ // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
