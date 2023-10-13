/* 두개의 생성자와 info() 추가해서 실행 */
public class SutdaConstructor {
    public static void main(String[] args) {
        Sutda1 card1 = new Sutda1(3, false);  // 객체를 생성할 때 두개의 생성자를 사용했으므로 두 개의 생성자를 정의해야 함
        Sutda1 card2 = new Sutda1();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class Sutda1 {
    int num;
    boolean isKwang;

    Sutda1(){
        this(1, true); // Sutda(1, true) 호출
    }
    Sutda1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    String info() {  // 숫자를 문자열로 반환한다, 광(true)인 경우 K를 덧붙임
        return num + (isKwang? "K" : "");
    }
}
